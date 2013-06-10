package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDRCRequest extends Request {
    public SetDRCRequest(String options) {
        super(Module.SETTING, Function.SET_DRC, options);
    }
}
