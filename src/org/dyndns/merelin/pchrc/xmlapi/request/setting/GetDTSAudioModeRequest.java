package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDTSAudioModeRequest extends Request {
    public GetDTSAudioModeRequest() {
        super(Module.SETTING, Function.GET_DTS_AUDIO_MODE);
    }
}
