package org.dyndns.merelin.pchrc.xmlapi;

import java.io.IOException;
import java.io.StringReader;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ResultParser {
    private final String xml;

    public ResultParser(String xml) {
        this.xml = xml;
    }

    public <T> ResultHandler<T> parse() throws IOException, SAXException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        ResultHandler<T> handler = new ResultHandler<T>();
        reader.setContentHandler(handler);
        reader.parse(new InputSource(new StringReader(xml)));
        return handler;
    }
}
