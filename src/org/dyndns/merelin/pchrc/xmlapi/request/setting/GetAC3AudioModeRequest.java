package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetAC3AudioModeRequest extends Request {
    public GetAC3AudioModeRequest() {
        super(Module.SETTING, Function.GET_AC3_AUDIO_MODE);
    }
}
