package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListFramerateSyncRequest extends Request {
    public ListFramerateSyncRequest() {
        super(Module.SETTING, Function.LIST_FRAMERATE_SYNC);
    }
}
