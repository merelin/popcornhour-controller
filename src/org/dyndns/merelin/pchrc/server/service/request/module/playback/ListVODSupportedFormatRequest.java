package org.dyndns.merelin.pchrc.server.service.request.module.playback;

import org.dyndns.merelin.pchrc.server.service.Function;
import org.dyndns.merelin.pchrc.server.service.Module;
import org.dyndns.merelin.pchrc.server.service.request.Request;

public class ListVODSupportedFormatRequest extends Request {
    public ListVODSupportedFormatRequest() {
        super(Module.PLAYBACK, Function.LIST_VOD_SUPPORTED_FORMAT);
    }
}
