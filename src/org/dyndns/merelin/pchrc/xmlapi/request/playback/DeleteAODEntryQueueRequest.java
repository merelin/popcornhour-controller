package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class DeleteAODEntryQueueRequest extends Request {
    public DeleteAODEntryQueueRequest(String index) {
        super(Module.PLAYBACK, Function.DELETE_AOD_ENTRY_QUEUE, index);
    }
}
