package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetAdvancedNetworkRequest extends Request {
    public GetAdvancedNetworkRequest() {
        super(Module.SETTING, Function.GET_ADVANCED_NETWORK);
    }
}
