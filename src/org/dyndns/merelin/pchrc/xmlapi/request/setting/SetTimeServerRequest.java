package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetTimeServerRequest extends Request {
    public SetTimeServerRequest(String timeServer) {
        super(Module.SETTING, Function.SET_TIME_SERVER, timeServer);
    }
}
