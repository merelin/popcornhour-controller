package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDNSAddressRequest extends Request {
    public SetDNSAddressRequest(String primaryDNS, String secondaryDNS) {
        super(Module.SETTING, Function.SET_DNS_ADDRESS, primaryDNS, secondaryDNS);
    }
}
