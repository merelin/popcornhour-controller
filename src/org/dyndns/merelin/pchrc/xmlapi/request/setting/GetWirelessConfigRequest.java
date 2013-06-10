package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetWirelessConfigRequest extends Request {
    public GetWirelessConfigRequest() {
        super(Module.SETTING, Function.GET_WIRELESS_CONFIG);
    }
}
