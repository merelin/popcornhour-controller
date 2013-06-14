package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class DeletePODEntryQueueRequest extends Request {
    public DeletePODEntryQueueRequest(String index) {
        super(Module.PLAYBACK, Function.DELETE_POD_ENTRY_QUEUE, index);
    }
}
