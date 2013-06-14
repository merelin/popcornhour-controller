package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ResumeVODRequest extends Request {
    public ResumeVODRequest() {
        super(Module.PLAYBACK, Function.RESUME_VOD);
    }
}
