package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDNSAddressRequest extends Request {
    public GetDNSAddressRequest() {
        super(Module.SETTING, Function.GET_DNS_ADDRESS);
    }
}
