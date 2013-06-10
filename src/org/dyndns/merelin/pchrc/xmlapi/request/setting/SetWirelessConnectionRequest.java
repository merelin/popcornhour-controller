package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWirelessConnectionRequest extends Request {
    public SetWirelessConnectionRequest(String connectionOptions) {
        super(Module.SETTING, Function.SET_WIRELESS_CONNECTION, connectionOptions);
    }
}
