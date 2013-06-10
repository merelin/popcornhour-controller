package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDaylightSavingRequest extends Request {
    public GetDaylightSavingRequest() {
        super(Module.SETTING, Function.GET_DAYLIGHT_SAVING);
    }
}
