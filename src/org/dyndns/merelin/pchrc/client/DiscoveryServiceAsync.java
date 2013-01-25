package org.dyndns.merelin.pchrc.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DiscoveryServiceAsync {
    void discover(AsyncCallback<String[]> callback);
}
