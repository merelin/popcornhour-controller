package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetHDMIAudioRequest extends Request {
    public GetHDMIAudioRequest() {
        super(Module.SETTING, Function.GET_HDMI_AUDIO);
    }
}
