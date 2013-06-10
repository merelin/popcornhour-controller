package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetDVDParentalControlLevelRequest extends Request {
    public SetDVDParentalControlLevelRequest(String dvdParentalControlLevel,
            String password) {
        super(Module.SETTING, Function.SET_DVD_PARENTAL_CONTROL_LEVEL,
                dvdParentalControlLevel, password);
    }
}
