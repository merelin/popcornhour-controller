package org.dyndns.merelin.pchrc.xmlapi;

import java.io.IOException;
import java.net.HttpURLConnection;

public interface BytesHandler {
    public void handle(HttpURLConnection connection);
    public void handle(byte[] bytes) throws IOException;
}
