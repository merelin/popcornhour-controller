package org.dyndns.merelin.pchrc.server.service.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public interface ResponsePartHandler<T> {
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException;

    public void endElement(String uri, String localName, String qName)
            throws SAXException;

    public void characters(char[] ch, int start, int length) throws SAXException;

    public T getResponse();
}
