package e.b.k.a;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c {
    private static ExecutorService a = a.a();

    public static void a(Runnable runnable) {
        if (runnable != null) {
            a.submit(runnable);
        }
    }
}
