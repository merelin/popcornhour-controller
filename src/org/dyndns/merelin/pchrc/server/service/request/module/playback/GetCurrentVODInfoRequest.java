package org.dyndns.merelin.pchrc.server.service.request.module.playback;

import org.dyndns.merelin.pchrc.server.service.Function;
import org.dyndns.merelin.pchrc.server.service.Module;
import org.dyndns.merelin.pchrc.server.service.request.Request;

public class GetCurrentVODInfoRequest extends Request {
    public GetCurrentVODInfoRequest() {
        super(Module.PLAYBACK, Function.GET_CURRENT_VOD_INFO);
    }
}
