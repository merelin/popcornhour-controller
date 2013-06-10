package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListSubtitleLanguageRequest extends Request {
    public ListSubtitleLanguageRequest() {
        super(Module.SETTING, Function.LIST_SUBTITLE_LANGUAGE);
    }
}
