package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetFileLockRequest extends Request {
    public SetFileLockRequest(String options, String password) {
        super(Module.SETTING, Function.SET_FILE_LOCK, options, password);
    }
}
