package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListTimeZoneRequest extends Request {
    public ListTimeZoneRequest() {
        super(Module.SETTING, Function.LIST_TIME_ZONE);
    }
}
