package org.dyndns.merelin.pchrc.server.net;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.jmdns.ServiceTypeListener;

public class ServiceDiscovery implements ServiceListener, ServiceTypeListener {
    private static final List<String> PCH_TYPES = Arrays.asList(new String[] {
            "_syb._tcp.local.", "_airplay._tcp.local.", "_raop._tcp.local."
    });

    private final DiscoveryCallback callback;
    private final JmDNS jmdns;

    public ServiceDiscovery(DiscoveryCallback callback) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        this.callback = callback;
        jmdns = JmDNS.create();
        jmdns.addServiceTypeListener(this);
    }

    public void serviceTypeAdded(ServiceEvent event) {
        if (PCH_TYPES.contains(event.getType())) {
            jmdns.addServiceListener(event.getType(), this);
        }
    }

    public void subTypeForServiceTypeAdded(ServiceEvent event) {
        if (PCH_TYPES.contains(event.getType())) {
            jmdns.addServiceListener(event.getType(), this);
        }
    }

    public void serviceAdded(ServiceEvent event) {
        ServiceInfo info
            = event.getDNS().getServiceInfo(event.getType(), event.getName());
        for (InetAddress address : info.getInetAddresses()) {
            callback.added(address.getHostAddress(), address.getHostName());
        }
    }

    public void serviceRemoved(ServiceEvent event) {
        ServiceInfo info
            = event.getDNS().getServiceInfo(event.getType(), event.getName());
        for (InetAddress address : info.getInetAddresses()) {
            callback.removed(address.getHostAddress(), address.getHostName());
        }
    }

    public void serviceResolved(ServiceEvent event) {
        for (InetAddress address : event.getInfo().getInetAddresses()) {
            callback.resolved(address.getHostAddress(), address.getHostName());
        }
    }

    public static void main(String[] args) throws IOException {
        DiscoveryCallback callback = new DiscoveryCallback() {
            public void added(String ip, String hostname) {
                System.out.println("ADDED:    " + ip + " -> " + hostname);
            }

            public void resolved(String ip, String hostname) {
                System.out.println("RESOLVED: " + ip + " -> " + hostname);
            }

            public void removed(String ip, String hostname) {
                System.out.println("REMOVED:  " + ip + " -> " + hostname);
            }
        };
        new ServiceDiscovery(callback);

        for (;;) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
