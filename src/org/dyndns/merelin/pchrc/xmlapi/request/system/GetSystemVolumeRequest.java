package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetSystemVolumeRequest extends Request {
    public GetSystemVolumeRequest() {
        super(Module.SYSTEM, Function.GET_SYSTEM_VOLUME);
    }
}
