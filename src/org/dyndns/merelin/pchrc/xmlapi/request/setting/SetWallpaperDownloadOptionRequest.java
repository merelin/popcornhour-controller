package org.dyndns.merelin.pchrc.xmlapi.request.setting;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class SetWallpaperDownloadOptionRequest extends Request {
    public SetWallpaperDownloadOptionRequest(String options) {
        super(Module.SETTING, Function.SET_WALLPAPER_DOWNLOAD_OPTION, options);
    }
}
