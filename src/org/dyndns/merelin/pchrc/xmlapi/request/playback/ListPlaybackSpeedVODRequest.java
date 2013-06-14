package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPlaybackSpeedVODRequest extends Request {
    public ListPlaybackSpeedVODRequest() {
        super(Module.PLAYBACK, Function.LIST_PLAYBACK_SPEED_VOD);
    }
}
