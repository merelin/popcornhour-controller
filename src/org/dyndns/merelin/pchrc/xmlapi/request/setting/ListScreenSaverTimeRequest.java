package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListScreenSaverTimeRequest extends Request {
    public ListScreenSaverTimeRequest() {
        super(Module.SETTING, Function.LIST_SCREEN_SAVER_TIME);
    }
}
