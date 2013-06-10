package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetTVTypeRequest extends Request {
    public SetTVTypeRequest(String tvType) {
        super(Module.SETTING, Function.SET_TV_TYPE, tvType);
    }
}
