package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class NextPODInQueueRequest extends Request {
    public NextPODInQueueRequest() {
        super(Module.PLAYBACK, Function.NEXT_POD_IN_QUEUE);
    }
}
