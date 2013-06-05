package org.dyndns.merelin.pchrc.server.service.request.module.fileoperation;

import org.dyndns.merelin.pchrc.server.service.Function;
import org.dyndns.merelin.pchrc.server.service.Module;
import org.dyndns.merelin.pchrc.server.service.request.Request;

public class ListUserStorageFileRequest extends Request {
    public ListUserStorageFileRequest(String... arguments) {
        super(Module.FILE_OPERATION, Function.LIST_USER_STORAGE_FILE, arguments);
    }
}
