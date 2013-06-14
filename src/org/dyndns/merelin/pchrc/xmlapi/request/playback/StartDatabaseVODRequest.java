package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartDatabaseVODRequest extends Request {
    public StartDatabaseVODRequest(String sourcePath, String videoId,
            String mode, String chapterTitle, String singleOrAll, String display,
            String httpCache) {
        super(Module.PLAYBACK, Function.START_DATABASE_VOD, sourcePath, videoId,
                mode, chapterTitle, singleOrAll, display, httpCache);
    }
}
