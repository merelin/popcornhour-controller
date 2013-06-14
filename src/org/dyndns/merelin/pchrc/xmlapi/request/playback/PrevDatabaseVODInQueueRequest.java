package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class PrevDatabaseVODInQueueRequest extends Request {
    public PrevDatabaseVODInQueueRequest() {
        super(Module.PLAYBACK, Function.PREV_DATABASE_VOD_IN_QUEUE);
    }
}
