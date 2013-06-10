package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPCMAudioModeRequest extends Request {
    public ListPCMAudioModeRequest() {
        super(Module.SETTING, Function.LIST_PCM_AUDIO_MODE);
    }
}
