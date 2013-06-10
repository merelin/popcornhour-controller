package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListWirelessSecurityRequest extends Request {
    public ListWirelessSecurityRequest() {
        super(Module.SETTING, Function.LIST_WIRELESS_SECURITY);
    }
}
