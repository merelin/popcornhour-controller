package org.dyndns.merelin.pchrc.xmlapi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dyndns.merelin.pchrc.xmlapi.handler.setting.GetTimeZoneResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;
import org.dyndns.merelin.pchrc.xmlapi.request.fileoperation.ListUserStorageFileRequest;
import org.dyndns.merelin.pchrc.xmlapi.request.playback.GetCurrentVODInfoRequest;
import org.dyndns.merelin.pchrc.xmlapi.request.playback.ListVODSupportedFormatRequest;
import org.dyndns.merelin.pchrc.xmlapi.request.setting.GetTimeZoneRequest;
import org.dyndns.merelin.pchrc.xmlapi.response.fileoperation.ListUserStorageFileResponse;
import org.xml.sax.SAXException;

public class TheDavidBoxRemoteService extends RemoteService {
    private static final String MIMETYPE_XML = "text/xml";

    public TheDavidBoxRemoteService(String host, int port) {
        super(host, port);
    }

    public String call(Request request) throws IOException {
        String path = request.getModule().name().toLowerCase();
        List<String> params = new ArrayList<String>();
        params.add(request.getFunction().name().toLowerCase());
        params.addAll(Arrays.asList(request.getArguments()));

        CharsHandler handler = new CharsHandler();
        call(handler, path, params.toArray(new String[params.size()]));

        return handler.getContent();
    }

    protected void check(HttpURLConnection connection) throws IOException {
        super.check(connection);

        String type = connection.getContentType();
        if (!MIMETYPE_XML.equals(type)) {
            throw new IOException("HTTP content type: " + type);
        }
    }

    public static void main(String[] args) throws IOException, SAXException {
        TheDavidBoxRemoteService service = new TheDavidBoxRemoteService("localhost", 8008);
        String content = service.call(new GetTimeZoneRequest());
        ResultParser parser = new ResultParser(content);
        ResultHandler<GetTimeZoneResponseHandler> handler = parser.parse();

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
