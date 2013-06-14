package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class PauseAODRequest extends Request {
    public PauseAODRequest() {
        super(Module.PLAYBACK, Function.PAUSE_AOD);
    }
}
