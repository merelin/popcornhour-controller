package org.dyndns.merelin.pchrc.server.service.response;

public class Response {
    private final String xml;

    public Response(String xml) {
        this.xml = xml;
    }

    public String getXml() {
        return xml;
    }
}
