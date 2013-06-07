package org.dyndns.merelin.pchrc.xmlapi;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public interface ResponseHandler<T> {
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException;

    public void endElement(String uri, String localName, String qName)
            throws SAXException;

    public void characters(char[] ch, int start, int length) throws SAXException;

    public T getResponse();
}
