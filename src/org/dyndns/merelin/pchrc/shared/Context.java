package org.dyndns.merelin.pchrc.shared;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static final Map<String, Object> ctx = new HashMap<String, Object>();

    @SuppressWarnings("unchecked")
    public static synchronized <T> T get(String key) {
        return (T) ctx.get(key);
    }

    @SuppressWarnings("unchecked")
    public static synchronized <T> T put(String key, T value) {
        return (T) ctx.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public static synchronized <T> T remove(String key) {
        return (T) ctx.remove(key);
    }
}
