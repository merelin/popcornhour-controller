package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetNMTMediaDestinationRequest extends Request {
    public SetNMTMediaDestinationRequest(String url) {
        super(Module.SYSTEM, Function.SET_NMT_MEDIA_DESTINATION, url);
    }
}
