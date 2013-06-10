package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetColorSpaceRequest extends Request {
    public GetColorSpaceRequest() {
        super(Module.SETTING, Function.GET_COLOR_SPACE);
    }
}
