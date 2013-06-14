package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class LoadPageRequest extends Request {
    public LoadPageRequest(String url, String reserved, String value) {
        super(Module.SYSTEM, Function.LOAD_PAGE, url, reserved, value);
    }
}
