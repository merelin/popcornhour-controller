package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetProxySettingRequest extends Request {
    public SetProxySettingRequest(String httpProxyHost, String httpProxyPort,
            String username, String password) {
        super(Module.SETTING, Function.SET_PROXY_SETTING, httpProxyHost,
                httpProxyPort, username, password);
    }
}
