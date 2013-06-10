package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListTVTypeRequest extends Request {
    public ListTVTypeRequest() {
        super(Module.SETTING, Function.LIST_TV_TYPE);
    }
}
