package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListWebServicesOptionRequest extends Request {
    public ListWebServicesOptionRequest() {
        super(Module.SYSTEM, Function.LIST_WEBSERVICES_OPTION);
    }
}
