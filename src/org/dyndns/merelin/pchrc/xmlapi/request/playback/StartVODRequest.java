package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartVODRequest extends Request {
    public StartVODRequest(String videoTitle, String path, String showOrHide,
            String skipNSeconds, String prebufferValueInSeconds,
            String httpCache) {
        super(Module.PLAYBACK, Function.START_VOD, videoTitle, path, showOrHide,
                skipNSeconds, prebufferValueInSeconds, httpCache);
    }
}
