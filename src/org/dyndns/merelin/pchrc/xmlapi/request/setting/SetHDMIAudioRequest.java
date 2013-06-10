package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetHDMIAudioRequest extends Request {
    public SetHDMIAudioRequest(String enableHDMIAudio) {
        super(Module.SETTING, Function.SET_HDMI_AUDIO, enableHDMIAudio);
    }
}
