package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetCurrentAODInfoRequest extends Request {
    public GetCurrentAODInfoRequest() {
        super(Module.PLAYBACK, Function.GET_CURRENT_AOD_INFO);
    }
}
