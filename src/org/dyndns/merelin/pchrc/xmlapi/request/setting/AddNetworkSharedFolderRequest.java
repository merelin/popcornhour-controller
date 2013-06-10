package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class AddNetworkSharedFolderRequest extends Request {
    public AddNetworkSharedFolderRequest(String networkShareName, String url,
            String username, String password) {
        super(Module.SETTING, Function.ADD_NETWORK_SHARED_FOLDER,
                networkShareName, url, username, password);
    }
}
