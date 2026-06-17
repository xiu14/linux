package d.a.c;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    public static final b b = new b();
    private static d.a.b.b<a> a = new d.a.b.b<>(new c());

    private b() {
    }

    private final String c(String str) {
        return e.a.a.a.a.s("EPKN.-", str);
    }

    public final void a(String str, String str2) {
        l.g(str, "tag");
        l.g(str2, "message");
        if (a.a().c()) {
            a.a().e(c(str), str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        l.g(str, "tag");
        l.g(str2, "message");
        if (th != null) {
            a.a().a(b.c(str), str2, th);
        } else {
            a.a().b(c(str), str2);
        }
    }

    public final void d(a aVar) {
        l.g(aVar, "logger");
        d.a.b.b<a> bVar = a;
        l.g(bVar, "$this$value");
        bVar.b(aVar);
    }

    public final void e(String str, String str2) {
        l.g(str, "tag");
        l.g(str2, "message");
        if (a.a().c()) {
            a.a().d(c(str), str2);
        }
    }
}
