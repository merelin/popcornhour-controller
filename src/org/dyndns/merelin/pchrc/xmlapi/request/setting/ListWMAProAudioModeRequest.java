package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListWMAProAudioModeRequest extends Request {
    public ListWMAProAudioModeRequest() {
        super(Module.SETTING, Function.LIST_WMA_PRO_AUDIO_MODE);
    }
}
