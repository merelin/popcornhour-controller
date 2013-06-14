package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class LoadPHFRequest extends Request {
    public LoadPHFRequest(String phfPage, String arg) {
        super(Module.SYSTEM, Function.LOAD_PHF, phfPage, arg);
    }
}
