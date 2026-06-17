package com.bytedance.ttnet.config;

/* loaded from: classes2.dex */
public class c {
    private static volatile c a;

    private c() {
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }
}
