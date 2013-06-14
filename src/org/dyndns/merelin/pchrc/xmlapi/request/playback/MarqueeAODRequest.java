package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class MarqueeAODRequest extends Request {
    public MarqueeAODRequest(String showOrHide) {
        super(Module.PLAYBACK, Function.MARQUEE_AOD, showOrHide);
    }
}
