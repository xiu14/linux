package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;

/* loaded from: classes2.dex */
public class d {
    public static final int a;
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C0720c f6500c;

    static {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
        b = 384;
    }

    @ThreadSafe
    public static C0720c a() {
        if (f6500c == null) {
            synchronized (d.class) {
                if (f6500c == null) {
                    f6500c = new C0720c(b, a);
                }
            }
        }
        return f6500c;
    }
}
