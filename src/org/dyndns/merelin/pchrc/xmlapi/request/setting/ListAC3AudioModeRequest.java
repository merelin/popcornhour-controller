package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAC3AudioModeRequest extends Request {
    public ListAC3AudioModeRequest() {
        super(Module.SETTING, Function.LIST_AC3_AUDIO_MODE);
    }
}
