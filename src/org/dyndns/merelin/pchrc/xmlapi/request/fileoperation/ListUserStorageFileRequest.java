package org.dyndns.merelin.pchrc.xmlapi.request.fileoperation;

import org.dyndns.merelin.pchrc.xmlapi.Function;
import org.dyndns.merelin.pchrc.xmlapi.Module;
import org.dyndns.merelin.pchrc.xmlapi.request.Request;

public class ListUserStorageFileRequest extends Request {
    public ListUserStorageFileRequest(String... arguments) {
        super(Module.FILE_OPERATION, Function.LIST_USER_STORAGE_FILE, arguments);
    }
}
