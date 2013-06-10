package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetBDNavigationRequest extends Request {
    public SetBDNavigationRequest(String options) {
        super(Module.SETTING, Function.SET_BD_NAVIGATION, options);
    }
}
