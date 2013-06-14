package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class InsertDatabaseAODQueueRequest extends Request {
    public InsertDatabaseAODQueueRequest(String sourcePath, String mode,
            String modeId, String filtering, String categoryId,
            String itemToStartPlayback, String display) {
        super(Module.PLAYBACK, Function.INSERT_DATABASE_AOD_QUEUE, sourcePath,
                mode, modeId, filtering, categoryId, itemToStartPlayback,
                display);
    }
}
