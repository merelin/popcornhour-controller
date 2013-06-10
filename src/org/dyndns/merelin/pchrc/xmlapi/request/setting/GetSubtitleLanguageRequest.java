package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetSubtitleLanguageRequest extends Request {
    public GetSubtitleLanguageRequest() {
        super(Module.SETTING, Function.GET_SUBTITLE_LANGUAGE);
    }
}
