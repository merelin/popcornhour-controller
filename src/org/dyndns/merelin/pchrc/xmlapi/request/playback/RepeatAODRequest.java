package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class RepeatAODRequest extends Request {
    public RepeatAODRequest() {
        super(Module.PLAYBACK, Function.REPEAT_AOD);
    }
}
