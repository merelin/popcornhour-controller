package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetIPSettingRequest extends Request {
    public GetIPSettingRequest() {
        super(Module.SETTING, Function.GET_IP_SETTING);
    }
}
