package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListSetupOptionRequest extends Request {
    public ListSetupOptionRequest() {
        super(Module.SETTING, Function.LIST_SETUP_OPTION);
    }
}
