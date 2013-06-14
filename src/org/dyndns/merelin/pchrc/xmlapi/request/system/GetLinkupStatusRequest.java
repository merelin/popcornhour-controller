package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetLinkupStatusRequest extends Request {
    public GetLinkupStatusRequest() {
        super(Module.SYSTEM, Function.GET_LINKUP_STATUS);
    }
}
