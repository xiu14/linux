package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class F0 {
    public static final F0 a = null;
    private static final ThreadLocal<Y> b = new ThreadLocal<>();

    public static final Y a() {
        ThreadLocal<Y> threadLocal = b;
        Y y = threadLocal.get();
        if (y != null) {
            return y;
        }
        C0804g c0804g = new C0804g(Thread.currentThread());
        threadLocal.set(c0804g);
        return c0804g;
    }

    public static final void b() {
        b.set(null);
    }

    public static final void c(Y y) {
        b.set(y);
    }
}
