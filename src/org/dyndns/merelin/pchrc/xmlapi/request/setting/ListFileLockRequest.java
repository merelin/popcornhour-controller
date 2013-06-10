package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListFileLockRequest extends Request {
    public ListFileLockRequest() {
        super(Module.SETTING, Function.LIST_FILE_LOCK);
    }
}
