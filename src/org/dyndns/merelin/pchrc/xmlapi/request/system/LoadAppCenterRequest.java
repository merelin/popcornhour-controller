package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class LoadAppCenterRequest extends Request {
    public LoadAppCenterRequest() {
        super(Module.SYSTEM, Function.LOAD_APPCENTER);
    }
}
