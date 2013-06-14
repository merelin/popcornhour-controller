package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class NextAODInQueueRequest extends Request {
    public NextAODInQueueRequest() {
        super(Module.PLAYBACK, Function.NEXT_AOD_IN_QUEUE);
    }
}
