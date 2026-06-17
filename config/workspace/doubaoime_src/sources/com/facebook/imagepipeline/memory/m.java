package com.facebook.imagepipeline.memory;

/* loaded from: classes2.dex */
public class m {
    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    static void b(int i, int i2, int i3, int i4, int i5) {
        e.c.c.d.h.a(i4 >= 0);
        e.c.c.d.h.a(i >= 0);
        e.c.c.d.h.a(i3 >= 0);
        e.c.c.d.h.a(i + i4 <= i5);
        e.c.c.d.h.a(i3 + i4 <= i2);
    }
}
