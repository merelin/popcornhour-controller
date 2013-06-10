package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetLanguageRequest extends Request {
    public SetLanguageRequest(String language) {
        super(Module.SETTING, Function.SET_LANGUAGE, language);
    }
}
