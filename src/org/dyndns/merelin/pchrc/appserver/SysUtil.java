package org.dyndns.merelin.pchrc.appserver;

public class SysUtil {
    public static String getString(String name) {
        return System.getProperty(name);
    }

    public static int getInt(String name) {
        return Integer.valueOf(getString(name));
    }

    public static void setString(String name, String value) {
        System.setProperty(name, value);
    }

    public static void setInt(String name, int value) {
        setString(name, String.valueOf(value));
    }
}
