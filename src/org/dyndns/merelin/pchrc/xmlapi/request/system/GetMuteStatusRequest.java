package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetMuteStatusRequest extends Request {
    public GetMuteStatusRequest() {
        super(Module.SYSTEM, Function.GET_MUTE_STATUS);
    }
}
