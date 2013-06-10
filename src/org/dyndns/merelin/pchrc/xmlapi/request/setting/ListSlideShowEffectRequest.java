package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListSlideShowEffectRequest extends Request {
    public ListSlideShowEffectRequest() {
        super(Module.SETTING, Function.LIST_SLIDE_SHOW_EFFECT);
    }
}
