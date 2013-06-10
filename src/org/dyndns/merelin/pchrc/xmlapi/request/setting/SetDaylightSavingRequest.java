package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDaylightSavingRequest extends Request {
    public SetDaylightSavingRequest(String enableDaylightSaving) {
        super(Module.SETTING, Function.SET_DAYLIGHT_SAVING, enableDaylightSaving);
    }
}
