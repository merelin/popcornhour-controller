package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPlaylistAODQueueInfoRequest extends Request {
    public ListPlaylistAODQueueInfoRequest() {
        super(Module.PLAYBACK, Function.LIST_PLAYLIST_AOD_QUEUE_INFO);
    }
}
