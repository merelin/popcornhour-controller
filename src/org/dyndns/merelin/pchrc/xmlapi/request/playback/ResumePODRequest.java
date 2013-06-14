package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ResumePODRequest extends Request {
    public ResumePODRequest() {
        super(Module.PLAYBACK, Function.RESUME_POD);
    }
}
