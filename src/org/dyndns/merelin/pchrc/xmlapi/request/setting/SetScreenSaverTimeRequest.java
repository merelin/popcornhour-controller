package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetScreenSaverTimeRequest extends Request {
    public SetScreenSaverTimeRequest(String screenSaverTime) {
        super(Module.SETTING, Function.SET_SCREEN_SAVER_TIME, screenSaverTime);
    }
}
