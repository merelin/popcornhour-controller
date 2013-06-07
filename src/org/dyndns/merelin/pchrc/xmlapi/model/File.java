package org.dyndns.merelin.pchrc.xmlapi.model;

public class File {
    private final String deviceType;
    private final String isFolder;
    private final String lastAccessDate;
    private final String modifyDate;
    private final String name;
    private final String path;
    private final String size;
    private final String type;

    public File(String deviceType, String isFolder, String lastAccessDate,
            String modifyDate, String name, String path, String size, String type) {
        this.deviceType = deviceType;
        this.isFolder = isFolder;
        this.lastAccessDate = lastAccessDate;
        this.modifyDate = modifyDate;
        this.name = name;
        this.path = path;
        this.size = size;
        this.type = type;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getIsFolder() {
        return isFolder;
    }

    public String getLastAccessDate() {
        return lastAccessDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("deviceType: ");
        buf.append(deviceType);
        buf.append(", isFolder: ");
        buf.append(isFolder);
        buf.append(", lastAccessDate: ");
        buf.append(lastAccessDate);
        buf.append(", modifyDate: ");
        buf.append(modifyDate);
        buf.append(", name: ");
        buf.append(name);
        buf.append(", path: ");
        buf.append(path);
        buf.append(", size: ");
        buf.append(size);
        buf.append(", type: ");
        buf.append(type);

        return buf.toString();
    }
}
