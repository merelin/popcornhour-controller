package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDTSAudioModeRequest extends Request {
    public SetDTSAudioModeRequest(String dtsAudioMode) {
        super(Module.SETTING, Function.SET_DTS_AUDIO_MODE, dtsAudioMode);
    }
}
