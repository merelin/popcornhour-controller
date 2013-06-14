package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StartDatabaseAODRequest extends Request {
    public StartDatabaseAODRequest(String sourcePath, String mode, String modeId,
            String filtering, String categoryId, String itemToStartPlayback,
            String display, String httpCache) {
        super(Module.PLAYBACK, Function.START_DATABASE_AOD, sourcePath, mode,
                modeId, filtering, categoryId, itemToStartPlayback, display,
                httpCache);
    }
}
