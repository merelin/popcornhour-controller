package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetConfigureIPRequest extends Request {
    public GetConfigureIPRequest() {
        super(Module.SETTING, Function.GET_CONFIGURE_IP);
    }
}
