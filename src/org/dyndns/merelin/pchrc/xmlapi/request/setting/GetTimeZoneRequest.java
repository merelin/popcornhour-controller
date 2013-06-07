package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetTimeZoneRequest extends Request {
    public GetTimeZoneRequest() {
        super(Module.SETTING, Function.GET_TIME_ZONE);
    }
}
