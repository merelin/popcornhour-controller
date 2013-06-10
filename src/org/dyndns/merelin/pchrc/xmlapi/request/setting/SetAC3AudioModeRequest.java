package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetAC3AudioModeRequest extends Request {
    public SetAC3AudioModeRequest(String ac3AudioMode) {
        super(Module.SETTING, Function.SET_AC3_AUDIO_MODE, ac3AudioMode);
    }
}
