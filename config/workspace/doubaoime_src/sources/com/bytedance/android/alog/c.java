package com.bytedance.android.alog;

import java.io.File;

@Deprecated
/* loaded from: classes.dex */
public class c {
    private static Alog a;

    public static void a() {
        Alog alog = a;
        if (alog != null) {
            alog.h();
        }
    }

    public static long b() {
        Alog alog = a;
        if (alog != null) {
            return alog.j();
        }
        return 0L;
    }

    public static File[] c(String str, String str2, long j, long j2) {
        Alog alog = a;
        return alog != null ? alog.k(null, null, j, j2) : new File[0];
    }

    @Deprecated
    public static void d(int i, String str, String str2, long j, long j2) {
        Alog alog = a;
        if (alog != null) {
            alog.r(i, str, str2, j, j2);
        }
    }

    public static void e(Alog alog) {
        a = alog;
        Alog.nativeSetDefaultInstance(alog == null ? 0L : alog.l());
    }

    public static void f(int i) {
        Alog alog = a;
        if (alog != null) {
            alog.n(i);
        }
    }

    public static void g(boolean z) {
        Alog alog = a;
        if (alog != null) {
            alog.o(z);
        }
    }

    public static void h() {
        Alog alog = a;
        if (alog != null) {
            alog.p();
        }
    }

    @Deprecated
    public static void i(int i, String str, String str2) {
        Alog alog = a;
        if (alog != null) {
            alog.q(i, str, str2);
        }
    }
}
