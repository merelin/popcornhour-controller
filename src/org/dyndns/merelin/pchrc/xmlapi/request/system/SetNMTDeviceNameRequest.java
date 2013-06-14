package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetNMTDeviceNameRequest extends Request {
    public SetNMTDeviceNameRequest(String name) {
        super(Module.SYSTEM, Function.SET_NMT_DEVICE_NAME, name);
    }
}
