package e.c.h.f;

/* loaded from: classes2.dex */
public class w implements p {
    private static w a;

    private w() {
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (a == null) {
                a = new w();
            }
            wVar = a;
        }
        return wVar;
    }
}
