package com.example.lib;

import android.content.Context;

import java.util.List;

public class DeviceInfo {
    static {
        System.loadLibrary("native-lib");
    }
    public static String getAndroidId(Context context) {
        return getDeviceSerialFromJNI(context);
    }

    public static List<ApplicationPackage> getPackages(Context context) {
        return getInstalledPackagesFromJNI(context);
    }

    private static native String getDeviceSerialFromJNI(Context context);
    private static native List<ApplicationPackage> getInstalledPackagesFromJNI(Context context);
}
