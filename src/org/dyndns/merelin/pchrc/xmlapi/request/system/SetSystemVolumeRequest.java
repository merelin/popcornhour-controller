package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetSystemVolumeRequest extends Request {
    public SetSystemVolumeRequest(String level) {
        super(Module.SYSTEM, Function.SET_SYSTEM_VOLUME, level);
    }
}
