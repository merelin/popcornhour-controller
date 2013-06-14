package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StopVODRequest extends Request {
    public StopVODRequest() {
        super(Module.PLAYBACK, Function.STOP_VOD);
    }
}
