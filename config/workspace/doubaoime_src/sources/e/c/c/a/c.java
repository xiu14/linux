package e.c.c.a;

/* loaded from: classes2.dex */
public class c implements b {
    private static c a;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c();
            }
            cVar = a;
        }
        return cVar;
    }
}
