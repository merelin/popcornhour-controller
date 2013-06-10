package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDNSAddressSetupRequest extends Request {
    public SetDNSAddressSetupRequest(String options) {
        super(Module.SETTING, Function.SET_DNS_ADDRESS_SETUP, options);
    }
}
