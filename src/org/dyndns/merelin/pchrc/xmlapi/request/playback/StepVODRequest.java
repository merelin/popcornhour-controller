package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StepVODRequest extends Request {
    public StepVODRequest() {
        super(Module.PLAYBACK, Function.STEP_VOD);
    }
}
