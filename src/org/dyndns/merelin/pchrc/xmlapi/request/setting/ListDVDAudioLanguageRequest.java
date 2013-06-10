package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDVDAudioLanguageRequest extends Request {
    public ListDVDAudioLanguageRequest() {
        super(Module.SETTING, Function.LIST_DVD_AUDIO_LANGUAGE);
    }
}
