package com.bytedance.crash;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;

/* loaded from: classes.dex */
public class D {
    private static boolean a = false;
    private static volatile int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f4383c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4384d = false;

    static class a {
        private static a a;

        private a(@NonNull Context context, @NonNull File file) {
            if (!e.a.a.a.a.Q0(file, CrashHianalyticsData.EVENT_ID_CRASH)) {
                com.bytedance.crash.a0.a.E();
            }
            com.bytedance.crash.crash.c.e(context, file);
            com.bytedance.crash.Q.a.c("Crash_Init");
            com.bytedance.crash.L.j.q(context, file);
            com.bytedance.crash.Q.a.c("Anr_Init");
            com.bytedance.crash.runtime.b.e(new B(this));
            com.bytedance.crash.a0.f.c().f(true);
            com.bytedance.crash.runtime.b.d(new C(this));
            com.bytedance.crash.Q.a.c("DefaultWorkThread_Init");
        }

        static void a(@NonNull Context context, @NonNull File file) {
            if (a == null) {
                synchronized (a.class) {
                    if (a == null) {
                        a = new a(context, file);
                    }
                }
            }
        }

        static boolean b() {
            return a != null;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    static class b {
        private static b a;

        private b() {
            com.bytedance.crash.runtime.b.d(new E(this));
        }

        static void a() {
            if (a == null) {
                synchronized (b.class) {
                    if (a == null) {
                        a = new b();
                    }
                }
            }
        }
    }

    public static boolean a() {
        return f4384d;
    }

    public static int b() {
        return b;
    }

    public static String c() {
        return f4383c;
    }

    public static void d(@NonNull Context context, @NonNull File file) {
        a.a(context, file);
    }

    public static void e() {
        b.a();
    }

    public static boolean f() {
        return a;
    }

    static void g(int i, String str) {
        b = i;
        f4383c = str;
    }

    public static void h(boolean z) {
        a = z;
    }

    public static void i(boolean z) {
        f4384d = z;
    }
}
