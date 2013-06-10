package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetAACAudioModeRequest extends Request {
    public GetAACAudioModeRequest() {
        super(Module.SETTING, Function.GET_AAC_AUDIO_MODE);
    }
}
