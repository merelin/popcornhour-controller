package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetConnectionSpeedRequest extends Request {
    public SetConnectionSpeedRequest(String options) {
        super(Module.SETTING, Function.SET_CONNECTION_SPEED, options);
    }
}
