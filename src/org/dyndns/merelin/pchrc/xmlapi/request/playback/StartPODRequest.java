package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartPODRequest extends Request {
    public StartPODRequest(String title, String path, String interval,
            String rotationDegree, String showOrHide, String transitionEffect) {
        super(Module.PLAYBACK, Function.START_POD, title, path, interval,
                rotationDegree, showOrHide, transitionEffect);
    }
}
