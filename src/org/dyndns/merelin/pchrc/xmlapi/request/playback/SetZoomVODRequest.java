package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetZoomVODRequest extends Request {
    public SetZoomVODRequest(String number) {
        super(Module.PLAYBACK, Function.SET_ZOOM_VOD, number);
    }
}
