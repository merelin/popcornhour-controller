package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetPCMAudioModeRequest extends Request {
    public SetPCMAudioModeRequest(String pcmAudioMode) {
        super(Module.SETTING, Function.SET_PCM_AUDIO_MODE, pcmAudioMode);
    }
}
