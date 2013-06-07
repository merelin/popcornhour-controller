package org.dyndns.merelin.pchrc.xmlapi;

import org.dyndns.merelin.pchrc.xmlapi.handler.fileoperation.ListUserStorageFileResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.handler.networkbrowse.ListNetworkResourceResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.handler.playback.ListVODSupportedFormatResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.handler.setting.GetTimeZoneResponseHandler;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ResponseHandlerFactory {
    @SuppressWarnings("rawtypes")
    public static ResponseHandler create(Request request) {
        switch (request.getModule()) {
        case SETTING:
            switch (request.getFunction()) {
            case GET_TIME_ZONE:
                return new GetTimeZoneResponseHandler();

            default:
                break;
            }
            break;

        case PLAYBACK:
            switch (request.getFunction()) {
            case LIST_VOD_SUPPORTED_FORMAT:
                return new ListVODSupportedFormatResponseHandler();

            default:
                break;
            }
            break;

        case SYSTEM:
            break;

        case FILE_OPERATION:
            switch (request.getFunction()) {
            case LIST_USER_STORAGE_FILE:
                return new ListUserStorageFileResponseHandler();

            default:
                break;
            }
            break;

        case DOWNLOAD_MANAGER:
            break;

        case DEPLOYMENT:
            break;

        case METADATA:
            break;

        case UPNP:
            break;

        case NETWORK_BROWSE:
            switch (request.getFunction()) {
            case LIST_USER_STORAGE_FILE:
                return new ListNetworkResourceResponseHandler();

            default:
                break;
            }
            break;

        case METADATA_DATABASE:
            break;
        }

        return null;
    }
}
