package com.xiaomi.push;

import android.os.Build;

/* loaded from: classes2.dex */
public class l {
    private static long a;

    /* renamed from: a, reason: collision with other field name */
    private static String f924a;

    public static synchronized String a() {
        String str;
        synchronized (l.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - a) > com.heytap.mcssdk.constant.a.f6888f) {
                a = currentTimeMillis;
                f924a = Build.MODEL;
            }
            str = f924a;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }
}
