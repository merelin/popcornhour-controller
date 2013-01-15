package org.dyndns.merelin.pchrc.server.service.xml;

import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.server.service.request.Request;
import org.dyndns.merelin.pchrc.server.service.response.Response;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ResponseHandler extends DefaultHandler {
    private Request request;
    private String module;
    private String function;
    private List<String> arguments = new ArrayList<String>();

    private Response response;
    private ResponsePartHandler responseHandler;

    private int returnValue;

    private final StringBuilder text = new StringBuilder();

    private enum State {
        UNKNOWN, THE_DAVID_BOX, REQUEST, RESPONSE, RETURN_VALUE
    }

    private State state = State.UNKNOWN;

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        switch (state) {
        case UNKNOWN:
            if ("theDavidBox".equals(localName)) {
                state = State.THE_DAVID_BOX;
            }
            break;

        case THE_DAVID_BOX:
            if ("request".equals(localName)) {
                state = State.REQUEST;
            } else if ("response".equals(localName)) {
                state = State.RESPONSE;
                responseHandler = ResponsePartHandlerFactory.create(request);
            } else if ("returnValue".equals(localName)) {
                state = State.RETURN_VALUE;
            }
            break;

        case REQUEST:
            break;

        case RESPONSE:
            responseHandler.startElement(uri, localName, qName, attributes);
            break;

        case RETURN_VALUE:
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

        case THE_DAVID_BOX:
            if ("theDavidBox".equals(localName)) {
                state = State.UNKNOWN;
            }
            break;

        case REQUEST:
            if ("request".equals(localName)) {
                state = State.THE_DAVID_BOX;
                String[] args = arguments.toArray(new String[arguments.size()]);
                request = new Request(module, function, args);
            } else if ("module".equals(localName)) {
                module = txt;
            } else if (localName.startsWith("arg")) {
                int index = Integer.parseInt(localName.substring(3));
                if (index == 0) {
                    function = txt;
                } else {
                    arguments.add(txt);
                }
            }
            break;

        case RESPONSE:
            if ("response".equals(localName)) {
                state = State.THE_DAVID_BOX;
            } else {
                responseHandler.endElement(uri, localName, qName);
            }
            break;

        case RETURN_VALUE:
            if ("returnValue".equals(localName)) {
                state = State.THE_DAVID_BOX;
                returnValue = Integer.parseInt(txt);
            }
            break;
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        switch (state) {
        case UNKNOWN:
        case THE_DAVID_BOX:
            break;

        case REQUEST:
        case RETURN_VALUE:
            text.append(ch, start, length);
            break;

        case RESPONSE:
            responseHandler.characters(ch, start, length);
            break;
        }
    }

    public Request getRequest() {
        return request;
    }

    public Response getResponse() {
        return response;
    }

    public int getReturnValue() {
        return returnValue;
    }
}
