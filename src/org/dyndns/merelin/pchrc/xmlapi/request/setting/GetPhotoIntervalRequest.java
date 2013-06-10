package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetPhotoIntervalRequest extends Request {
    public GetPhotoIntervalRequest() {
        super(Module.SETTING, Function.GET_PHOTO_INTERVAL);
    }
}
