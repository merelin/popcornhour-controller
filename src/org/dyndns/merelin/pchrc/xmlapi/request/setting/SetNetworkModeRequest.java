package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetNetworkModeRequest extends Request {
    public SetNetworkModeRequest(String networkMode) {
        super(Module.SETTING, Function.SET_NETWORK_MODE, networkMode);
    }
}
