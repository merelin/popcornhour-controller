package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListDVDParentalControlLevelRequest extends Request {
    public ListDVDParentalControlLevelRequest() {
        super(Module.SETTING, Function.LIST_DVD_PARENTAL_CONTROL_LEVEL);
    }
}
