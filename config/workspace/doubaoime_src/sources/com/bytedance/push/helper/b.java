package com.bytedance.push.helper;

/* loaded from: classes2.dex */
public class b {
    private static Boolean a;

    public static void a(Throwable th, String str) {
        Boolean bool = a;
        if (bool == null || bool.booleanValue()) {
            try {
                com.bytedance.services.apm.api.a.e(th, str);
                a = Boolean.TRUE;
            } catch (Throwable unused) {
                a = Boolean.FALSE;
            }
        }
    }
}
