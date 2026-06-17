package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b {
    private static final String l = "b";
    private com.bytedance.frameworks.baselib.network.http.p.g<String, DnsRecord> a = new com.bytedance.frameworks.baselib.network.http.p.g<>(100);
    private ConcurrentMap<String, DnsRecord> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentMap<String, Future<Void>> f5163c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentMap<String, Future<Void>> f5164d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentMap<String, ConcurrentSkipListSet<a>> f5165e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentMap<String, ConcurrentSkipListSet<a>> f5166f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentSkipListSet<String> f5167g = new ConcurrentSkipListSet<>();
    private AtomicInteger h = new AtomicInteger(0);
    private AtomicInteger i = new AtomicInteger(0);
    private NetworkUtils.NetworkType j = NetworkUtils.NetworkType.NONE;
    private final Handler k;

    public b(Handler handler) {
        this.k = handler;
    }

    void A() {
        this.h.getAndIncrement();
    }

    public boolean B(String str) {
        return this.f5165e.containsKey(str);
    }

    public boolean C(a aVar) {
        return this.f5165e.containsKey(null) && this.f5165e.get(null).contains(aVar);
    }

    public boolean D(String str) {
        return this.f5166f.containsKey(str);
    }

    public boolean E(a aVar) {
        return this.f5166f.containsKey(null) && this.f5166f.get(null).contains(aVar);
    }

    public void a(String str, DnsRecord dnsRecord) {
        DnsRecord i = i(str);
        if (i != null) {
            if (c.n().o().get()) {
                i.h();
            } else {
                i.i();
            }
        }
        if (c.n().o().get()) {
            dnsRecord.a();
        } else {
            dnsRecord.b();
        }
        synchronized (this.a.c()) {
            this.a.d(str, dnsRecord);
        }
    }

    void b() {
        this.i.getAndIncrement();
        if (this.i.get() >= 2) {
            Message obtain = Message.obtain();
            obtain.what = 20;
            obtain.obj = this;
            this.k.sendMessageDelayed(obtain, 180000L);
        }
    }

    public synchronized void c(String str, a aVar) {
        if (this.f5165e.containsKey(null)) {
            this.f5165e.get(null).add(aVar);
        } else {
            ConcurrentSkipListSet<a> concurrentSkipListSet = new ConcurrentSkipListSet<>();
            concurrentSkipListSet.add(aVar);
            this.f5165e.put(null, concurrentSkipListSet);
        }
    }

    public void d(String str, Future<Void> future) {
        this.f5163c.put(str, future);
    }

    public void e(String str) {
        this.f5167g.add(str);
        if (this.f5167g.size() < 10) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5167g);
        c.n().b(arrayList);
    }

    public void f(String str, DnsRecord dnsRecord) {
        DnsRecord m = m(str);
        if (m != null) {
            m.j();
        }
        dnsRecord.c();
        this.b.put(str, dnsRecord);
    }

    public void g(String str, Future<Void> future) {
        this.f5164d.put(str, future);
    }

    AtomicInteger h() {
        return this.h;
    }

    public DnsRecord i(String str) {
        DnsRecord b;
        synchronized (this.a.c()) {
            b = this.a.b(str);
        }
        return b;
    }

    AtomicInteger j() {
        return this.i;
    }

    public ConcurrentSkipListSet<a> k(String str) {
        return this.f5165e.get(str);
    }

    public Future<Void> l(String str) {
        if (this.f5163c.containsKey(str)) {
            return this.f5163c.get(str);
        }
        return null;
    }

    public DnsRecord m(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public ConcurrentSkipListSet<a> n(String str) {
        return this.f5166f.get(str);
    }

    public Future<Void> o(String str) {
        if (this.f5164d.containsKey(str)) {
            return this.f5164d.get(str);
        }
        return null;
    }

    public boolean p(String str) {
        return this.f5163c.containsKey(str);
    }

    public boolean q(String str) {
        return this.f5164d.containsKey(str);
    }

    public void r(Context context) {
        NetworkUtils.NetworkType e2 = NetworkUtils.e(context);
        if (e2 != this.j) {
            if (Logger.debug()) {
                Logger.d(l, "network changed, clear cache and re-batch-preload preload hosts, current net type is " + e2);
            }
            synchronized (this.a.c()) {
                for (Map.Entry<String, DnsRecord> entry : this.a.c().entrySet()) {
                    if (entry != null) {
                        if (c.n().o().get()) {
                            entry.getValue().h();
                        } else {
                            entry.getValue().i();
                        }
                    }
                }
                this.a.a();
            }
            for (Map.Entry<String, DnsRecord> entry2 : this.b.entrySet()) {
                if (entry2 != null) {
                    entry2.getValue().j();
                }
            }
            this.b.clear();
            if (e2 != NetworkUtils.NetworkType.NONE) {
                c.n().d(DnsRecord.CacheStaleReason.CACHE_STALE_NETCHANGED);
                c.n().y();
            }
        }
        this.j = e2;
    }

    public void s(String str) {
        DnsRecord i = i(str);
        if (i != null) {
            if (c.n().o().get()) {
                i.h();
            } else {
                i.i();
            }
            synchronized (this.a.c()) {
                this.a.e(str);
            }
        }
    }

    public void t(a aVar) {
        Objects.requireNonNull(aVar);
        if (this.f5165e.containsKey(null)) {
            this.f5165e.get(null).remove(aVar);
            if (this.f5165e.get(null).isEmpty()) {
                this.f5165e.remove(null);
            }
        }
    }

    public void u(String str) {
        this.f5163c.remove(str);
    }

    public void v(String str) {
        if (this.f5167g.contains(str)) {
            this.f5167g.remove(str);
        }
    }

    public void w(String str) {
        DnsRecord m = m(str);
        if (m != null) {
            m.j();
            this.b.remove(str);
        }
    }

    public void x(a aVar) {
        Objects.requireNonNull(aVar);
        if (this.f5166f.containsKey(null)) {
            this.f5166f.get(null).remove(aVar);
            if (this.f5166f.get(null).isEmpty()) {
                this.f5166f.remove(null);
            }
        }
    }

    public void y(String str) {
        this.f5164d.remove(str);
    }

    void z() {
        this.i.set(0);
    }
}
