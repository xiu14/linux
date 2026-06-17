package com.xiaomi.push;

/* loaded from: classes2.dex */
public final class g {
    static final int a = a(1, 3);
    static final int b = a(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f9104c = a(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f9105d = a(3, 2);

    static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
