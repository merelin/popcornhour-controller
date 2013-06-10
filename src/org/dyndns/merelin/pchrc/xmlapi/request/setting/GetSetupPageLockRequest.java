package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetSetupPageLockRequest extends Request {
    public GetSetupPageLockRequest() {
        super(Module.SETTING, Function.GET_SETUP_PAGE_LOCK);
    }
}
