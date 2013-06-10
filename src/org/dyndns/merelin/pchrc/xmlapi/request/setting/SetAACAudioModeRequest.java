package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetAACAudioModeRequest extends Request {
    public SetAACAudioModeRequest(String aacAudioMode) {
        super(Module.SETTING, Function.SET_AAC_AUDIO_MODE, aacAudioMode);
    }
}
