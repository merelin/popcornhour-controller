package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWMAProAudioModeRequest extends Request {
    public SetWMAProAudioModeRequest(String wmaProAudioMode) {
        super(Module.SETTING, Function.SET_WMA_PRO_AUDIO_MODE, wmaProAudioMode);
    }
}
