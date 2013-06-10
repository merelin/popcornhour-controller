package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListRepeatModeRequest extends Request {
    public ListRepeatModeRequest() {
        super(Module.SETTING, Function.LIST_REPEAT_MODE);
    }
}
