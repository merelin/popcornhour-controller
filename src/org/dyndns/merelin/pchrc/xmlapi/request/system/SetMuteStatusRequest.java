package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetMuteStatusRequest extends Request {
    public SetMuteStatusRequest(String status) {
        super(Module.SYSTEM, Function.SET_MUTE_STATUS, status);
    }
}
