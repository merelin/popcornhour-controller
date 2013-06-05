package org.dyndns.merelin.pchrc.server.service.xml.module.setting;

import org.dyndns.merelin.pchrc.server.service.response.module.setting.GetTimeZoneResponse;
import org.dyndns.merelin.pchrc.server.service.xml.ResponsePartHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class GetTimeZoneResponseHandler
        implements ResponsePartHandler<GetTimeZoneResponse> {
    private static final String TIMEZONE = "timeZone";

    private String timeZone;

    private final StringBuilder text = new StringBuilder();

    private enum State {
        UNKNOWN, TIMEZONE
    }

    private State state = State.UNKNOWN;

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        switch (state) {
        case UNKNOWN:
            if (TIMEZONE.equals(localName)) {
                state = State.TIMEZONE;
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

        case TIMEZONE:
            if (TIMEZONE.equals(localName)) {
                state = State.UNKNOWN;
                timeZone = txt;
            }
            break;
        }
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        switch (state) {
        case UNKNOWN:
            break;

        case TIMEZONE:
            text.append(ch, start, length);
            break;
        }
    }

    public GetTimeZoneResponse getResponse() {
        return new GetTimeZoneResponse(timeZone);
    }
}
