package com.bytedance.bdinstall.util;

import android.os.SystemProperties;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes.dex */
public class q {
    private static volatile Object a;

    public static String a(String str) throws IllegalArgumentException {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                Object b = b();
                return (String) b.getClass().getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(b, str);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    private static Object b() {
        if (a == null) {
            synchronized (q.class) {
                if (a == null) {
                    try {
                        a = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return a;
    }
}
