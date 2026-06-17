package com.heytap.mcssdk.utils;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes2.dex */
public class h {
    public static int a(String str, int i) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a(String str, boolean z) {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
