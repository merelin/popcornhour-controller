package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetFileLockRequest extends Request {
    public GetFileLockRequest() {
        super(Module.SETTING, Function.GET_FILE_LOCK);
    }
}
