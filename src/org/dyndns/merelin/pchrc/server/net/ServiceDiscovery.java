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
    private static final long JmDNS_DEFAULT_TIMEOUT = 6000;

    // Known Popcorn Hour A-400 types
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

        synchronized (this) {
            try {
                wait(JmDNS_DEFAULT_TIMEOUT);
            } catch (InterruptedException e) {
                // Ignore
            }
        }

//        jmdns = JmDNS.create();
//
//        for (ServiceInfo info : jmdns.list(PCH_TYPE)) {
//            for (InetAddress address : info.getInetAddresses()) {
//                callback.resolved(new Host(address));
//            }
//        }
//
//        jmdns.close();
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
            callback.added(new Host(address));
        }
    }

    public void serviceRemoved(ServiceEvent event) {
        ServiceInfo info
            = event.getDNS().getServiceInfo(event.getType(), event.getName());
        for (InetAddress address : info.getInetAddresses()) {
            callback.removed(new Host(address));
        }
    }

    public void serviceResolved(ServiceEvent event) {
        for (InetAddress address : event.getInfo().getInetAddresses()) {
            callback.resolved(new Host(address));
        }

        synchronized (this) {
            notify();
        }
    }

    public static void main(String[] args) throws IOException {
        long st = System.currentTimeMillis();
        DiscoveryCallback callback = new DiscoveryCallback() {
            public void added(Host host) {
                System.out.println("ADDED:    " + host);
            }

            public void resolved(Host host) {
                System.out.println("RESOLVED: " + host);
            }

            public void removed(Host host) {
                System.out.println("REMOVED:  " + host);
            }
        };
        new ServiceDiscovery(callback);
        long et = System.currentTimeMillis();

        System.out.println("Duration: " + (et - st) + "ms");
    }
}
