package org.dyndns.merelin.pchrc.server.net;

import java.net.InetAddress;

public class Host {
    private final String ip;
    private final String name;

    public Host(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

    public Host(InetAddress address) {
        this(address.getHostAddress(), address.getHostName());
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        return (ip == null ? 0 : ip.hashCode())
                ^ (name == null ? 0 : name.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Host)) {
            return false;
        }

        Host h = (Host) obj;
        return ((ip == null ? h.ip == null : ip.equals(h.ip))
                && (name == null ? h.name == null : name.equals(h.name)));
    }

    public String toString() {
        return name + "/" + ip;
    }
}
