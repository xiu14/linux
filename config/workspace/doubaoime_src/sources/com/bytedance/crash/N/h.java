package com.bytedance.crash.N;

import com.bytedance.crash.m;
import com.bytedance.crash.monitor.l;
import com.bytedance.frameworks.encryptor.EncryptorUtil;

/* loaded from: classes.dex */
public class h {
    private static long a = 8000;
    private static long b = 500;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4459c = false;

    /* renamed from: d, reason: collision with root package name */
    private static m f4460d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4461e = true;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4462f = true;

    static class a implements m {
        a() {
        }

        @Override // com.bytedance.crash.m
        public byte[] a(byte[] bArr) {
            return EncryptorUtil.a(bArr, bArr.length);
        }
    }

    public static long a() {
        return b;
    }

    public static m b() {
        return f4460d;
    }

    public static long c() {
        return a;
    }

    public static boolean d() {
        return f4459c;
    }

    public static boolean e() {
        return f4462f;
    }

    public static boolean f() {
        return f4459c && g();
    }

    public static boolean g() {
        String d2;
        com.bytedance.crash.monitor.a e2 = l.e();
        return (e2 == null || (d2 = e2.d()) == null || !d2.contains("test_crash")) ? false : true;
    }

    public static boolean h() {
        return f4461e;
    }

    public static void i(long j) {
        b = j;
    }

    public static void j(boolean z) {
        f4459c = z;
    }

    public static void k(m mVar) {
        if (mVar != null) {
            f4460d = mVar;
        }
    }

    public static void l(boolean z) {
        f4462f = z;
    }

    public static void m(long j) {
        a = j;
    }

    public static void n(boolean z) {
        f4461e = z;
    }
}
