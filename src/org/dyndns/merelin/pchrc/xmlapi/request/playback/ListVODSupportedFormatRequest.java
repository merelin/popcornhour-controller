package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListVODSupportedFormatRequest extends Request {
    public ListVODSupportedFormatRequest() {
        super(Module.PLAYBACK, Function.LIST_VOD_SUPPORTED_FORMAT);
    }
}
