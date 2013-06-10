package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetVideoOutputRequest extends Request {
    public SetVideoOutputRequest(String videoOutput) {
        super(Module.SETTING, Function.SET_VIDEO_OUTPUT, videoOutput);
    }
}
