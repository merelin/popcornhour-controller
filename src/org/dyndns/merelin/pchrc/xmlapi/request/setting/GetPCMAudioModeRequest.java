package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetPCMAudioModeRequest extends Request {
    public GetPCMAudioModeRequest() {
        super(Module.SETTING, Function.GET_PCM_AUDIO_MODE);
    }
}
