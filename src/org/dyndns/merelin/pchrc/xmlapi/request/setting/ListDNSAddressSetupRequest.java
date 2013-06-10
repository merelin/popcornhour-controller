package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDNSAddressSetupRequest extends Request {
    public ListDNSAddressSetupRequest() {
        super(Module.SETTING, Function.LIST_DNS_ADDRESS_SETUP);
    }
}
