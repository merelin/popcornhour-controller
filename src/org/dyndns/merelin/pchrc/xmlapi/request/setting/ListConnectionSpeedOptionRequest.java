package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListConnectionSpeedOptionRequest extends Request {
    public ListConnectionSpeedOptionRequest() {
        super(Module.SETTING, Function.LIST_CONNECTION_SPEED_OPTION);
    }
}
