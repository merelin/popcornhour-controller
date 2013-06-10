package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetTimeZoneRequest extends Request {
    public SetTimeZoneRequest(String timeZone) {
        super(Module.SETTING, Function.SET_TIME_ZONE, timeZone);
    }
}
