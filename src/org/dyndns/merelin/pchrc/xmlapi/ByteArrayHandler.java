package org.dyndns.merelin.pchrc.xmlapi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

public class ByteArrayHandler implements BytesHandler {
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void handle(HttpURLConnection connection) {
    }

    public void handle(byte[] bytes) throws IOException {
        content.write(bytes);
    }

    public byte[] getContent() {
        return content.toByteArray();
    }
}
