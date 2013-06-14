package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class NextDatabaseVODInQueueRequest extends Request {
    public NextDatabaseVODInQueueRequest() {
        super(Module.PLAYBACK, Function.NEXT_DATABASE_VOD_IN_QUEUE);
    }
}
