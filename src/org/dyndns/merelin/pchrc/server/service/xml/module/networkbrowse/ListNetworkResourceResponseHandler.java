package org.dyndns.merelin.pchrc.server.service.xml.module.networkbrowse;

import org.dyndns.merelin.pchrc.server.service.response.module.networkbrowse.ListNetworkResourceResponse;
import org.dyndns.merelin.pchrc.server.service.xml.ResponsePartHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class ListNetworkResourceResponseHandler
        implements ResponsePartHandler<ListNetworkResourceResponse> {
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
