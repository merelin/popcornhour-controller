package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetConnectionSpeedRequest extends Request {
    public GetConnectionSpeedRequest() {
        super(Module.SETTING, Function.GET_CONNECTION_SPEED);
    }
}
