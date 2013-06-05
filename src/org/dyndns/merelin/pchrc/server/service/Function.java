package org.dyndns.merelin.pchrc.server.service;

public enum Function {
    // setting
    GET_TIME_ZONE("get_time_zone"),

    // playback
    LIST_VOD_SUPPORTED_FORMAT("list_vod_supported_format"),
    GET_CURRENT_AOD_INFO("get_current_aod_info"),
    GET_CURRENT_VOD_INFO("get_current_vod_info"),

    // file_operation
    LIST_USER_STORAGE_FILE("list_user_storage_file"),

    // network_browse
    LIST_NETWORK_RESOURCE("list_network_resource");

    private final String name;

    Function(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Function getFunction(String name) {
        if (name != null) {
            for (Function f : Function.values()) {
                if (f.name.equals(name)) {
                    return f;
                }
            }
        }

        throw new IllegalArgumentException("Unknown function name: " + name);
    }
}
