package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class NextVODInQueueRequest extends Request {
    public NextVODInQueueRequest() {
        super(Module.PLAYBACK, Function.NEXT_VOD_IN_QUEUE);
    }
}
