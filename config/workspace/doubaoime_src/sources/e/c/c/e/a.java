package e.c.c.e;

/* loaded from: classes2.dex */
public class a {
    public static final /* synthetic */ int a = 0;

    public static void a(Class<?> cls, String str, Object obj) {
        b bVar = b.b;
        if (bVar.e(3)) {
            bVar.a(cls.getSimpleName(), l(str, obj));
        }
    }

    public static void b(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        b bVar = b.b;
        if (bVar.e(3)) {
            bVar.a(cls.getSimpleName(), l(str, obj, obj2, obj3));
        }
    }

    public static void c(String str, String str2) {
        b bVar = b.b;
        if (bVar.e(3)) {
            bVar.a(str, str2);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        b bVar = b.b;
        if (bVar.e(3)) {
            bVar.a(str, l(str2, obj, obj2));
        }
    }

    public static void e(Class<?> cls, String str) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.c(cls.getSimpleName(), str);
        }
    }

    public static void f(Class<?> cls, String str, Throwable th) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.d(cls.getSimpleName(), str, th);
        }
    }

    public static void g(Class<?> cls, String str, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.c(cls.getSimpleName(), l(str, objArr));
        }
    }

    public static void h(Class<?> cls, Throwable th, String str, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.d(cls.getSimpleName(), l(str, objArr), th);
        }
    }

    public static void i(String str, String str2) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.c(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.d(str, str2, th);
        }
    }

    public static void k(String str, String str2, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.c(str, l(str2, objArr));
        }
    }

    private static String l(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static boolean m(int i) {
        return b.b.e(i);
    }

    public static void n(Class<?> cls, String str, Object obj) {
        b bVar = b.b;
        if (bVar.e(2)) {
            bVar.i(cls.getSimpleName(), l(str, obj));
        }
    }

    public static void o(Class<?> cls, String str, Object obj, Object obj2) {
        b bVar = b.b;
        if (bVar.e(2)) {
            bVar.i(cls.getSimpleName(), l(str, obj, obj2));
        }
    }

    public static void p(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (m(2)) {
            String l = l(str, obj, obj2, obj3);
            b bVar = b.b;
            if (bVar.e(2)) {
                bVar.i(cls.getSimpleName(), l);
            }
        }
    }

    public static void q(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        b bVar = b.b;
        if (bVar.e(2)) {
            bVar.i(cls.getSimpleName(), l(str, obj, obj2, obj3, obj4));
        }
    }

    public static void r(Class<?> cls, String str, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(2)) {
            bVar.i(cls.getSimpleName(), l(str, objArr));
        }
    }

    public static void s(String str, String str2, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(2)) {
            bVar.i(str, l(str2, objArr));
        }
    }

    public static void t(Class<?> cls, String str) {
        b bVar = b.b;
        if (bVar.e(5)) {
            bVar.j(cls.getSimpleName(), str);
        }
    }

    public static void u(Class<?> cls, String str, Throwable th) {
        b bVar = b.b;
        if (bVar.e(5)) {
            bVar.k(cls.getSimpleName(), str, th);
        }
    }

    public static void v(Class<?> cls, String str, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(5)) {
            bVar.j(cls.getSimpleName(), l(str, objArr));
        }
    }

    public static void w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (m(5)) {
            u(cls, l(str, objArr), th);
        }
    }

    public static void x(String str, String str2, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(5)) {
            bVar.j(str, l(str2, objArr));
        }
    }

    public static void y(String str, Throwable th, String str2, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(5)) {
            bVar.k(str, l(str2, objArr), th);
        }
    }

    public static void z(String str, String str2, Object... objArr) {
        b bVar = b.b;
        if (bVar.e(6)) {
            bVar.l(str, l(str2, objArr));
        }
    }
}
