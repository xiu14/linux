package com.bytedance.apm.y;

/* loaded from: classes.dex */
public class a {
    private static boolean a = true;
    private static b b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile e.b.b.h.b f3619c;

    public static void a(String str, String str2) {
        b bVar;
        if (!a || (bVar = b) == null) {
            return;
        }
        bVar.e(str, str2);
    }

    public static void b(String str, String str2) {
        b bVar;
        if (!a || (bVar = b) == null) {
            return;
        }
        bVar.i(str, str2);
    }

    public static boolean c() {
        return f3619c != null;
    }

    public static void d(String str, String str2) {
        if (f3619c != null) {
            f3619c.b(str, str2);
        }
    }

    public static void e(b bVar) {
        b = null;
    }

    public static void f(boolean z) {
        a = z;
    }

    public static void g(e.b.b.h.b bVar) {
        f3619c = null;
    }
}
