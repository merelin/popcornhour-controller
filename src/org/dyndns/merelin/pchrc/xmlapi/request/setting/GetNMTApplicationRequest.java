package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetNMTApplicationRequest extends Request {
    public GetNMTApplicationRequest() {
        super(Module.SETTING, Function.GET_NMT_APPLICATION);
    }
}
