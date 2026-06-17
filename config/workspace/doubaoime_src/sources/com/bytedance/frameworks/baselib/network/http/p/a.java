package com.bytedance.frameworks.baselib.network.http.p;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static a f5226d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final String f5227e = "a";
    private ScheduledThreadPoolExecutor a;
    private ConcurrentHashMap<com.bytedance.frameworks.baselib.network.http.p.b, ScheduledFuture> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<com.bytedance.frameworks.baselib.network.http.p.b, Runnable> f5228c = new ConcurrentHashMap<>();

    private class b implements Runnable {
        private com.bytedance.frameworks.baselib.network.http.p.b a;

        b(com.bytedance.frameworks.baselib.network.http.p.b bVar, C0258a c0258a) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.a.run();
                if (Logger.debug()) {
                    Logger.d(a.f5227e, "Task execute time: " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Throwable th) {
                try {
                    Logger.e(a.f5227e, "thread " + Thread.currentThread().getName() + " exception", th);
                    if (this.a.d()) {
                    }
                } finally {
                    if (!this.a.d()) {
                        a.this.b.remove(this.a);
                        a.this.f5228c.remove(this.a);
                    }
                }
            }
        }
    }

    private a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new j("ttnet-io"));
        this.a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
    }

    public static a d() {
        if (f5226d == null) {
            synchronized (a.class) {
                if (f5226d == null) {
                    f5226d = new a();
                }
            }
        }
        return f5226d;
    }

    public void e(com.bytedance.frameworks.baselib.network.http.p.b bVar) {
        try {
            b bVar2 = new b(bVar, null);
            ScheduledFuture<?> scheduleWithFixedDelay = bVar.d() ? this.a.scheduleWithFixedDelay(bVar2, bVar.a(), bVar.b(), TimeUnit.MILLISECONDS) : this.a.schedule(bVar2, bVar.a(), TimeUnit.MILLISECONDS);
            this.f5228c.put(bVar, bVar2);
            this.b.put(bVar, scheduleWithFixedDelay);
        } catch (Throwable th) {
            Logger.e(f5227e, "sendTask failed.", th);
        }
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Iterator<Map.Entry<com.bytedance.frameworks.baselib.network.http.p.b, Runnable>> it2 = this.f5228c.entrySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.frameworks.baselib.network.http.p.b key = it2.next().getKey();
                if (str.equals(key.c())) {
                    it2.remove();
                    this.a.remove(key);
                }
            }
            Iterator<Map.Entry<com.bytedance.frameworks.baselib.network.http.p.b, ScheduledFuture>> it3 = this.b.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<com.bytedance.frameworks.baselib.network.http.p.b, ScheduledFuture> next = it3.next();
                if (str.equals(next.getKey().c())) {
                    ScheduledFuture value = next.getValue();
                    if (value != null) {
                        value.cancel(true);
                    }
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            Logger.e(f5227e, "removeTask failed", th);
        }
    }
}
