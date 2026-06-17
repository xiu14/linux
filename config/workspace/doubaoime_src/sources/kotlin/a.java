package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public final class a {
    public static void a(Throwable th, Throwable th2) {
        kotlin.s.c.l.f(th, "<this>");
        kotlin.s.c.l.f(th2, "exception");
        if (th != th2) {
            kotlin.internal.b.a.a(th, th2);
        }
    }

    public static <T> e<T> b(LazyThreadSafetyMode lazyThreadSafetyMode, kotlin.s.b.a<? extends T> aVar) {
        kotlin.s.c.l.f(lazyThreadSafetyMode, "mode");
        kotlin.s.c.l.f(aVar, "initializer");
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal == 0) {
            return new j(aVar, null, 2);
        }
        if (ordinal == 1) {
            return new i(aVar);
        }
        if (ordinal == 2) {
            return new p(aVar);
        }
        throw new f();
    }

    public static <T> e<T> c(kotlin.s.b.a<? extends T> aVar) {
        kotlin.s.c.l.f(aVar, "initializer");
        return new j(aVar, null, 2);
    }

    public static String d(Throwable th) {
        kotlin.s.c.l.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.s.c.l.e(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
