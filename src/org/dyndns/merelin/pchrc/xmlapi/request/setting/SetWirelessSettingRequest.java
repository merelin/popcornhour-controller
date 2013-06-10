package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWirelessSettingRequest extends Request {
    public SetWirelessSettingRequest(String ssidOptions,
            String connectionOptions, String securityOptions, String securityKey) {
        super(Module.SETTING, Function.SET_WIRELESS_SETTING, ssidOptions,
                connectionOptions, securityOptions, securityKey);
    }
}
