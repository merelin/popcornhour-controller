package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetBrowseModeRequest extends Request {
    public SetBrowseModeRequest(String options) {
        super(Module.SETTING, Function.SET_BROWSE_MODE, options);
    }
}
