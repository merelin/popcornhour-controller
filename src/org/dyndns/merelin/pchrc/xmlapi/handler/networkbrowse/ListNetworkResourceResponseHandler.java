package org.dyndns.merelin.pchrc.xmlapi.handler.networkbrowse;

import org.dyndns.merelin.pchrc.xmlapi.ResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.response.networkbrowse.ListNetworkResourceResponse;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class ListNetworkResourceResponseHandler
        implements ResponseHandler<ListNetworkResourceResponse> {
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {

    }

    public ListNetworkResourceResponse getResponse() {
        return null;
    }
}
