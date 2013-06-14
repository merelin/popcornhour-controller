package org.dyndns.merelin.pchrc.xmlapi.request.system;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class CaptureScreenRequest extends Request {
    public CaptureScreenRequest(String outputFile, String width, String height) {
        super(Module.SYSTEM, Function.CAPTURE_SCREEN, outputFile, width, height);
    }
}
