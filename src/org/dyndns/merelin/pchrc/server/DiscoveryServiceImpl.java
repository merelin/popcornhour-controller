package org.dyndns.merelin.pchrc.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.client.DiscoveryService;
import org.dyndns.merelin.pchrc.server.net.DiscoveryCallback;
import org.dyndns.merelin.pchrc.server.net.ServiceDiscovery;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class DiscoveryServiceImpl extends RemoteServiceServlet
        implements DiscoveryCallback, DiscoveryService {

    private final List<String> devices = new ArrayList<String>();
    private ServiceDiscovery service;

    public DiscoveryServiceImpl() {
        try {
            service = new ServiceDiscovery(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void added(String ip, String hostname) {
        String s = ip + '/' + hostname;
        if (!devices.contains(s)) {
            devices.add(s);
        }

        System.out.println("ADDED:    " + ip + " -> " + hostname);
    }

    public void resolved(String ip, String hostname) {
        String s = ip + '/' + hostname;
        if (!devices.contains(s)) {
            devices.add(s);
        }

        System.out.println("RESOLVED: " + ip + " -> " + hostname);
    }

    public void removed(String ip, String hostname) {
        devices.remove(ip + '/' + hostname);

        System.out.println("REMOVED:  " + ip + " -> " + hostname);
    }

    public String[] discover() {
        return devices.toArray(new String[devices.size()]);
    }
}
