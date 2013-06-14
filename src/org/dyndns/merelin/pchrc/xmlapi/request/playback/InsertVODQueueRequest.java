package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class InsertVODQueueRequest extends Request {
    public InsertVODQueueRequest(String videoFile, String path,
            String showOrHide, String playbackStart) {
        super(Module.PLAYBACK, Function.INSERT_VOD_QUEUE, videoFile, path,
                showOrHide, playbackStart);
    }
}
