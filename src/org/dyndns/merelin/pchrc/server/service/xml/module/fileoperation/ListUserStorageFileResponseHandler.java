package org.dyndns.merelin.pchrc.server.service.xml.module.fileoperation;

import java.util.ArrayList;
import java.util.List;

import org.dyndns.merelin.pchrc.server.service.model.File;
import org.dyndns.merelin.pchrc.server.service.response.module.fileoperation.ListUserStorageFileResponse;
import org.dyndns.merelin.pchrc.server.service.xml.ResponsePartHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class ListUserStorageFileResponseHandler
        implements ResponsePartHandler<ListUserStorageFileResponse> {
    private static final String AVAILABLE_FILE = "availableFile";
    private static final String AVAILABLE_FOLDER = "availableFolder";
    private static final String CONVERT_PATH = "convertPath";
    private static final String FILE_LIST = "fileList";
    private static final String TOTAL_FILE = "totalFile";
    private static final String FILE = "file";
    private static final String DEVICE_TYPE = "device_type";
    private static final String IS_FOLDER = "isFolder";
    private static final String LAST_ACCESS_DATE = "lastAccessDate";
    private static final String MODIFY_DATE = "modifyDate";
    private static final String NAME = "name";
    private static final String PATH = "path";
    private static final String SIZE = "size";
    private static final String TYPE = "type";

    private int availableFiles;
    private int availableFolders;
    private String convertPath;
    private List<File> files = new ArrayList<File>();
    private int totalFiles;

    private String deviceType;
    private String isFolder;
    private String lastAccessDate;
    private String modifyDate;
    private String name;
    private String path;
    private String size;
    private String type;

    private final StringBuilder text = new StringBuilder();

    private enum State {
        UNKNOWN, AVAILABLE_FILE, AVAILABLE_FOLDER, CONVERT_PATH,
        FILE_LIST, TOTAL_FILE, FILE, DEVICE_TYPE, IS_FOLDER, LAST_ACCESS_DATE,
        MODIFY_DATE, NAME, PATH, SIZE, TYPE
    }

    private State state = State.UNKNOWN;

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        switch (state) {
        case UNKNOWN:
            if (AVAILABLE_FILE.equals(localName)) {
                state = State.AVAILABLE_FILE;
            } else if (AVAILABLE_FOLDER.equals(localName)) {
                state = State.AVAILABLE_FOLDER;
            } else if (CONVERT_PATH.equals(localName)) {
                state = State.CONVERT_PATH;
            } else if (FILE_LIST.equals(localName)) {
                state = State.FILE_LIST;
            } else if (TOTAL_FILE.equals(localName)) {
                state = State.TOTAL_FILE;
            }
            break;

        case FILE_LIST:
            if (FILE.equals(localName)) {
                state = State.FILE;
            }
            break;

        case FILE:
            if (DEVICE_TYPE.equals(localName)) {
                state = State.DEVICE_TYPE;
            } else if (IS_FOLDER.equals(localName)) {
                state = State.IS_FOLDER;
            } else if (LAST_ACCESS_DATE.equals(localName)) {
                state = State.LAST_ACCESS_DATE;
            } else if (MODIFY_DATE.equals(localName)) {
                state = State.MODIFY_DATE;
            } else if (NAME.equals(localName)) {
                state = State.NAME;
            } else if (PATH.equals(localName)) {
                state = State.PATH;
            } else if (SIZE.equals(localName)) {
                state = State.SIZE;
            } else if (TYPE.equals(localName)) {
                state = State.TYPE;
            }
            break;

        default:
            break;
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        String txt = text.toString();
        text.setLength(0);

        switch (state) {
        case UNKNOWN:
            break;

        case AVAILABLE_FILE:
            if (AVAILABLE_FILE.equals(localName)) {
                state = State.UNKNOWN;
                availableFiles = Integer.valueOf(txt);
            }
            break;

        case AVAILABLE_FOLDER:
            if (AVAILABLE_FOLDER.equals(localName)) {
                state = State.UNKNOWN;
                availableFolders = Integer.valueOf(txt);
            }
            break;

        case CONVERT_PATH:
            if (CONVERT_PATH.equals(localName)) {
                state = State.UNKNOWN;
                convertPath = txt;
            }
            break;

        case FILE_LIST:
            if (FILE_LIST.equals(localName)) {
                state = State.UNKNOWN;
            }
            break;

        case TOTAL_FILE:
            if (TOTAL_FILE.equals(localName)) {
                state = State.UNKNOWN;
                totalFiles = Integer.valueOf(txt);
            }
            break;

        case FILE:
            if (FILE.equals(localName)) {
                state = State.FILE_LIST;
                files.add(new File(deviceType, isFolder, lastAccessDate,
                        modifyDate, name, path, size, type));
            }
            break;

        case DEVICE_TYPE:
            if (DEVICE_TYPE.equals(localName)) {
                state = State.FILE;
                deviceType = txt;
            }
            break;

        case IS_FOLDER:
            if (IS_FOLDER.equals(localName)) {
                state = State.FILE;
                isFolder = txt;
            }
            break;

        case LAST_ACCESS_DATE:
            if (LAST_ACCESS_DATE.equals(localName)) {
                state = State.FILE;
                lastAccessDate = txt;
            }
            break;

        case MODIFY_DATE:
            if (MODIFY_DATE.equals(localName)) {
                state = State.FILE;
                modifyDate = txt;
            }
            break;

        case NAME:
            if (NAME.equals(localName)) {
                state = State.FILE;
                name = txt;
            }
            break;

        case PATH:
            if (PATH.equals(localName)) {
                state = State.FILE;
                path = txt;
            }
            break;

        case SIZE:
            if (SIZE.equals(localName)) {
                state = State.FILE;
                size = txt;
            }
            break;

        case TYPE:
            if (TYPE.equals(localName)) {
                state = State.FILE;
                type = txt;
            }
            break;
        }
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        switch (state) {
        case UNKNOWN:
        case FILE_LIST:
        case FILE:
            break;

        case AVAILABLE_FILE:
        case AVAILABLE_FOLDER:
        case CONVERT_PATH:
        case TOTAL_FILE:
        case DEVICE_TYPE:
        case IS_FOLDER:
        case LAST_ACCESS_DATE:
        case MODIFY_DATE:
        case NAME:
        case PATH:
        case SIZE:
        case TYPE:
            text.append(ch, start, length);
            break;
        }
    }

    public ListUserStorageFileResponse getResponse() {
        return new ListUserStorageFileResponse(availableFiles, availableFolders,
                convertPath, files, totalFiles);
    }
}
