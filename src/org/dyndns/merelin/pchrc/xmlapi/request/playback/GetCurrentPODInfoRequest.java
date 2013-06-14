package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetCurrentPODInfoRequest extends Request {
    public GetCurrentPODInfoRequest() {
        super(Module.PLAYBACK, Function.GET_CURRENT_POD_INFO);
    }
}
