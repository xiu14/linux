package com.bytedance.android.input.common;

/* loaded from: classes.dex */
public final class o {
    private static int a;
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    private static int f2204c;

    /* renamed from: d, reason: collision with root package name */
    private static int f2205d;

    /* renamed from: e, reason: collision with root package name */
    private static int f2206e;

    public static final void a(int i) {
        f2204c += i;
    }

    public static final void b() {
        a++;
    }

    public static final void c() {
        b++;
        e.a.a.a.a.B0(e.a.a.a.a.M("addVoiceInputUseCounts, mVoiceInputUseCounts = "), b, "StatisticsData");
    }

    public static final void d(int i) {
        e.a.a.a.a.j0("addVoiceInputWordCounts count = ", i, "StatisticsData");
        f2205d += i;
    }

    public static final int e() {
        return f2206e;
    }

    public static final int f() {
        return f2204c;
    }

    public static final int g() {
        return a;
    }

    public static final int h() {
        return b;
    }

    public static final int i() {
        return f2205d;
    }

    public static final boolean j() {
        return a == 0 && b == 0 && f2204c == 0 && f2205d == 0;
    }

    public static final void k() {
        com.bytedance.android.input.r.j.i("StatisticsData", "reset");
        a = 0;
        b = 0;
        f2204c = 0;
        f2205d = 0;
        f2206e = 0;
    }

    public static final void l(int i) {
        f2206e = i;
    }
}
