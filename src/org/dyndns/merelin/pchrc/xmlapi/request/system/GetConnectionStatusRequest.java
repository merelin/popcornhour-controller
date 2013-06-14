package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetConnectionStatusRequest extends Request {
    public GetConnectionStatusRequest(String... params) {
        super(Module.SYSTEM, Function.GET_CONNECTION_STATUS, params);
    }
}
