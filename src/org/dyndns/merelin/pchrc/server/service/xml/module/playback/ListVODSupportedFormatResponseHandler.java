package org.dyndns.merelin.pchrc.server.service.xml.module.playback;

import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.server.service.response.module.playback.ListVODSupportedFormatResponse;
import org.dyndns.merelin.pchrc.server.service.xml.ResponsePartHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class ListVODSupportedFormatResponseHandler
        implements ResponsePartHandler<ListVODSupportedFormatResponse> {
    private static final String FORMAT = "format";

    private List<String> formats = new ArrayList<String>();

    private final StringBuilder text = new StringBuilder();

    private enum State {
        UNKNOWN, FORMAT
    }

    private State state = State.UNKNOWN;

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        switch (state) {
        case UNKNOWN:
            if (FORMAT.equals(localName)) {
                state = State.FORMAT;
            }
            break;

        default:
            break;
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        String txt = text.toString();
        text.setLength(0);

        switch (state) {
        case UNKNOWN:
            break;

        case FORMAT:
            if (FORMAT.equals(localName)) {
                state = State.UNKNOWN;
                formats.add(txt);
            }
            break;
        }
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        switch (state) {
        case UNKNOWN:
            break;

        case FORMAT:
            text.append(ch, start, length);
            break;
        }
    }

    public ListVODSupportedFormatResponse getResponse() {
        return new ListVODSupportedFormatResponse(formats);
    }
}
