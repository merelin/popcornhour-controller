package org.dyndns.merelin.pchrc.server.net;

import java.io.IOException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class ServiceDiscovery {
    private static final String[] TYPES = {
        "_airplay._tcp.local.", "_syb._tcp.local."
    };

    private static class Listener implements ServiceListener {
        public void serviceAdded(ServiceEvent event) {
            System.out.println("ADD: " + event.getName() + "." + event.getType());
        }

        public void serviceRemoved(ServiceEvent event) {
            System.out.println("REMOVED: " + event.getName() + "." + event.getType());
        }

        public void serviceResolved(ServiceEvent event) {
            System.out.println("RESOLVED: " + event.getName() + "." + event.getType());
        }
    }

    public ServiceDiscovery() throws IOException {
        Listener listener = new Listener();
        JmDNS jmdns = JmDNS.create();
        for (String type : TYPES) {
            jmdns.addServiceListener(type, listener);
        }
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jmdns.close();
    }
}
