package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SuspendScreensaverRequest extends Request {
    public SuspendScreensaverRequest(String resumeOrSuspend) {
        super(Module.SYSTEM, Function.SUSPEND_SCREENSAVER, resumeOrSuspend);
    }
}
