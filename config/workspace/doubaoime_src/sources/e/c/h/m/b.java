package e.c.h.m;

import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    private static volatile a a;

    public interface a {
    }

    private b() {
    }

    private static a a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new e.c.h.m.a();
                }
            }
        }
        return a;
    }

    public static boolean b() {
        Objects.requireNonNull(a());
        return false;
    }
}
