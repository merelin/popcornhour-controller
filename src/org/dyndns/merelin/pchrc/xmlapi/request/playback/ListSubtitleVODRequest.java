package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListSubtitleVODRequest extends Request {
    public ListSubtitleVODRequest() {
        super(Module.PLAYBACK, Function.LIST_SUBTITLE_VOD);
    }
}
