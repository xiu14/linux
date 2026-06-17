package com.bytedance.frameworks.baselib.network.connectionclass;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.connectionclass.c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    private static long f5034g = -1;
    private final c a;
    private AtomicInteger b;

    /* renamed from: c, reason: collision with root package name */
    private b f5035c;

    /* renamed from: d, reason: collision with root package name */
    private HandlerThread f5036d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5037e;

    /* renamed from: f, reason: collision with root package name */
    private long f5038f;

    private static class a {
        public static final d a = new d(c.a.a);
    }

    private class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (message.what != 1) {
                    return;
                }
                d.this.a();
                sendEmptyMessageDelayed(1, 1000L);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    protected d(c cVar) {
        this.f5037e = false;
        this.a = cVar;
        try {
            this.b = new AtomicInteger();
            HandlerThread a2 = com.bytedance.frameworks.baselib.network.h.a.a("ParseThread");
            this.f5036d = a2;
            a2.start();
            this.f5035c = new b(this.f5036d.getLooper());
        } catch (Throwable unused) {
            this.f5037e = true;
        }
    }

    public static d b() {
        return a.a;
    }

    protected void a() {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = f5034g;
            long j2 = totalRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.a.a(j2, elapsedRealtime - this.f5038f);
                    this.f5038f = elapsedRealtime;
                }
            }
            f5034g = totalRxBytes;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c() {
        try {
            if (!this.f5037e && this.b.getAndIncrement() == 0) {
                if (Logger.debug()) {
                    Logger.d("ConnectionClassManager", "startSampling");
                }
                this.f5035c.sendEmptyMessage(1);
                this.f5038f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    public void d() {
        try {
            if (!this.f5037e && this.b.decrementAndGet() == 0) {
                if (Logger.debug()) {
                    Logger.d("ConnectionClassManager", "stopSampling");
                }
                this.f5035c.removeMessages(1);
                a();
                f5034g = -1L;
            }
        } catch (Throwable unused) {
        }
    }
}
