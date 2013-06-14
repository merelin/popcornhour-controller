package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAllActiveAppsRequest extends Request {
    public ListAllActiveAppsRequest() {
        super(Module.SYSTEM, Function.LIST_ALL_ACTIVE_APPS);
    }
}
