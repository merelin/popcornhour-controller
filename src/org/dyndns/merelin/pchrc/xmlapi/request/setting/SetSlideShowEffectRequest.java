package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetSlideShowEffectRequest extends Request {
    public SetSlideShowEffectRequest(String slideShowEffect) {
        super(Module.SETTING, Function.SET_SLIDE_SHOW_EFFECT, slideShowEffect);
    }
}
