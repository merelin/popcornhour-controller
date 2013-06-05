package org.dyndns.merelin.pchrc.server.service.response.module.playback;

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
