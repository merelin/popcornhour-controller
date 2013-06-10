package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListVideoZoomRequest extends Request {
    public ListVideoZoomRequest() {
        super(Module.SETTING, Function.LIST_VIDEO_ZOOM);
    }
}
