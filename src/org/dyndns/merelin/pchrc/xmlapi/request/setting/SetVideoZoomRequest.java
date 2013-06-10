package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetVideoZoomRequest extends Request {
    public SetVideoZoomRequest(String videoZoom) {
        super(Module.SETTING, Function.SET_VIDEO_ZOOM, videoZoom);
    }
}
