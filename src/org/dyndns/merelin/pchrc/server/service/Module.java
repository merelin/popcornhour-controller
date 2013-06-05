package org.dyndns.merelin.pchrc.server.service;

public enum Module {
    SETTING("setting"),
    PLAYBACK("playback"),
    SYSTEM("system"),
    FILE_OPERATION("file_operation"),
    DOWNLOAD_MANAGER("download_manager"),
    DEPLOYMENT("deployment"),
    METADATA("metadata"),
    UPNP("upnp"),
    NETWORK_BROWSE("network_browse"),
    METADATA_DATABASE("metadata_database");

    private final String name;

    Module(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Module getModule(String name) {
        if (name != null) {
            for (Module m : Module.values()) {
                if (m.name.equals(name)) {
                    return m;
                }
            }
        }

        throw new IllegalArgumentException("Unknown module name: " + name);
    }
}
