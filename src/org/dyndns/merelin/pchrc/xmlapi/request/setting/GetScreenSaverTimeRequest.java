package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetScreenSaverTimeRequest extends Request {
    public GetScreenSaverTimeRequest() {
        super(Module.SETTING, Function.GET_SCREEN_SAVER_TIME);
    }
}
