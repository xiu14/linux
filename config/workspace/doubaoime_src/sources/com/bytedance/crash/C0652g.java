package com.bytedance.crash;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Objects;

/* renamed from: com.bytedance.crash.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0652g {

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0652g f4615g = null;
    private static String h = "default";
    private static volatile boolean i;
    private static String j;
    private static l k;
    private Context a;
    private File b;

    /* renamed from: c, reason: collision with root package name */
    private Application f4616c;

    /* renamed from: e, reason: collision with root package name */
    private long f4618e;

    /* renamed from: d, reason: collision with root package name */
    private long f4617d = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    private final long f4619f = SystemClock.uptimeMillis();

    private C0652g() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4618e = elapsedRealtime;
        this.f4617d -= elapsedRealtime - Process.getStartElapsedRealtime();
    }

    @NonNull
    private static C0652g a() {
        if (f4615g == null) {
            synchronized (C0652g.class) {
                if (f4615g == null) {
                    f4615g = new C0652g();
                }
            }
        }
        return f4615g;
    }

    public static long b() {
        return a().f4617d;
    }

    public static long c() {
        return a().f4619f;
    }

    @Nullable
    public static Application d() {
        return a().f4616c;
    }

    public static String e() {
        return h;
    }

    public static String f() {
        File file = new File(k(), "configs");
        if (!file.exists()) {
            com.bytedance.android.input.k.b.a.m(file);
        }
        return file.getAbsolutePath();
    }

    @Nullable
    public static Context g() {
        return a().a;
    }

    public static l h() {
        return k;
    }

    public static long i() {
        return a().f4618e;
    }

    @Nullable
    public static String j() {
        return j;
    }

    @Nullable
    public static File k() {
        return a().b;
    }

    public static boolean l() {
        return i;
    }

    public static void m(int i2) {
        Objects.requireNonNull(a());
    }

    public static void n(Long l) {
        a().f4617d = l.longValue() < a().f4617d ? l.longValue() : a().f4617d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(long r2, long r4, long r6, java.lang.String r8) {
        /*
            java.lang.String r0 = com.bytedance.crash.C0652g.j
            if (r0 != 0) goto L36
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L2e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L2e
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "version_code"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "update_version_code"
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "version_name"
            r0.put(r2, r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "manifest_version_code"
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            com.bytedance.crash.C0652g.j = r2
            if (r2 == 0) goto L36
            com.bytedance.crash.jni.NativeBridge.S(r2)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.C0652g.o(long, long, long, java.lang.String):void");
    }

    public static void p(Application application) {
        if (a().f4616c == null) {
            a().f4616c = application;
        }
    }

    static void q(String str) {
        h = str;
    }

    public static void r(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        C0652g a = a();
        if (a.f4616c == null) {
            if (context instanceof Application) {
                a.f4616c = (Application) context;
            } else {
                a.f4616c = (Application) context.getApplicationContext();
            }
        }
        if (a.a == null) {
            synchronized (a) {
                if (a.a == null) {
                    a.a = context;
                }
            }
        }
        if (a.b == null) {
            synchronized (a) {
                if (a.b == null) {
                    a.b = com.bytedance.android.input.k.b.a.n(context.getFilesDir(), "npth");
                }
            }
        }
    }

    public static void s(l lVar) {
        k = lVar;
    }

    public static void t(boolean z) {
        i = z;
    }
}
