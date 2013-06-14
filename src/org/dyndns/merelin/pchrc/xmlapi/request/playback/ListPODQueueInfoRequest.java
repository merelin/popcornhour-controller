package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPODQueueInfoRequest extends Request {
    public ListPODQueueInfoRequest() {
        super(Module.PLAYBACK, Function.LIST_POD_QUEUE_INFO);
    }
}
