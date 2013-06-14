package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetPlaybackSpeedVODRequest extends Request {
    public SetPlaybackSpeedVODRequest(String speed) {
        super(Module.PLAYBACK, Function.SET_PLAYBACK_SPEED_VOD, speed);
    }
}
