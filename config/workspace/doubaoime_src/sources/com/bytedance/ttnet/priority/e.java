package com.bytedance.ttnet.priority;

import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.retrofit2.O;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {
    private String a = null;
    private final Set<Request> b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private int f6236c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final Lock f6237d;

    /* renamed from: e, reason: collision with root package name */
    private final Condition f6238e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Request> f6239f;

    /* renamed from: g, reason: collision with root package name */
    private int f6240g;
    private final ReadWriteLock h;
    private final Lock i;
    private final Map<Runnable, Executor> j;
    private int k;
    private int l;
    private int m;

    class a extends com.bytedance.frameworks.baselib.network.asynctask.b {
        final /* synthetic */ Runnable a;
        final /* synthetic */ Executor b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Request f6241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j, long j2, Runnable runnable, Executor executor, Request request) {
            super(j, j2);
            this.a = runnable;
            this.b = executor;
            this.f6241c = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.i.lock();
            try {
                if (e.this.j.containsKey(this.a)) {
                    this.b.execute(this.a);
                    e.this.j.remove(this.a);
                    this.f6241c.getMetrics().B = SystemClock.uptimeMillis() - this.f6241c.getMetrics().E;
                }
            } finally {
                e.this.i.unlock();
            }
        }
    }

    class b extends com.bytedance.frameworks.baselib.network.asynctask.b {
        final /* synthetic */ Runnable a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f6243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j, long j2, Runnable runnable, int i, Executor executor) {
            super(j, j2);
            this.a = runnable;
            this.b = i;
            this.f6243c = executor;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.i.lock();
            try {
                if (e.this.j.containsKey(this.a)) {
                    Runnable runnable = this.a;
                    if (runnable instanceof O) {
                        RetrofitMetrics w = ((O) runnable).w();
                        w.B = SystemClock.uptimeMillis() - w.E;
                        w.F = this.b;
                    }
                    this.f6243c.execute(this.a);
                    e.this.j.remove(this.a);
                }
            } finally {
                e.this.i.unlock();
            }
        }
    }

    public e() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f6237d = reentrantLock;
        this.f6238e = reentrantLock.newCondition();
        this.f6239f = new CopyOnWriteArraySet();
        this.f6240g = -1;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.h = reentrantReadWriteLock;
        this.i = reentrantReadWriteLock.writeLock();
        this.j = new ConcurrentHashMap();
        this.k = 500;
        this.l = 3000;
        this.m = 100;
    }

    private int c() {
        int i = this.k;
        if (i <= 0) {
            i = 500;
        }
        int i2 = this.l;
        if (i2 <= 0) {
            i2 = 3000;
        }
        if (i >= i2) {
            return 0;
        }
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    public void d(JSONObject jSONObject, String str) {
        this.f6236c = jSONObject.optInt("sync_req_delay_max_count", -1);
        this.f6240g = jSONObject.optInt("async_req_delay_max_count", -1);
        this.k = jSONObject.optInt("random_send_lbound_ms", 500);
        this.l = jSONObject.optInt("random_send_ubound_ms", 3000);
        this.m = jSONObject.optInt("sparse_send_interval_ms", 100);
        this.a = str;
    }

    public void e(Request request) {
        if (request == null) {
            return;
        }
        this.b.remove(request);
        this.f6239f.remove(request);
    }

    public void f() {
        this.f6237d.lock();
        try {
            this.f6238e.signalAll();
            this.f6237d.unlock();
            this.i.lock();
            try {
                int i = 0;
                for (Map.Entry<Runnable, Executor> entry : this.j.entrySet()) {
                    Runnable key = entry.getKey();
                    Executor value = entry.getValue();
                    int i2 = this.m;
                    i = i2 <= 0 ? c() : i + i2;
                    com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new b(i, 0L, key, i, value));
                }
                this.i.unlock();
                this.f6239f.clear();
                this.b.clear();
            } catch (Throwable th) {
                this.i.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f6237d.unlock();
            throw th2;
        }
    }

    public boolean g(Request request, boolean z, long j, Runnable runnable, Executor executor) {
        if (j <= 0) {
            return false;
        }
        if (!z && this.f6239f.size() >= this.f6240g) {
            return false;
        }
        this.j.put(runnable, executor);
        this.f6239f.add(request);
        request.getMetrics().E = SystemClock.uptimeMillis();
        request.getMetrics().z = this.a;
        request.getMetrics().D = this.f6239f.size();
        request.getMetrics().A = true;
        com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new a(j, 0L, runnable, executor, request));
        return true;
    }

    public void h(Request request, boolean z, long j) {
        int c2;
        long uptimeMillis;
        StringBuilder sb;
        if (j <= 0) {
            return;
        }
        if (z || this.b.size() < this.f6236c) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.b.add(request);
            request.getMetrics().C = this.b.size();
            request.getMetrics().z = this.a;
            request.getMetrics().A = true;
            if (Logger.debug()) {
                Logger.d("RequestDelay", "Delay request before await");
            }
            this.f6237d.lock();
            try {
                try {
                    this.f6238e.await(j, TimeUnit.MILLISECONDS);
                    this.f6237d.unlock();
                    c2 = c();
                    if (Logger.debug()) {
                        StringBuilder M = e.a.a.a.a.M("Delay request :");
                        M.append(request.getPath());
                        M.append(" time:");
                        M.append(c2);
                        M.append(" start random now");
                        Logger.d("RequestDelay", M.toString());
                    }
                    if (c2 > 0) {
                        try {
                            Thread.sleep(c2);
                        } catch (InterruptedException unused) {
                            Logger.e("sleeping interrupted");
                        }
                    }
                    uptimeMillis = SystemClock.uptimeMillis();
                } catch (Throwable th) {
                    this.f6237d.unlock();
                    int c3 = c();
                    if (Logger.debug()) {
                        StringBuilder M2 = e.a.a.a.a.M("Delay request :");
                        M2.append(request.getPath());
                        M2.append(" time:");
                        M2.append(c3);
                        M2.append(" start random now");
                        Logger.d("RequestDelay", M2.toString());
                    }
                    if (c3 > 0) {
                        try {
                            Thread.sleep(c3);
                        } catch (InterruptedException unused2) {
                            Logger.e("sleeping interrupted");
                        }
                    }
                    long uptimeMillis3 = SystemClock.uptimeMillis();
                    if (Logger.debug()) {
                        StringBuilder N = e.a.a.a.a.N("Delay request end random ", c3, " delay all ");
                        N.append(uptimeMillis3 - uptimeMillis2);
                        Logger.d("RequestDelay", N.toString());
                    }
                    request.getMetrics().F = c3;
                    request.getMetrics().B = SystemClock.uptimeMillis() - uptimeMillis2;
                    throw th;
                }
            } catch (Exception e2) {
                if (Logger.debug()) {
                    Logger.d("RequestDelay", "Delay request await interrupted " + e2.getMessage());
                }
                this.f6237d.unlock();
                c2 = c();
                if (Logger.debug()) {
                    StringBuilder M3 = e.a.a.a.a.M("Delay request :");
                    M3.append(request.getPath());
                    M3.append(" time:");
                    M3.append(c2);
                    M3.append(" start random now");
                    Logger.d("RequestDelay", M3.toString());
                }
                if (c2 > 0) {
                    try {
                        Thread.sleep(c2);
                    } catch (InterruptedException unused3) {
                        Logger.e("sleeping interrupted");
                    }
                }
                uptimeMillis = SystemClock.uptimeMillis();
                if (Logger.debug()) {
                    sb = new StringBuilder();
                }
            }
            if (Logger.debug()) {
                sb = new StringBuilder();
                sb.append("Delay request end random ");
                sb.append(c2);
                sb.append(" delay all ");
                sb.append(uptimeMillis - uptimeMillis2);
                Logger.d("RequestDelay", sb.toString());
            }
            request.getMetrics().F = c2;
            request.getMetrics().B = SystemClock.uptimeMillis() - uptimeMillis2;
        }
    }
}
