package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetScannerLanguageRequest extends Request {
    public SetScannerLanguageRequest(String language) {
        super(Module.SETTING, Function.SET_SCANNER_LANGUAGE, language);
    }
}
