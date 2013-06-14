package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetZoomPODRequest extends Request {
    public SetZoomPODRequest(String number) {
        super(Module.PLAYBACK, Function.SET_ZOOM_POD, number);
    }
}
