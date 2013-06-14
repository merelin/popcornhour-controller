package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class PrevAODInQueueRequest extends Request {
    public PrevAODInQueueRequest() {
        super(Module.PLAYBACK, Function.PREV_AOD_IN_QUEUE);
    }
}
