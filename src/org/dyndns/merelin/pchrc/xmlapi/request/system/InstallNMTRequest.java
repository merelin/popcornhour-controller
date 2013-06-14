package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class InstallNMTRequest extends Request {
    public InstallNMTRequest(String setupType, String url, String destination) {
        super(Module.SYSTEM, Function.INSTALL_NMT, setupType, url, destination);
    }
}
