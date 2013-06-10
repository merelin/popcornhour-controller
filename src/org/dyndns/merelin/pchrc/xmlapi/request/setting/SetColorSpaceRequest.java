package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetColorSpaceRequest extends Request {
    public SetColorSpaceRequest(String colorSpace) {
        super(Module.SETTING, Function.SET_COLOR_SPACE, colorSpace);
    }
}
