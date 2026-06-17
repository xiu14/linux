package com.bytedance.feedbackerlib.model.j;

/* loaded from: classes.dex */
public class a {
    private static volatile int a;
    private static volatile int b;

    public static int a() {
        return a;
    }

    public static int b() {
        return b;
    }

    public static void c(int i) {
        a = i;
    }

    public static void d(int i) {
        b = i;
    }
}
