package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetBrowseModeRequest extends Request {
    public GetBrowseModeRequest() {
        super(Module.SETTING, Function.GET_BROWSE_MODE);
    }
}
