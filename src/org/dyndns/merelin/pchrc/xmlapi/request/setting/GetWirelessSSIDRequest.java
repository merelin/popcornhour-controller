package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetWirelessSSIDRequest extends Request {
    public GetWirelessSSIDRequest() {
        super(Module.SETTING, Function.GET_WIRELESS_SSID);
    }
}
