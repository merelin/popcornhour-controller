package org.dyndns.merelin.pchrc.server.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.dyndns.merelin.pchrc.server.service.request.Request;
import org.dyndns.merelin.pchrc.server.service.request.module.fileoperation.ListUserStorageFileRequest;
import org.dyndns.merelin.pchrc.server.service.request.module.playback.GetCurrentVODInfoRequest;
import org.dyndns.merelin.pchrc.server.service.request.module.playback.ListVODSupportedFormatRequest;
import org.dyndns.merelin.pchrc.server.service.request.module.setting.GetTimeZoneRequest;
import org.dyndns.merelin.pchrc.server.service.response.module.fileoperation.ListUserStorageFileResponse;
import org.dyndns.merelin.pchrc.server.service.xml.ResponseHandler;
import org.dyndns.merelin.pchrc.server.service.xml.ResponseParser;
import org.xml.sax.SAXException;

public class RemoteService {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private final String urlBase;

    public RemoteService(String ip, int port) {
        urlBase = "http://" + ip + ":" + port + "/";
    }

    public String call(Request request) throws IOException {
        URL url = assembleUrl(request);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setUseCaches(false);

        int code = connection.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP response code: " + code
                    + ", " + connection.getResponseMessage());
        }

        String type = connection.getContentType();
        if (!"text/xml".equals(type)) {
            throw new IOException("HTTP content type: " + type);
        }

        String encoding = connection.getContentEncoding();
        if (encoding == null) {
            encoding = DEFAULT_ENCODING;
        }

        InputStream in = connection.getInputStream();
        try {
            BufferedReader reader
                = new BufferedReader(new InputStreamReader(in, encoding));
            StringBuilder content = new StringBuilder();

            for (int ch = reader.read(); ch >= 0; ch = reader.read()) {
                content.append((char) ch);
            }

            return content.toString();
        } finally {
            in.close();
        }
    }

    private URL assembleUrl(Request request) throws MalformedURLException {
        StringBuilder buf = new StringBuilder();
        buf.append(urlBase);
        buf.append(request.getModule().getName());
        buf.append("?arg0=").append(request.getFunction().getName());
        String[] args = request.getArguments();

        for (int i = 0; i < args.length; i++) {
            buf.append("&arg").append(i + 1).append('=').append(args[i]);
        }

        return new URL(buf.toString());
    }

    public static void main(String[] args) throws IOException, SAXException {
        RemoteService service = new RemoteService("localhost", 8008);
        String content
            = service.call(new GetTimeZoneRequest());
        ResponseParser parser = new ResponseParser(content);
        ResponseHandler handler = parser.parse();

        System.out.println("returnValue: " + handler.getReturnValue());
        System.out.println("request: " + handler.getRequest());
        System.out.println("response: " + handler.getResponse());

//        String content
//            = service.call(new ListUserStorageFileRequest("/", "0", "100", "true", "true", "true", "", "name_asc", "false"));
//        ResponseParser parser = new ResponseParser(content);
//        ResponseHandler<ListUserStorageFileResponse> handler = parser.parse();
//
//        System.out.println("returnValue: " + handler.getReturnValue());
//        System.out.println("request: " + handler.getRequest());
//        System.out.println("response: " + handler.getResponse());
    }
}
