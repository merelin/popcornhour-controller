package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetFirmwareVersionRequest extends Request {
    public GetFirmwareVersionRequest() {
        super(Module.SYSTEM, Function.GET_FIRMWARE_VERSION);
    }
}
