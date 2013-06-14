package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetNMTVersionRequest extends Request {
    public GetNMTVersionRequest() {
        super(Module.SYSTEM, Function.GET_NMT_VERSION);
    }
}
