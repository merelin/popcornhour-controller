package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetScannerLanguageRequest extends Request {
    public GetScannerLanguageRequest() {
        super(Module.SETTING, Function.GET_SCANNER_LANGUAGE);
    }
}
