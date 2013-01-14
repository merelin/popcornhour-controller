package org.dyndns.merelin.pchrc.server.net;

public interface DiscoveryCallback {
    public void added(String ip, String hostname);
    public void resolved(String ip, String hostname);
    public void removed(String ip, String hostname);
}
