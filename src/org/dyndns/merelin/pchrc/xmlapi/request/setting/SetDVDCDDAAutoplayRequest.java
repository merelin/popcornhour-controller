package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDVDCDDAAutoplayRequest extends Request {
    public SetDVDCDDAAutoplayRequest(String enableDVDCDDAAutoplay) {
        super(Module.SETTING, Function.SET_DVD_CDDA_AUTOPLAY, enableDVDCDDAAutoplay);
    }
}
