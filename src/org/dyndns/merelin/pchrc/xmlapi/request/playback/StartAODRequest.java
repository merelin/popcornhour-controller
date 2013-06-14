package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartAODRequest extends Request {
    public StartAODRequest(String title, String path, String showMarqueeHide,
            String httpCache) {
        super(Module.PLAYBACK, Function.START_AOD, title, path, showMarqueeHide,
                httpCache);
    }
}
