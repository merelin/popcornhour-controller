package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetMACAddressRequest extends Request {
    public GetMACAddressRequest() {
        super(Module.SYSTEM, Function.GET_MAC_ADDRESS);
    }
}
