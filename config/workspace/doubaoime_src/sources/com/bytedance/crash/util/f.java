package com.bytedance.crash.util;

@Deprecated
/* loaded from: classes.dex */
public class f {
    private static int a = -1;

    public static boolean a() {
        int i = a;
        if (i != -1) {
            return i == 1;
        }
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            a = 1;
        } catch (Throwable unused) {
            a = 0;
        }
        return a == 1;
    }
}
