package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetSubtitleVODRequest extends Request {
    public SetSubtitleVODRequest(String subtitle, String color, String fontSize,
            String position, String encoding, String timeOffset) {
        super(Module.PLAYBACK, Function.SET_SUBTITLE_VOD, subtitle, color,
                fontSize, position, encoding, timeOffset);
    }
}
