package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class UpdateFirmwareRequest extends Request {
    public UpdateFirmwareRequest(String path) {
        super(Module.SYSTEM, Function.UPDATE_FIRMWARE, path);
    }
}
