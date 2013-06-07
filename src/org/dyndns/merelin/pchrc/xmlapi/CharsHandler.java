package org.dyndns.merelin.pchrc.xmlapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class CharsHandler implements BytesHandler {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private final StringBuilder content = new StringBuilder();
    private String encoding = DEFAULT_ENCODING;

    public void handle(HttpURLConnection connection) {
        String encoding = connection.getContentEncoding();
        if (encoding != null) {
            this.encoding = encoding;
        }
    }

    public void handle(byte[] bytes) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try {
            InputStreamReader reader = new InputStreamReader(in, encoding);
            for (int ch = reader.read(); ch >= 0; ch = reader.read()) {
                content.append((char) ch);
            }
        } finally {
            in.close();
        }
    }

    public String getContent() {
        return content.toString();
    }
}
