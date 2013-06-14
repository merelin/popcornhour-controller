package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class InsertAODQueueRequest extends Request {
    public InsertAODQueueRequest(String title, String path, String showOrHide) {
        super(Module.PLAYBACK, Function.INSERT_AOD_QUEUE, title, path, showOrHide);
    }
}
