package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetPlaybackSpeedVODRequest extends Request {
    public GetPlaybackSpeedVODRequest() {
        super(Module.PLAYBACK, Function.GET_PLAYBACK_SPEED_VOD);
    }
}
