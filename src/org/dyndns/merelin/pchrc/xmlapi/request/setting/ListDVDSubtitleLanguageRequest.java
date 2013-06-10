package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDVDSubtitleLanguageRequest extends Request {
    public ListDVDSubtitleLanguageRequest() {
        super(Module.SETTING, Function.LIST_DVD_SUBTITLE_LANGUAGE);
    }
}
