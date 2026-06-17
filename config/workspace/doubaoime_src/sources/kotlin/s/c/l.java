package kotlin.s.c;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class l {
    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(e.a.a.a.a.s(str, " must not be null"));
        j(illegalStateException, l.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(e.a.a.a.a.s(str, " must not be null"));
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(h(str));
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
        j(illegalArgumentException, l.class.getName());
        throw illegalArgumentException;
    }

    private static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder W = e.a.a.a.a.W("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        W.append(str);
        return W.toString();
    }

    public static void i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    static <T extends Throwable> T j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void k() {
        kotlin.d dVar = new kotlin.d();
        j(dVar, l.class.getName());
        throw dVar;
    }

    public static void l(String str) {
        kotlin.n nVar = new kotlin.n(e.a.a.a.a.t("lateinit property ", str, " has not been initialized"));
        j(nVar, l.class.getName());
        throw nVar;
    }
}
