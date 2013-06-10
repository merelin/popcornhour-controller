package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetProxySettingRequest extends Request {
    public GetProxySettingRequest() {
        super(Module.SETTING, Function.GET_PROXY_SETTING);
    }
}
