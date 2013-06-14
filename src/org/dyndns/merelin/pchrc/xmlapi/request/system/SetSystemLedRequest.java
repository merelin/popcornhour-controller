package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetSystemLedRequest extends Request {
    public SetSystemLedRequest(String state) {
        super(Module.SYSTEM, Function.SET_SYSTEM_LED, state);
    }
}
