package com.bytedance.ttnet.config;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.retrofit2.O;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTHttpCallThrottleControl implements com.bytedance.retrofit2.T.a {
    private static volatile TTHttpCallThrottleControl o;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Map<String, d> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private volatile d f6118c = new d(null);

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f6119d;

    /* renamed from: e, reason: collision with root package name */
    private final Lock f6120e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Request> f6121f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Request> f6122g;
    private final AtomicLong h;
    private final Set<Request> i;
    private final Map<Runnable, Executor> j;
    private final ReadWriteLock k;
    private final Lock l;
    private final Lock m;
    private final Condition n;

    public enum DelayMode {
        NO_DELAY,
        BLACK_LIST,
        WHITE_LIST,
        RUNTIME,
        NOT_REACHED
    }

    class a extends com.bytedance.frameworks.baselib.network.asynctask.b {
        final /* synthetic */ Runnable a;
        final /* synthetic */ Request b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f6123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j, long j2, Runnable runnable, Request request, Executor executor) {
            super(j, j2);
            this.a = runnable;
            this.b = request;
            this.f6123c = executor;
        }

        @Override // java.lang.Runnable
        public void run() {
            TTHttpCallThrottleControl.this.l.lock();
            try {
                if (TTHttpCallThrottleControl.this.j.containsKey(this.a)) {
                    if (Logger.debug()) {
                        Logger.d("delayrefine", "release p1 from auto max time " + this.b.getPath());
                    }
                    this.b.getMetrics().B = System.currentTimeMillis() - this.b.getMetrics().E;
                    this.f6123c.execute(this.a);
                    TTHttpCallThrottleControl.this.j.remove(this.a);
                }
            } finally {
                TTHttpCallThrottleControl.this.l.unlock();
            }
        }
    }

    class b implements O {
        final /* synthetic */ Request a;
        final /* synthetic */ Executor b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f6125c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6126d;

        b(TTHttpCallThrottleControl tTHttpCallThrottleControl, Request request, Executor executor, Runnable runnable, int i) {
            this.a = request;
            this.b = executor;
            this.f6125c = runnable;
            this.f6126d = i;
        }

        @Override // com.bytedance.retrofit2.O
        public int G() {
            return this.a.getPriorityLevel();
        }

        @Override // com.bytedance.retrofit2.O
        public boolean N() {
            return this.a.isResponseStreaming();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getMetrics().B = System.currentTimeMillis() - this.a.getMetrics().E;
            this.b.execute(this.f6125c);
        }

        @Override // com.bytedance.retrofit2.O
        public RetrofitMetrics w() {
            return this.a.getMetrics();
        }

        @Override // com.bytedance.retrofit2.O
        public int x() {
            return this.f6126d;
        }
    }

    class c extends com.bytedance.frameworks.baselib.network.asynctask.b {
        final /* synthetic */ Request a;

        c(Request request) {
            this.a = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean remove = TTHttpCallThrottleControl.this.i.remove(this.a);
            if (Logger.debug() && this.a.getMetrics() != null) {
                StringBuilder M = e.a.a.a.a.M("notifyRequestCompleted ");
                M.append(this.a.getPath());
                M.append(" after remove p0 set size is ");
                M.append(TTHttpCallThrottleControl.this.i.size());
                M.append(" sync size when send is ");
                M.append(this.a.getMetrics().C);
                M.append(" async size when send is ");
                M.append(this.a.getMetrics().D);
                M.append(" is delay? ");
                M.append(this.a.getMetrics().A);
                M.append(" delay time is ");
                M.append(this.a.getMetrics().B);
                M.append(" random time is ");
                M.append(this.a.getMetrics().F);
                M.append(" delay state is ");
                e.a.a.a.a.D0(M, this.a.getMetrics().y, "delayrefine");
            }
            TTHttpCallThrottleControl.this.f6121f.remove(this.a);
            TTHttpCallThrottleControl.this.f6122g.remove(this.a);
            if (remove && TTHttpCallThrottleControl.this.i.size() == 0) {
                if (Logger.debug()) {
                    Logger.d("delayrefine", "release when all p0 done");
                }
                TTHttpCallThrottleControl.j(TTHttpCallThrottleControl.this);
            }
        }
    }

    private static class d {
        DelayMode a = DelayMode.NO_DELAY;
        int b = -1;

        /* renamed from: c, reason: collision with root package name */
        String f6127c = "";

        /* renamed from: d, reason: collision with root package name */
        int f6128d = 1000;

        /* renamed from: e, reason: collision with root package name */
        int f6129e = 5;

        /* renamed from: f, reason: collision with root package name */
        int f6130f = 5;

        /* renamed from: g, reason: collision with root package name */
        Set<String> f6131g = new CopyOnWriteArraySet();
        Map<String, Integer> h = new ConcurrentHashMap();
        Set<String> i = new CopyOnWriteArraySet();
        int j = 100;
        Set<String> k = new CopyOnWriteArraySet();
        Set<String> l = new CopyOnWriteArraySet();
        Set<String> m = new CopyOnWriteArraySet();
        int n = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        int o = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        int p = 3000;
        int q = 500;

        d(k kVar) {
        }
    }

    public TTHttpCallThrottleControl() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6119d = reentrantReadWriteLock;
        this.f6120e = reentrantReadWriteLock.readLock();
        reentrantReadWriteLock.writeLock();
        this.f6121f = new CopyOnWriteArraySet();
        this.f6122g = new CopyOnWriteArraySet();
        this.h = new AtomicLong(0L);
        this.i = new CopyOnWriteArraySet();
        this.j = new ConcurrentHashMap();
        ReentrantReadWriteLock reentrantReadWriteLock2 = new ReentrantReadWriteLock();
        this.k = reentrantReadWriteLock2;
        this.l = reentrantReadWriteLock2.writeLock();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.m = reentrantLock;
        this.n = reentrantLock.newCondition();
    }

    static void j(TTHttpCallThrottleControl tTHttpCallThrottleControl) {
        Objects.requireNonNull(tTHttpCallThrottleControl);
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("releaseAllP1Request, ");
            M.append(tTHttpCallThrottleControl.f6122g.size());
            M.append(" ");
            M.append(tTHttpCallThrottleControl.f6121f.size());
            Logger.d("delayrefine", M.toString());
        }
        tTHttpCallThrottleControl.m.lock();
        try {
            tTHttpCallThrottleControl.n.signalAll();
            tTHttpCallThrottleControl.m.unlock();
            tTHttpCallThrottleControl.f6120e.lock();
            try {
                int i = tTHttpCallThrottleControl.f6118c.q;
                int i2 = tTHttpCallThrottleControl.f6118c.p;
                tTHttpCallThrottleControl.f6120e.unlock();
                tTHttpCallThrottleControl.l.lock();
                try {
                    for (Map.Entry<Runnable, Executor> entry : tTHttpCallThrottleControl.j.entrySet()) {
                        Runnable key = entry.getKey();
                        Executor value = entry.getValue();
                        int n = tTHttpCallThrottleControl.n(true, i, i2);
                        com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new l(tTHttpCallThrottleControl, n, 0L, key, n, value));
                    }
                    tTHttpCallThrottleControl.l.unlock();
                    tTHttpCallThrottleControl.f6121f.clear();
                    tTHttpCallThrottleControl.f6122g.clear();
                } catch (Throwable th) {
                    tTHttpCallThrottleControl.l.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                tTHttpCallThrottleControl.f6120e.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            tTHttpCallThrottleControl.m.unlock();
            throw th3;
        }
    }

    private boolean k(d dVar, Request request) {
        if (!o(dVar.k, request.getPath())) {
            if (dVar.l.size() > 0) {
                return o(dVar.l, request.getPath());
            }
            if (dVar.m.size() > 0) {
                return !o(dVar.m, request.getPath());
            }
            return true;
        }
        this.h.set(System.currentTimeMillis());
        this.i.add(request);
        if (!Logger.debug()) {
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("p0 add request ");
        M.append(request.getPath());
        M.append(" size ");
        M.append(this.i.size());
        Logger.d("delayrefine", M.toString());
        return false;
    }

    public static TTHttpCallThrottleControl l() {
        if (o == null) {
            synchronized (TTHttpCallThrottleControl.class) {
                if (o == null) {
                    o = new TTHttpCallThrottleControl();
                }
            }
        }
        return o;
    }

    private int m(boolean z, d dVar, Request request) throws IOException {
        request.getMetrics().y = dVar.b;
        request.getMetrics().C = this.f6122g.size();
        request.getMetrics().D = this.f6121f.size();
        if (o(dVar.f6131g, request.getPath())) {
            throw new com.bytedance.frameworks.baselib.network.http.l.b();
        }
        if (z && this.f6121f.size() >= dVar.f6130f) {
            return 0;
        }
        if (!z && this.f6122g.size() >= dVar.f6129e) {
            return 0;
        }
        DelayMode delayMode = dVar.a;
        if (delayMode != DelayMode.BLACK_LIST) {
            if (delayMode != DelayMode.WHITE_LIST) {
                return -1;
            }
            if (o(dVar.i, request.getPath())) {
                return 0;
            }
            return dVar.j;
        }
        Map<String, Integer> map = dVar.h;
        String path = request.getPath();
        Integer num = null;
        if (path != null) {
            Iterator<String> it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (path.startsWith(next)) {
                    num = map.get(next);
                    break;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private int n(boolean z, int i, int i2) {
        if (z && this.f6121f.size() <= 5) {
            return 0;
        }
        if (z || this.f6122g.size() > 5) {
            return new SecureRandom().nextInt((i2 - i) + 1) + i;
        }
        return 0;
    }

    private boolean o(Set<String> set, String str) {
        if (str == null) {
            return false;
        }
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean q() {
        return System.currentTimeMillis() - this.h.get() > ((long) this.f6118c.n) || this.i.size() <= 0;
    }

    private void r(int i, Executor executor, Runnable runnable, Request request) {
        if (i <= 0) {
            return;
        }
        request.getMetrics().E = System.currentTimeMillis();
        request.getMetrics().A = true;
        b bVar = new b(this, request, executor, runnable, i);
        this.f6121f.add(request);
        executor.execute(bVar);
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws IOException {
        if (!this.a.get() || request == null || request.getPath() == null || request.getMetrics() == null) {
            return false;
        }
        this.f6120e.lock();
        int i = this.f6118c.o;
        try {
            try {
                int m = m(true, this.f6118c, request);
                if (Logger.debug()) {
                    Logger.d("delayrefine", "get sleep time " + m + " path is " + request.getPath());
                }
                if (m > 0) {
                    r(m, executor, runnable, request);
                    return true;
                }
                if (m != 0 && this.f6118c.a == DelayMode.RUNTIME && k(this.f6118c, request) && !q()) {
                    this.f6120e.unlock();
                    this.l.lock();
                    try {
                        this.f6121f.add(request);
                        if (Logger.debug()) {
                            Logger.d("delayrefine", "enqueue p1 add request " + request.getPath() + " after added me, async size is " + this.f6121f.size());
                        }
                        request.getMetrics().E = System.currentTimeMillis();
                        this.j.put(runnable, executor);
                        request.getMetrics().A = true;
                        com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new a(i, 0L, runnable, request, executor));
                        return true;
                    } finally {
                        this.l.unlock();
                    }
                }
                return false;
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            this.f6120e.unlock();
        }
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        if (!this.a.get() || request == null || request.getPath() == null || request.getMetrics() == null) {
            return;
        }
        this.f6120e.lock();
        try {
            try {
                int m = m(false, this.f6118c, request);
                if (Logger.debug()) {
                    Logger.d("delayrefine", "get sleep time " + m + " path is " + request.getPath());
                }
                this.f6120e.unlock();
                if (m > 0) {
                    if (m <= 0) {
                        return;
                    }
                    this.f6122g.add(request);
                    request.getMetrics().E = System.currentTimeMillis();
                    request.getMetrics().A = true;
                    try {
                        try {
                            Thread.sleep(m);
                            return;
                        } catch (InterruptedException e2) {
                            throw new RuntimeException(e2);
                        }
                    } finally {
                        request.getMetrics().B = System.currentTimeMillis() - request.getMetrics().E;
                    }
                }
                if (m == 0) {
                    return;
                }
                this.f6120e.lock();
                int i = this.f6118c.q;
                int i2 = this.f6118c.p;
                int i3 = this.f6118c.o;
                try {
                    try {
                        if (this.f6118c.a == DelayMode.RUNTIME && k(this.f6118c, request)) {
                            if (!q()) {
                                this.f6120e.unlock();
                                this.m.lock();
                                try {
                                    try {
                                        request.getMetrics().E = SystemClock.uptimeMillis();
                                        this.f6122g.add(request);
                                        if (Logger.debug()) {
                                            Logger.d("delayrefine", "execute p1 add request " + request.getPath() + " after added me, sync size is " + this.f6122g.size());
                                        }
                                        this.n.await(i3, TimeUnit.MILLISECONDS);
                                        int n = n(false, i, i2);
                                        long j = n;
                                        request.getMetrics().F = j;
                                        if (n > 0) {
                                            Thread.sleep(j);
                                        }
                                        if (Logger.debug()) {
                                            Logger.d("delayrefine", "execute p1 release now " + request.getPath() + " random is " + n);
                                        }
                                        request.getMetrics().B = SystemClock.uptimeMillis() - request.getMetrics().E;
                                        request.getMetrics().A = true;
                                    } catch (Exception unused) {
                                        Logger.e("sleeping interrupted");
                                    }
                                } finally {
                                    this.m.unlock();
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw e3;
                    }
                } finally {
                }
            } catch (Exception e4) {
                throw e4;
            }
        } finally {
        }
    }

    @Override // com.bytedance.retrofit2.T.a
    public void c(Request request) {
        if ((this.a.get() || this.i.size() > 0) && request != null) {
            com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new c(request));
        }
    }

    public void p(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("tt_req_delay_config");
        boolean z = jSONObject.optInt("state_delay_enabled") > 0;
        boolean z2 = TTNetInit.getStateDelayNewStrategyEnabled() && (jSONObject.optInt("state_new_strategy_enabled", 1) > 0);
        if (!z || optJSONArray2 == null || z2) {
            this.b.clear();
            this.a.set(z);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i = 0; i < optJSONArray2.length(); i++) {
            d dVar = new d(null);
            JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
            if (optJSONObject != null) {
                dVar.f6127c = optJSONObject.optString("state_name", "");
                if (!optJSONObject.isNull("bl_with_delay_ms")) {
                    dVar.a = DelayMode.BLACK_LIST;
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("bl_with_delay_ms");
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            dVar.h.put(next, Integer.valueOf(optJSONObject2.optInt(next)));
                        }
                    }
                } else if (!optJSONObject.isNull("wl")) {
                    dVar.a = DelayMode.WHITE_LIST;
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("wl");
                    if (optJSONArray3 != null) {
                        for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                            dVar.i.add((String) optJSONArray3.opt(i2));
                        }
                    }
                    int optInt = optJSONObject.optInt("delay_time_ms", 1000);
                    dVar.j = optInt;
                    if (optInt <= 0) {
                        dVar.j = 1000;
                    }
                } else if (!optJSONObject.isNull("p0")) {
                    dVar.a = DelayMode.RUNTIME;
                    JSONArray optJSONArray4 = optJSONObject.optJSONArray("p0");
                    if (optJSONArray4 != null) {
                        for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                            dVar.k.add((String) optJSONArray4.opt(i3));
                        }
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("bl_for_runtime");
                    if (optJSONArray5 != null) {
                        for (int i4 = 0; i4 < optJSONArray5.length(); i4++) {
                            dVar.l.add((String) optJSONArray5.opt(i4));
                        }
                    }
                    JSONArray optJSONArray6 = optJSONObject.optJSONArray("wl_for_runtime");
                    if (optJSONArray6 != null) {
                        for (int i5 = 0; i5 < optJSONArray6.length(); i5++) {
                            dVar.m.add((String) optJSONArray6.opt(i5));
                        }
                    }
                    dVar.n = optJSONObject.optInt("p0_check_max_ms", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
                    dVar.o = optJSONObject.optInt("p1_wait_max_ms", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
                    dVar.p = optJSONObject.optInt("random_send_ubound_ms", 3000);
                    dVar.q = optJSONObject.optInt("random_send_lbound_ms", 500);
                }
                if ((dVar.h.size() > 0 || dVar.i.size() > 0 || dVar.k.size() > 0) && !TextUtils.isEmpty(dVar.f6127c)) {
                    int optInt2 = optJSONObject.optInt("delay_disable_time_ms", 1000);
                    dVar.f6128d = optInt2;
                    if (optInt2 <= 0) {
                        dVar.f6128d = 1000;
                    }
                    if (!optJSONObject.isNull("dl") && (optJSONArray = optJSONObject.optJSONArray("dl")) != null) {
                        for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                            dVar.f6131g.add((String) optJSONArray.opt(i6));
                        }
                    }
                    dVar.b = optJSONObject.optInt(WsConstants.KEY_CONNECTION_STATE, -1);
                    dVar.f6129e = optJSONObject.optInt("sync_req_delay_max_count", 10);
                    dVar.f6130f = optJSONObject.optInt("async_req_delay_max_count", 10);
                    concurrentHashMap.put(dVar.f6127c, dVar);
                }
            }
        }
        this.b.clear();
        this.b.putAll(concurrentHashMap);
        this.a.set(z);
    }
}
