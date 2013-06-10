package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWirelessSSIDRequest extends Request {
    public SetWirelessSSIDRequest(String ssid) {
        super(Module.SETTING, Function.SET_WIRELESS_SSID, ssid);
    }
}
