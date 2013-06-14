package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StopPODRequest extends Request {
    public StopPODRequest() {
        super(Module.PLAYBACK, Function.STOP_POD);
    }
}
