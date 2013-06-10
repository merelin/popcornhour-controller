package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetRepeatModeRequest extends Request {
    public SetRepeatModeRequest(String repeatMode) {
        super(Module.SETTING, Function.SET_REPEAT_MODE, repeatMode);
    }
}
