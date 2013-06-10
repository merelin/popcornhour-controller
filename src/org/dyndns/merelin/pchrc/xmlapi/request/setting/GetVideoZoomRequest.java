package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetVideoZoomRequest extends Request {
    public GetVideoZoomRequest() {
        super(Module.SETTING, Function.GET_VIDEO_ZOOM);
    }
}
