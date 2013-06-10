package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetSubtitleLanguageRequest extends Request {
    public SetSubtitleLanguageRequest(String language) {
        super(Module.SETTING, Function.SET_SUBTITLE_LANGUAGE, language);
    }
}
