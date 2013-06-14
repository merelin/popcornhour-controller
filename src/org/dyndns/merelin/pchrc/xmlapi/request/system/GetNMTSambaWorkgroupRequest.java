package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetNMTSambaWorkgroupRequest extends Request {
    public GetNMTSambaWorkgroupRequest() {
        super(Module.SYSTEM, Function.GET_NMT_SAMBA_WORKGROUP);
    }
}
