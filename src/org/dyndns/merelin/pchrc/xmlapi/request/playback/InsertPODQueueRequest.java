package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class InsertPODQueueRequest extends Request {
    public InsertPODQueueRequest(String title, String path, String interval,
            String rotationDegree, String showOrHide, String transitionEffect) {
        super(Module.PLAYBACK, Function.INSERT_POD_QUEUE, title, path, interval,
                rotationDegree, showOrHide, transitionEffect);
    }
}
