package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDVDParentalControlLevelRequest extends Request {
    public GetDVDParentalControlLevelRequest() {
        super(Module.SETTING, Function.GET_DVD_PARENTAL_CONTROL_LEVEL);
    }
}
