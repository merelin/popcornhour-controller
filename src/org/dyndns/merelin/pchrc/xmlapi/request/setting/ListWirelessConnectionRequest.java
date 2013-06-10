package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListWirelessConnectionRequest extends Request {
    public ListWirelessConnectionRequest() {
        super(Module.SETTING, Function.LIST_WIRELESS_CONNECTION);
    }
}
