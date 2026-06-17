package com.bytedance.crash.Q;

import android.os.SystemClock;
import com.bytedance.crash.Q.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static a f4472d;
    private final JSONObject a = new JSONObject();
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private long f4473c;

    /* renamed from: com.bytedance.crash.Q.a$a, reason: collision with other inner class name */
    static class RunnableC0198a implements Runnable {
        RunnableC0198a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.d();
        }
    }

    private a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.b = uptimeMillis;
        this.f4473c = uptimeMillis;
    }

    public static void a() {
        if (f4472d == null) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            a aVar = f4472d;
            aVar.a.put("total", uptimeMillis - aVar.b);
        } catch (Throwable unused) {
        }
        com.bytedance.crash.runtime.b.d(new RunnableC0198a());
    }

    public static void b() {
        if (f4472d == null) {
            f4472d = new a();
        }
    }

    public static void c(String str) {
        if (f4472d == null) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            a aVar = f4472d;
            aVar.a.put(str, uptimeMillis - aVar.f4473c);
            f4472d.f4473c = uptimeMillis;
        } catch (Throwable unused) {
        }
    }

    public static void d() {
        if (f4472d != null) {
            b.C0199b c0199b = new b.C0199b("npthStart");
            c0199b.b(f4472d.a);
            c0199b.d();
            f4472d = null;
        }
    }
}
