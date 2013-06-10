package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWirelessSecurityRequest extends Request {
    public SetWirelessSecurityRequest(String securityOptions, String securityKey) {
        super(Module.SETTING, Function.SET_WIRELESS_SECURITY, securityOptions,
                securityKey);
    }
}
