package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetRecentActivityRequest extends Request {
    public GetRecentActivityRequest() {
        super(Module.SETTING, Function.GET_RECENT_ACTIVITY);
    }
}
