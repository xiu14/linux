package com.bytedance.retrofit2;

/* renamed from: com.bytedance.retrofit2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0697a {
    private static volatile long a = 0;
    private static volatile boolean b = false;

    public static long a() {
        return a;
    }

    public static void b() {
        if (b) {
            b = false;
            a++;
        }
    }

    public static void c() {
        if (b) {
            return;
        }
        b = true;
        a++;
    }
}
