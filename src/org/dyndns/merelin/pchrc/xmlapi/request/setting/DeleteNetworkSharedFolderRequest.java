package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class DeleteNetworkSharedFolderRequest extends Request {
    public DeleteNetworkSharedFolderRequest(String networkShareName) {
        super(Module.SETTING, Function.DELETE_NETWORK_SHARED_FOLDER,
                networkShareName);
    }
}
