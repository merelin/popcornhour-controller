package org.dyndns.merelin.pchrc.xmlapi;

import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.xmlapi.request.Request;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ResultHandler<T> extends DefaultHandler {
    private Request request;
    private Module module;
    private Function function;
    private List<String> arguments = new ArrayList<String>();

    private ResponseHandler<T> responseHandler;

    private int returnValue;

    private final StringBuilder text = new StringBuilder();

    private enum State {
        UNKNOWN, THE_DAVID_BOX, REQUEST, RESPONSE, RETURN_VALUE
    }

    private State state = State.UNKNOWN;

    @SuppressWarnings("unchecked")
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        switch (state) {
        case UNKNOWN:
            if (Tags.THE_DAVID_BOX.equals(localName)) {
                state = State.THE_DAVID_BOX;
            }
            break;

        case THE_DAVID_BOX:
            if (Tags.REQUEST.equals(localName)) {
                state = State.REQUEST;
            } else if (Tags.RESPONSE.equals(localName)) {
                state = State.RESPONSE;
                responseHandler = ResponseHandlerFactory.create(request);
            } else if (Tags.RETURN_VALUE.equals(localName)) {
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
            if (Tags.THE_DAVID_BOX.equals(localName)) {
                state = State.UNKNOWN;
            }
            break;

        case REQUEST:
            if (Tags.REQUEST.equals(localName)) {
                state = State.THE_DAVID_BOX;
                String[] args = arguments.toArray(new String[arguments.size()]);
                request = new Request(module, function, args);
            } else if (Tags.MODULE.equals(localName)) {
                module = Module.valueOf(txt.toUpperCase());
            } else if (localName.startsWith(Tags.ARGUMENT)) {
                int index = Integer.parseInt(localName.substring(3));
                if (index == 0) {
                    function = Function.valueOf(txt.toUpperCase());
                } else {
                    arguments.add(txt);
                }
            }
            break;

        case RESPONSE:
            if (Tags.RESPONSE.equals(localName)) {
                state = State.THE_DAVID_BOX;
            } else {
                responseHandler.endElement(uri, localName, qName);
            }
            break;

        case RETURN_VALUE:
            if (Tags.RETURN_VALUE.equals(localName)) {
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

    public T getResponse() {
        return responseHandler.getResponse();
    }

    public int getReturnValue() {
        return returnValue;
    }
}
