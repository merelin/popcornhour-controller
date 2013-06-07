package org.dyndns.merelin.pchrc.xmlapi;

import java.io.IOException;

import org.xml.sax.SAXException;

public class NMJFileDownloader extends RemoteService {
    public NMJFileDownloader(String host, int port) {
        super(host, port);
    }

    public String getText(String drive, String path) throws IOException {
        CharsHandler handler = new CharsHandler();
        call(handler, drive + path);

        return handler.getContent();
    }

    public byte[] getBinary(String drive, String path) throws IOException {
        ByteArrayHandler handler = new ByteArrayHandler();
        call(handler, drive + path);

        return handler.getContent();
    }

    public static void main(String[] args) throws IOException, SAXException {
        NMJFileDownloader service = new NMJFileDownloader("localhost", 8883);
        System.out.println("text:\n"
                + service.getText("drives/NETWORK_SHARE/share3", "/Audio/Music/Eric%20Clapton/Eric%20Clapton%20-%20Unplugged/Eric%20Clapton%20-%20Unplugged.cue"));
        System.out.println("\nbinary:\n"
                + new String(service.getBinary("drives/NETWORK_SHARE/share3", "/Audio/Music/Eric%20Clapton/Eric%20Clapton%20-%20Unplugged/Tau%20-%20Eric%20Clapton%20-%20Unplugged.jpg"),
                        "UTF-8"));
    }
}
