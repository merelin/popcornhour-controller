package org.dyndns.merelin.pchrc.xmlapi.response.fileoperation;

import java.util.List;

import org.dyndns.merelin.pchrc.xmlapi.model.File;

public class ListUserStorageFileResponse {
    private final int availableFiles;
    private final int availableFolders;
    private final String convertPath;
    private final List<File> files;
    private final int totalFiles;

    public ListUserStorageFileResponse(int availableFiles, int availableFolders,
            String convertPath, List<File> files, int totalFiles) {
        this.availableFiles = availableFiles;
        this.availableFolders = availableFolders;
        this.convertPath = convertPath;
        this.files = files;
        this.totalFiles = totalFiles;
    }

    public int getAvailableFiles() {
        return availableFiles;
    }

    public int getAvailableFolders() {
        return availableFolders;
    }

    public String getConvertPath() {
        return convertPath;
    }

    public List<File> getFiles() {
        return files;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("availableFiles: ");
        buf.append(availableFiles);
        buf.append(", availableFolders: ");
        buf.append(availableFolders);
        buf.append(", convertPath: ");
        buf.append(convertPath);
        buf.append(", files: ");
        buf.append(files);
        buf.append(", totalFiles: ");
        buf.append(totalFiles);

        return buf.toString();
    }
}
