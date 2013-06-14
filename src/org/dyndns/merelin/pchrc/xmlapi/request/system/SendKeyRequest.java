package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SendKeyRequest extends Request {
    public SendKeyRequest(String options, String callFrom) {
        super(Module.SYSTEM, Function.SEND_KEY, options, callFrom);
    }
}
