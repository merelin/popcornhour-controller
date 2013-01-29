package org.dyndns.merelin.pchrc.server;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.dyndns.merelin.pchrc.client.DiscoveryService;
import org.dyndns.merelin.pchrc.server.net.DiscoveryCallback;
import org.dyndns.merelin.pchrc.server.net.Host;
import org.dyndns.merelin.pchrc.server.net.ServiceDiscovery;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class DiscoveryServiceImpl extends RemoteServiceServlet
        implements DiscoveryCallback, DiscoveryService {

    private final Set<Host> hosts = new HashSet<Host>();

    public void added(Host host) {
        synchronized (hosts) {
            hosts.add(host);
        }
    }

    public void resolved(Host host) {
        synchronized (hosts) {
            hosts.add(host);
        }
    }

    public void removed(Host host) {
        synchronized (hosts) {
            hosts.remove(host);
        }
    }

    public String[] discover() {
        // Will return immediately after the first discovered host
        try {
            new ServiceDiscovery(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Wait extra second for other hosts
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Ignore
        }

        synchronized (hosts) {
            String[] array = new String[hosts.size()];
            int i = 0;
            for (Host h : hosts) {
                array[i++] = h.toString();
            }

            return array;
        }
    }
}
