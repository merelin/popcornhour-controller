package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StopAODRequest extends Request {
    public StopAODRequest() {
        super(Module.PLAYBACK, Function.STOP_AOD);
    }
}
