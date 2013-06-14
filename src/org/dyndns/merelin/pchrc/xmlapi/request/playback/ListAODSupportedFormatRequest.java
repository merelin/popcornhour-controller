package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListAODSupportedFormatRequest extends Request {
    public ListAODSupportedFormatRequest() {
        super(Module.PLAYBACK, Function.LIST_AOD_SUPPORTED_FORMAT);
    }
}
