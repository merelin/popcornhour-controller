package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class LoadWidgetRequest extends Request {
    public LoadWidgetRequest(String path) {
        super(Module.SYSTEM, Function.LOAD_WIDGET, path);
    }
}
