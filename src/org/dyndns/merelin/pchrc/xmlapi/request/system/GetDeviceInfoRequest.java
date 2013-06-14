package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetDeviceInfoRequest extends Request {
    public GetDeviceInfoRequest(String name) {
        super(Module.SYSTEM, Function.GET_DEVICE_INFO, name);
    }
}
