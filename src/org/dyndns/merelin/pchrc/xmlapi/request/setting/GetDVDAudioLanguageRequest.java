package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDVDAudioLanguageRequest extends Request {
    public GetDVDAudioLanguageRequest() {
        super(Module.SETTING, Function.GET_DVD_AUDIO_LANGUAGE);
    }
}
