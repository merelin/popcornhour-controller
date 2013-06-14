package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetNMTServiceStatusRequest extends Request {
    public SetNMTServiceStatusRequest(String options, String enable) {
        super(Module.SYSTEM, Function.SET_NMT_SERVICE_STATUS, options, enable);
    }
}
