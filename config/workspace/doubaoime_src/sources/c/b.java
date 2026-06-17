package c;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f1241c = new b();
    private final ExecutorService a;
    private final Executor b;

    /* renamed from: c.b$b, reason: collision with other inner class name */
    private static class ExecutorC0016b implements Executor {
        private ThreadLocal<Integer> a = new ThreadLocal<>();

        ExecutorC0016b(a aVar) {
        }

        private int a() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.a.remove();
            } else {
                this.a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.a.set(Integer.valueOf(intValue));
            try {
                if (intValue <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    private b() {
        ThreadPoolExecutor threadPoolExecutor;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            int i = c.a.f1239d;
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(c.a.f1239d, c.a.f1240e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = threadPoolExecutor2;
        } else {
            threadPoolExecutor = Executors.newCachedThreadPool();
        }
        this.a = threadPoolExecutor;
        Executors.newSingleThreadScheduledExecutor();
        this.b = new ExecutorC0016b(null);
    }

    public static ExecutorService a() {
        return f1241c.a;
    }

    static Executor b() {
        return f1241c.b;
    }
}
