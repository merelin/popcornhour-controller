package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDRCRequest extends Request {
    public GetDRCRequest() {
        super(Module.SETTING, Function.GET_DRC);
    }
}
