package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListNetworkSharedFolderRequest extends Request {
    public ListNetworkSharedFolderRequest() {
        super(Module.SETTING, Function.LIST_NETWORK_SHARED_FOLDER);
    }
}
