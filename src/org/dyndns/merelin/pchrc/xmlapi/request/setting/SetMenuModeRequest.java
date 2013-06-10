package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetMenuModeRequest extends Request {
    public SetMenuModeRequest(String menuMode) {
        super(Module.SETTING, Function.SET_MENU_MODE, menuMode);
    }
}
