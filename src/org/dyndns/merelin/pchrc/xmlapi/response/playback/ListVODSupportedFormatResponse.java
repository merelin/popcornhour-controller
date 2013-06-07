package org.dyndns.merelin.pchrc.xmlapi.response.playback;

import java.util.List;

public class ListVODSupportedFormatResponse {
    private final List<String> formats;

    public ListVODSupportedFormatResponse(List<String> formats) {
        this.formats = formats;
    }

    public List<String> getFormats() {
        return formats;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("formats: ");
        buf.append(formats);

        return buf.toString();
    }
}
