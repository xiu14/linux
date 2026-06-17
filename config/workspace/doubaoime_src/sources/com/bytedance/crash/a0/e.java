package com.bytedance.crash.a0;

/* loaded from: classes.dex */
public class e {
    private static volatile e b;
    private int a;

    public static int b() {
        return c().a;
    }

    static e c() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }
}
