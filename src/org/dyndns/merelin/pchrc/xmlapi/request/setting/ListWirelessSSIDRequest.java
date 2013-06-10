package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListWirelessSSIDRequest extends Request {
    public ListWirelessSSIDRequest() {
        super(Module.SETTING, Function.LIST_WIRELESS_SSID);
    }
}
