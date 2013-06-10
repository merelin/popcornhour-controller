package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetSlideShowEffectRequest extends Request {
    public GetSlideShowEffectRequest() {
        super(Module.SETTING, Function.GET_SLIDE_SHOW_EFFECT);
    }
}
