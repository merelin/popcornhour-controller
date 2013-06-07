package org.dyndns.merelin.pchrc.xmlapi;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteService {
    private static final int BUFFER_SIZE = 8192;

    private final String urlBase;

    public RemoteService(String host, int port) {
        urlBase = "http://" + host + ":" + port + "/";
    }

    public void call(BytesHandler handler, String path, String... params) throws IOException {
        URL url = assembleUrl(path, params);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setUseCaches(false);

        check(connection);
        handler.handle(connection);

        BufferedInputStream in
            = new BufferedInputStream(connection.getInputStream(), BUFFER_SIZE);
        try {
            byte[] buf = new byte[BUFFER_SIZE];

            for (int n = in.read(buf); n >= 0; n = in.read(buf)) {
                 if (n > 0) {
                     byte[] bytes = new byte[n];
                     System.arraycopy(buf, 0, bytes, 0, n);
                     handler.handle(bytes);
                 }
            }
        } finally {
            in.close();
        }
    }

    protected URL assembleUrl(String path, String... params) throws MalformedURLException {
        StringBuilder buf = new StringBuilder();
        buf.append(urlBase);
        buf.append(path);

        if (params.length > 0) {
            buf.append("?arg0=").append(params[0]);

            for (int i = 1; i < params.length; i++) {
                buf.append("&arg").append(i).append('=').append(params[i]);
            }
        }

        return new URL(buf.toString());
    }

    protected void check(HttpURLConnection connection) throws IOException {
        int code = connection.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP response code: " + code
                    + ", " + connection.getResponseMessage());
        }
    }
}
