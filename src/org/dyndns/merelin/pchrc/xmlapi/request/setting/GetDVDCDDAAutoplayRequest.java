package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDVDCDDAAutoplayRequest extends Request {
    public GetDVDCDDAAutoplayRequest() {
        super(Module.SETTING, Function.GET_DVD_CDDA_AUTOPLAY);
    }
}
