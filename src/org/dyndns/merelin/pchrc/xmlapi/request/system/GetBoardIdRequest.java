package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetBoardIdRequest extends Request {
    public GetBoardIdRequest() {
        super(Module.SYSTEM, Function.GET_BOARD_ID);
    }
}
