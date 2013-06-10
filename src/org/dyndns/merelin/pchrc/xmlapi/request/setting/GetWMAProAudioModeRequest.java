package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetWMAProAudioModeRequest extends Request {
    public GetWMAProAudioModeRequest() {
        super(Module.SETTING, Function.GET_WMA_PRO_AUDIO_MODE);
    }
}
