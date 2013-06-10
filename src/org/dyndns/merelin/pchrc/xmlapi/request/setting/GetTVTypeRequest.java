package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetTVTypeRequest extends Request {
    public GetTVTypeRequest() {
        super(Module.SETTING, Function.GET_TV_TYPE);
    }
}
