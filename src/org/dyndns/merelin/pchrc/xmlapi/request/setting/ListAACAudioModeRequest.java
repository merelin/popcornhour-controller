package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAACAudioModeRequest extends Request {
    public ListAACAudioModeRequest() {
        super(Module.SETTING, Function.LIST_AAC_AUDIO_MODE);
    }
}
