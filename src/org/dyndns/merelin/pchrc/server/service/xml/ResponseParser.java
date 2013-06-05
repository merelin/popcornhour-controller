package org.dyndns.merelin.pchrc.server.service.xml;

import java.io.IOException;
import java.io.StringReader;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ResponseParser {
    private final String xml;

    public ResponseParser(String xml) {
        this.xml = xml;
    }

    public <T> ResponseHandler<T> parse() throws IOException, SAXException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        ResponseHandler<T> handler = new ResponseHandler<T>();
        reader.setContentHandler(handler);
        reader.parse(new InputSource(new StringReader(xml)));
        return handler;
    }
}
