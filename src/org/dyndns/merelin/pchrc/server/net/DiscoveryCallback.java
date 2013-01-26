package org.dyndns.merelin.pchrc.server.net;

public interface DiscoveryCallback {
    public void added(Host host);
    public void resolved(Host host);
    public void removed(Host host);
}
