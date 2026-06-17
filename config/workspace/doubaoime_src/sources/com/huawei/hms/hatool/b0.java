package com.huawei.hms.hatool;

import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class b0 {
    private static b0 b;

    /* renamed from: c, reason: collision with root package name */
    private static b0 f7331c;

    /* renamed from: d, reason: collision with root package name */
    private static b0 f7332d;
    private ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, com.heytap.mcssdk.constant.a.f6886d, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(DownloadSettingValues.SYNC_INTERVAL_MS_FG), new b());

    private static class a implements Runnable {
        private Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f7333d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f7334c;

        b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder M = e.a.a.a.a.M("FormalHASDK-base-");
            M.append(f7333d.getAndIncrement());
            this.f7334c = M.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.a, runnable, this.f7334c + this.b.getAndIncrement(), 0L);
        }
    }

    static {
        new b0();
        new b0();
        b = new b0();
        f7331c = new b0();
        f7332d = new b0();
    }

    private b0() {
    }

    public static b0 a() {
        return f7332d;
    }

    public static b0 b() {
        return f7331c;
    }

    public static b0 c() {
        return b;
    }

    public void a(g gVar) {
        try {
            this.a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
