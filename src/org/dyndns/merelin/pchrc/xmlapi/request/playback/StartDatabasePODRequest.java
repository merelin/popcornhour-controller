package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartDatabasePODRequest extends Request {
    public StartDatabasePODRequest(String sourcePath, String mode,
            String albumIdOrDate, String photoId, String playbackMode,
            String display) {
        super(Module.PLAYBACK, Function.START_DATABASE_POD, sourcePath, mode,
                albumIdOrDate, photoId, playbackMode, display);
    }
}
