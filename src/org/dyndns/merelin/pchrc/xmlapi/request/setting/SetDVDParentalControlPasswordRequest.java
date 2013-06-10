package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDVDParentalControlPasswordRequest extends Request {
    public SetDVDParentalControlPasswordRequest(String currentPassword,
            String newPassword, String confirmPassword) {
        super(Module.SETTING, Function.SET_DVD_PARENTAL_CONTROL_PASSWORD,
                currentPassword, newPassword, confirmPassword);
    }
}
