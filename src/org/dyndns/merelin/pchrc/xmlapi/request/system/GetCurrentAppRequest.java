package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetCurrentAppRequest extends Request {
    public GetCurrentAppRequest() {
        super(Module.SYSTEM, Function.GET_CURRENT_APP);
    }
}
