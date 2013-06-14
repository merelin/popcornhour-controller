package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetPlaylistCurrentAODInfoRequest extends Request {
    public GetPlaylistCurrentAODInfoRequest() {
        super(Module.PLAYBACK, Function.GET_PLAYLIST_CURRENT_AOD_INFO);
    }
}
