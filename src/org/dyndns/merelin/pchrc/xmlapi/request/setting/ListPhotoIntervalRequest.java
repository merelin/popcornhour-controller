package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListPhotoIntervalRequest extends Request {
    public ListPhotoIntervalRequest() {
        super(Module.SETTING, Function.LIST_PHOTO_INTERVAL);
    }
}
