package com.bytedance.common.graphics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.bytedance.monitor.collector.j;
import e.b.b.m.g.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes.dex */
public class GraphicsMonitor {
    private static final long COLLECT_WINDOWS = 100;
    private static final String MTK = "mt";
    private static final long POLL_INTERVAL = 15000;
    private static ScheduledFuture<?> gpuFuture = null;
    private static double gpuLoadDataOnce = -1.0d;
    private static ScheduledExecutorService gpuScheduleService = null;
    private static boolean isInit = false;
    private static boolean isInitGraphicsLoad = false;
    private static volatile boolean isPause = false;
    private static e.b.b.m.g.a lifecycleService;
    private static long sCollectInterval;
    private static long sCollectWindow;
    private static int startTime;

    static class a implements c {
        a() {
        }

        @Override // e.b.b.m.g.c
        public void a(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityPause(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityResume(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onActivityStarted(Activity activity) {
        }

        @Override // e.b.b.m.g.c
        public void onBackground(Activity activity) {
            boolean unused = GraphicsMonitor.isPause = true;
        }

        @Override // e.b.b.m.g.c
        public void onFront(Activity activity) {
            boolean unused = GraphicsMonitor.isPause = false;
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (GraphicsMonitor.isPause) {
                    double unused = GraphicsMonitor.gpuLoadDataOnce = -1.0d;
                } else {
                    GraphicsMonitor.openStatistical();
                    Thread.sleep(GraphicsMonitor.sCollectWindow);
                    GraphicsMonitor.closeStatistical();
                    double unused2 = GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
                }
                Log.i("atrace_gpu", "bytegpu: " + GraphicsMonitor.gpuLoadDataOnce);
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static native void closeStatistical();

    public static synchronized double getByteGpu() {
        double d2;
        synchronized (GraphicsMonitor.class) {
            d2 = gpuLoadDataOnce;
        }
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static native double getStatisticOnceData();

    public static synchronized void init() {
        synchronized (GraphicsMonitor.class) {
            if (isInit) {
                return;
            }
            isInit = true;
            sCollectInterval = POLL_INTERVAL;
            sCollectWindow = COLLECT_WINDOWS;
            e.b.b.m.g.a aVar = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
            lifecycleService = aVar;
            aVar.b(new a());
            if (lifecycleService.isForeground()) {
                isPause = false;
            }
        }
    }

    @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
    private static void initGraphicsLoad() {
        isInitGraphicsLoad = true;
        try {
            j.m(e.b.b.n.a.a());
            startHook();
            gpuScheduleService = Executors.newScheduledThreadPool(0);
        } catch (Throwable unused) {
            isInitGraphicsLoad = false;
        }
    }

    public static synchronized boolean isStart() {
        boolean z;
        synchronized (GraphicsMonitor.class) {
            z = startTime > 0;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static native void openStatistical();

    public static synchronized void start() {
        synchronized (GraphicsMonitor.class) {
            if (isInit) {
                if (!isInitGraphicsLoad) {
                    initGraphicsLoad();
                }
                ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
                if (scheduledExecutorService == null) {
                    return;
                }
                int i = startTime + 1;
                startTime = i;
                if (i > 1) {
                    return;
                }
                b bVar = new b();
                long j = sCollectInterval;
                gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(bVar, j, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Keep
    private static native boolean startHook();

    public static synchronized void stop() {
        synchronized (GraphicsMonitor.class) {
            if (isInit && isStart()) {
                int i = startTime - 1;
                startTime = i;
                if (i > 0) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = gpuFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                gpuLoadDataOnce = -1.0d;
            }
        }
    }
}
