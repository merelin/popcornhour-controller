package org.dyndns.merelin.pchrc.server.service.xml;

import org.dyndns.merelin.pchrc.server.service.request.Request;

public class ResponsePartHandlerFactory {
    public static ResponsePartHandler create(Request request) {
        if ("setting".equals(request.getModule())) {
            
        } else if ("playback".equals(request.getModule())) {
            
        } else if ("system".equals(request.getModule())) {
            
        } else if ("file_operation".equals(request.getModule())) {
            
        } else if ("download_manager".equals(request.getModule())) {
            
        } else if ("deployment".equals(request.getModule())) {
            
        } else if ("metadata".equals(request.getModule())) {
            
        } else if ("upnp".equals(request.getModule())) {
            
        } else if ("network_browse".equals(request.getModule())) {
            
        } else if ("metadata_database".equals(request.getModule())) {
            
        }

        return new ResponsePartHandler();
    }
}
