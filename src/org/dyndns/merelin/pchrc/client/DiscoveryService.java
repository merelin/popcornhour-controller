package org.dyndns.merelin.pchrc.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("discovery")
public interface DiscoveryService extends RemoteService {
    String[] discover();
}
