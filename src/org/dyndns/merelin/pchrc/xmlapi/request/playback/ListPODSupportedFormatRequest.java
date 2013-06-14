package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPODSupportedFormatRequest extends Request {
    public ListPODSupportedFormatRequest() {
        super(Module.PLAYBACK, Function.LIST_POD_SUPPORTED_FORMAT);
    }
}
