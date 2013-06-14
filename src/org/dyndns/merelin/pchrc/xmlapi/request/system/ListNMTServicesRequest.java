package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListNMTServicesRequest extends Request {
    public ListNMTServicesRequest() {
        super(Module.SYSTEM, Function.LIST_NMT_SERVICES);
    }
}
