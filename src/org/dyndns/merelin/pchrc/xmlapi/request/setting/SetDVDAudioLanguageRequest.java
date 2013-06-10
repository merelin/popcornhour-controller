package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDVDAudioLanguageRequest extends Request {
    public SetDVDAudioLanguageRequest(String language) {
        super(Module.SETTING, Function.SET_DVD_AUDIO_LANGUAGE, language);
    }
}
