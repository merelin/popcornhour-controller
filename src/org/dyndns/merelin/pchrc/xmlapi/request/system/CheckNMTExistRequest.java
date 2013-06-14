package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class CheckNMTExistRequest extends Request {
    public CheckNMTExistRequest() {
        super(Module.SYSTEM, Function.CHECK_NMT_EXIST);
    }
}
