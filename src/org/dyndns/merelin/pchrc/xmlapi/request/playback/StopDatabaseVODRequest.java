package org.dyndns.merelin.pchrc.xmlapi.request.playback;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class StopDatabaseVODRequest extends Request {
    public StopDatabaseVODRequest() {
        super(Module.PLAYBACK, Function.STOP_DATABASE_VOD);
    }
}
