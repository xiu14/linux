package e.b.a.a.a.a;

import android.util.Log;

/* loaded from: classes.dex */
public class a {
    private static int a = 4;
    private static c b = b.C0418a.a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9361c = 0;

    private static final class b extends c {

        /* renamed from: e.b.a.a.a.a.a$b$a, reason: collision with other inner class name */
        private static class C0418a {
            private static final b a = new b(null);
        }

        b(C0417a c0417a) {
        }

        @Override // e.b.a.a.a.a.a.c
        public void b(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void c(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void d(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void e(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void f(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void g(String str, String str2, Throwable th) {
            Log.i(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void i(String str, String str2) {
            Log.v(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void j(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void k(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void l(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    public static abstract class c {
        public boolean a(int i) {
            return a.g() <= i;
        }

        public abstract void b(String str, String str2);

        public abstract void c(String str, String str2, Throwable th);

        public abstract void d(String str, String str2);

        public abstract void e(String str, String str2, Throwable th);

        public abstract void f(String str, String str2);

        public abstract void g(String str, String str2, Throwable th);

        public void h(String str, String str2) {
        }

        public abstract void i(String str, String str2);

        public abstract void j(String str, String str2, Throwable th);

        public abstract void k(String str, String str2);

        public abstract void l(String str, String str2, Throwable th);
    }

    public static void a(String str, String str2) {
        if (str2 != null && b.a(3)) {
            b.b(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && b.a(3)) {
            b.c(str, str2, th);
        }
    }

    public static boolean c() {
        return a <= 3;
    }

    public static void d(String str) {
        if (str != null && b.a(6)) {
            b.d("Logger", str);
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null && b.a(6)) {
            b.d(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && b.a(6)) {
            b.e(str, str2, th);
        }
    }

    public static int g() {
        return a;
    }

    public static void h(String str) {
        if (str != null && b.a(4)) {
            b.f("Logger", str);
        }
    }

    public static void i(String str, String str2) {
        if (str2 != null && b.a(4)) {
            b.f(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && b.a(4)) {
            b.g(str, str2, th);
        }
    }

    @Deprecated
    public static void k(String str) {
        if (b.a(3)) {
            b.h("Logger", str);
        }
    }

    @Deprecated
    public static void l(String str, String str2) {
        if (b.a(3)) {
            b.h(str, str2);
        }
    }

    public static void m(c cVar) {
        b = cVar;
    }

    public static void n(int i) {
        a = i;
    }

    public static void o(String str, String str2) {
        if (str2 != null && b.a(2)) {
            b.i(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && b.a(2)) {
            b.j(str, str2, th);
        }
    }

    public static void q(String str) {
        if (str != null && b.a(5)) {
            b.k("Logger", str);
        }
    }

    public static void r(String str, String str2) {
        if (str2 != null && b.a(5)) {
            b.k(str, str2);
        }
    }

    public static void s(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && b.a(5)) {
            b.l(str, str2, th);
        }
    }
}
