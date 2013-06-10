package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetFramerateSyncRequest extends Request {
    public SetFramerateSyncRequest(String framerateSync) {
        super(Module.SETTING, Function.SET_FRAMERATE_SYNC, framerateSync);
    }
}
