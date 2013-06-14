package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class DeleteVODEntryQueueRequest extends Request {
    public DeleteVODEntryQueueRequest(String index) {
        super(Module.PLAYBACK, Function.DELETE_VOD_ENTRY_QUEUE, index);
    }
}
