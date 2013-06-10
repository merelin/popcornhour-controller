package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListColorSpaceRequest extends Request {
    public ListColorSpaceRequest() {
        super(Module.SETTING, Function.LIST_COLOR_SPACE);
    }
}
