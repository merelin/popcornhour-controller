package org.dyndns.merelin.pchrc.server.service.request.module.setting;

import org.dyndns.merelin.pchrc.server.service.Function;
import org.dyndns.merelin.pchrc.server.service.Module;
import org.dyndns.merelin.pchrc.server.service.request.Request;

public class GetTimeZoneRequest extends Request {
    public GetTimeZoneRequest() {
        super(Module.SETTING, Function.GET_TIME_ZONE);
    }
}
