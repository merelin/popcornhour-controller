package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetVideoOutputRequest extends Request {
    public GetVideoOutputRequest() {
        super(Module.SETTING, Function.GET_VIDEO_OUTPUT);
    }
}
