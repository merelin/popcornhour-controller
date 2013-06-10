package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListNetworkModeRequest extends Request {
    public ListNetworkModeRequest() {
        super(Module.SETTING, Function.LIST_NETWORK_MODE);
    }
}
