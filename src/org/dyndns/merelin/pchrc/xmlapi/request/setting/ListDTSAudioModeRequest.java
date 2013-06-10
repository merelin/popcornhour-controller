package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDTSAudioModeRequest extends Request {
    public ListDTSAudioModeRequest() {
        super(Module.SETTING, Function.LIST_DTS_AUDIO_MODE);
    }
}
