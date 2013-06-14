package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAODQueueInfoRequest extends Request {
    public ListAODQueueInfoRequest() {
        super(Module.PLAYBACK, Function.LIST_AOD_QUEUE_INFO);
    }
}
