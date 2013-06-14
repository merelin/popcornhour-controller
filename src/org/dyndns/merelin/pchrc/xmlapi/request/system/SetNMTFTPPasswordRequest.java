package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetNMTFTPPasswordRequest extends Request {
    public SetNMTFTPPasswordRequest(String currentPassword, String newPassword,
            String confirmPassword) {
        super(Module.SYSTEM, Function.SET_NMT_FTP_PASSWORD, currentPassword,
                newPassword, confirmPassword);
    }
}
