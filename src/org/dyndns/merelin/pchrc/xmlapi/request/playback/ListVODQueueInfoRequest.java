package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListVODQueueInfoRequest extends Request {
    public ListVODQueueInfoRequest() {
        super(Module.PLAYBACK, Function.LIST_VOD_QUEUE_INFO);
    }
}
