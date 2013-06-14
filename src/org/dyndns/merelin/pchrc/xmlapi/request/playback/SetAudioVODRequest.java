package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetAudioVODRequest extends Request {
    public SetAudioVODRequest(String value) {
        super(Module.PLAYBACK, Function.SET_AUDIO_VOD, value);
    }
}
