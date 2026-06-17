package com.xiaomi.push;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* renamed from: com.xiaomi.push.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0779r {
    public static String a(String str, String str2) {
        try {
            return (String) t.a(null, "android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("SystemProperties.get: " + e2);
            return str2;
        }
    }

    public static String a(String str) {
        return a(str, "");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m667a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            t.a(null, "android.os.SystemProperties").getMethod("set", String.class, String.class).invoke(null, str, str2);
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("SystemProperties.set: " + e2);
            return false;
        }
    }
}
