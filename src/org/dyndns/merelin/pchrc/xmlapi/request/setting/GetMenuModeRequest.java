package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetMenuModeRequest extends Request {
    public GetMenuModeRequest() {
        super(Module.SETTING, Function.GET_MENU_MODE);
    }
}
