package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetPhotoIntervalRequest extends Request {
    public SetPhotoIntervalRequest(String photoInterval) {
        super(Module.SETTING, Function.SET_PHOTO_INTERVAL, photoInterval);
    }
}
