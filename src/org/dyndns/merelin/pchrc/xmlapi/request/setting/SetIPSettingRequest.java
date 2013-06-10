package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetIPSettingRequest extends Request {
    public SetIPSettingRequest(String ipAddress, String subnetMask,
            String gateway, String primaryDNS, String secondaryDNS) {
        super(Module.SETTING, Function.SET_IP_SETTING, ipAddress, subnetMask,
                gateway, primaryDNS, secondaryDNS);
    }
}
