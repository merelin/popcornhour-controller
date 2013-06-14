package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAudioVODRequest extends Request {
    public ListAudioVODRequest() {
        super(Module.PLAYBACK, Function.LIST_AUDIO_VOD);
    }
}
