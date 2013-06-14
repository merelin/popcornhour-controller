package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class PauseVODRequest extends Request {
    public PauseVODRequest() {
        super(Module.PLAYBACK, Function.PAUSE_VOD);
    }
}
