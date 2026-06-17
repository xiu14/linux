package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f7440f = new a();
    private final Object a = new Object();
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f7441c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f7442d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f7443e = new RunnableC0353a();

    /* renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    class RunnableC0353a implements Runnable {
        RunnableC0353a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f7440f;
    }

    public void a(Runnable runnable) {
        synchronized (this.a) {
            if (runnable == null) {
                return;
            }
            if (this.b) {
                return;
            }
            if (this.f7441c.size() >= 60) {
                return;
            }
            this.f7441c.add(runnable);
            this.f7442d.removeCallbacks(this.f7443e);
            this.f7442d.postDelayed(this.f7443e, com.heytap.mcssdk.constant.a.q);
        }
    }

    public void b() {
        synchronized (this.a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f7441c.size());
            this.b = true;
            try {
                Iterator<Runnable> it2 = this.f7441c.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                    it2.remove();
                }
            } catch (Throwable th) {
                HMSLog.e("AnalyticsCacheManager", "<execCacheBi> failed. " + th.getMessage());
                a();
            }
            this.b = false;
        }
    }

    public void a() {
        synchronized (this.a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f7441c.clear();
        }
    }
}
