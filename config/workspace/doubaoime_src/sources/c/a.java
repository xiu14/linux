package c;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a {
    private static final a b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f1238c;

    /* renamed from: d, reason: collision with root package name */
    static final int f1239d;

    /* renamed from: e, reason: collision with root package name */
    static final int f1240e;
    private final Executor a = new b(null);

    private static class b implements Executor {
        b(C0015a c0015a) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f1238c = availableProcessors;
        f1239d = availableProcessors + 1;
        f1240e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    public static Executor a() {
        return b.a;
    }
}
