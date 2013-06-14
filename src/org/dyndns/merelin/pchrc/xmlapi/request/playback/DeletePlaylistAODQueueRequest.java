package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class DeletePlaylistAODQueueRequest extends Request {
    public DeletePlaylistAODQueueRequest(String index) {
        super(Module.PLAYBACK, Function.DELETE_PLAYLIST_AOD_QUEUE, index);
    }
}
