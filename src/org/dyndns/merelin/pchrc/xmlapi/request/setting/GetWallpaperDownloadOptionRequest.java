package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class GetWallpaperDownloadOptionRequest extends Request {
    public GetWallpaperDownloadOptionRequest() {
        super(Module.SETTING, Function.GET_WALLPAPER_DOWNLOAD_OPTION);
    }
}
