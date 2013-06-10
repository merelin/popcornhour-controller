package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDNSAddressSetupRequest extends Request {
    public GetDNSAddressSetupRequest() {
        super(Module.SETTING, Function.GET_DNS_ADDRESS_SETUP);
    }
}
