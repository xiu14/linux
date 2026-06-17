package e.i.b.f.e;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f10031c = new b();
    private static final a a = new e.i.b.f.e.a("OUI_SDK", false, 2);
    private static int b = 31;

    public interface a {
        void a(String str, int i, String str2, Throwable th);
    }

    private b() {
    }

    public static final void a(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        int i = 24 & 8;
        int i2 = 24 & 16;
        if ((b & 2) == 0) {
            return;
        }
        a.a(str, 2, str2, null);
    }

    public static final void b(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        if ((b & 16) == 0) {
            return;
        }
        a.a(str, 16, str2, null);
    }

    public static final void c(String str, String str2, Throwable th) {
        l.f(str, "tag");
        l.f(str2, "msg");
        if ((b & 16) == 0) {
            return;
        }
        a.a(str, 16, str2, th);
    }

    public static final void d(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        int i = 24 & 8;
        int i2 = 24 & 16;
        if ((b & 4) == 0) {
            return;
        }
        a.a(str, 4, str2, null);
    }

    public static final void e(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        int i = 24 & 8;
        int i2 = 24 & 16;
        if ((b & 1) == 0) {
            return;
        }
        a.a(str, 1, str2, null);
    }

    public static final void f(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        int i = 24 & 8;
        int i2 = 24 & 16;
        if ((b & 8) == 0) {
            return;
        }
        a.a(str, 8, str2, null);
    }
}
