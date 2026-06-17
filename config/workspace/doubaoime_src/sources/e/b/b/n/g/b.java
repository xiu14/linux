package e.b.b.n.g;

import android.util.Log;

/* loaded from: classes.dex */
public class b {
    private static e.b.b.n.g.a a = new a();

    public static class a implements e.b.b.n.g.a {
        @Override // e.b.b.n.g.a
        public void a(String str, String str2, Throwable th) {
            if (e.b.b.n.a.b()) {
                Log.e(str, str2, th);
            }
        }

        @Override // e.b.b.n.g.a
        public void e(String str, String str2) {
            if (e.b.b.n.a.b()) {
                Log.e(str, str2);
            }
        }
    }

    public static void a(String str, String str2) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            if (e.b.b.n.a.b()) {
                Log.d(str, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            aVar.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            aVar.a(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            if (e.b.b.n.a.b()) {
                Log.i(str, str2);
            }
        }
    }

    public static void e(e.b.b.n.g.a aVar) {
        a = aVar;
    }

    public static void f(String str, String str2) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            if (e.b.b.n.a.b()) {
                Log.w(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th) {
        e.b.b.n.g.a aVar = a;
        if (aVar != null) {
            if (e.b.b.n.a.b()) {
                Log.w(str, str2, th);
            }
        }
    }
}
