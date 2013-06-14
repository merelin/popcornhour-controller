package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class RepeatVODRequest extends Request {
    public RepeatVODRequest() {
        super(Module.PLAYBACK, Function.REPEAT_VOD);
    }
}
