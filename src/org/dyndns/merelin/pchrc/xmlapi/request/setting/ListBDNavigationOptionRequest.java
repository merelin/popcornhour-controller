package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListBDNavigationOptionRequest extends Request {
    public ListBDNavigationOptionRequest() {
        super(Module.SETTING, Function.LIST_BD_NAVIGATION_OPTION);
    }
}
