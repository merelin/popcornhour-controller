package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetTimeSeekVODRequest extends Request {
    public SetTimeSeekVODRequest(String time) {
        super(Module.PLAYBACK, Function.SET_TIME_SEEK_VOD, time);
    }
}
