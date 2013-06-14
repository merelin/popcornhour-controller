package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDrivesRequest extends Request {
    public ListDrivesRequest() {
        super(Module.SYSTEM, Function.LIST_DRIVES);
    }
}
