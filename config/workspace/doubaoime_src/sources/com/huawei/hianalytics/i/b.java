package com.huawei.hianalytics.i;

import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b {
    private ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, com.heytap.mcssdk.constant.a.f6886d, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(DownloadSettingValues.SYNC_INTERVAL_MS_FG));
    private static b b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static b f7123c = new b();

    /* renamed from: e, reason: collision with root package name */
    private static b f7125e = new b();

    /* renamed from: d, reason: collision with root package name */
    private static b f7124d = new b();

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
                    com.huawei.hianalytics.g.b.c("TaskThread", "InnerTask : Exception has happened,From internal operations!");
                } catch (Throwable unused2) {
                    com.huawei.hianalytics.g.b.c("TaskThread", "InnerTask: error has happened");
                }
            }
        }
    }

    private b() {
    }

    public static b a() {
        return b;
    }

    public static b b() {
        return f7123c;
    }

    public static b c() {
        return f7124d;
    }

    public static b d() {
        return f7125e;
    }

    public void a(com.huawei.hianalytics.i.a aVar) {
        try {
            this.a.execute(new a(aVar));
        } catch (RejectedExecutionException unused) {
            com.huawei.hianalytics.g.b.c("TaskThread", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
