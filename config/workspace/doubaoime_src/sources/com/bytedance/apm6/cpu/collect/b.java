package com.bytedance.apm6.cpu.collect;

import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.apm6.cpu.collect.a;
import e.b.o.a.a.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class b extends e.b.b.m.g.b {
    private AtomicBoolean a = new AtomicBoolean(false);
    private com.bytedance.apm6.cpu.b.a b;

    /* renamed from: c, reason: collision with root package name */
    private e.b.o.a.a.b f3668c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, CpuCacheItem> f3669d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, CpuCacheItem> f3670e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, CpuCacheItem> f3671f;

    b(e.b.o.a.a.b bVar) {
        this.f3668c = bVar;
    }

    private void c(CpuCacheItem.CpuDataType cpuDataType, String str, CpuCacheItem cpuCacheItem) {
        int ordinal = cpuDataType.ordinal();
        if (ordinal == 0) {
            this.f3669d.put(str, cpuCacheItem);
        } else if (ordinal == 1) {
            this.f3670e.put(str, cpuCacheItem);
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f3671f.put(str, cpuCacheItem);
        }
    }

    private void d(CpuCacheItem.CpuDataType cpuDataType, b.a aVar) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        int ordinal = cpuDataType.ordinal();
        Iterator<Map.Entry<String, CpuCacheItem>> it2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : this.f3671f.entrySet().iterator() : this.f3670e.entrySet().iterator() : this.f3669d.entrySet().iterator();
        if (it2 == null) {
            return;
        }
        while (it2.hasNext()) {
            CpuCacheItem value = it2.next().getValue();
            if (currentTimeMillis - value.d() > this.b.e()) {
                it2.remove();
                double h = value.h() / value.j();
                double g2 = value.g();
                double e2 = value.e() / value.j();
                double f2 = value.f();
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.a("APM-CPU", "cpu cache item: " + value);
                    StringBuilder sb = new StringBuilder();
                    sb.append("assemble cpu data, type: ");
                    sb.append(cpuDataType);
                    j = currentTimeMillis;
                    sb.append(" rate: ");
                    sb.append(h);
                    sb.append(" maxRate: ");
                    sb.append(g2);
                    sb.append(" speed: ");
                    sb.append(e2);
                    sb.append(" maxSpeed: ");
                    sb.append(f2);
                    e.b.b.n.g.b.a("APM-CPU", sb.toString());
                } else {
                    j = currentTimeMillis;
                }
                f fVar = new f(cpuDataType, value.i(), h, g2, e2, f2, aVar);
                fVar.i(e.j.b.b.a(e.b.b.n.a.a()));
                try {
                    fVar.j(((e.b.o.a.b.a) this.f3668c).h());
                } catch (Throwable unused) {
                }
                e.b.b.k.b.c(fVar);
                currentTimeMillis = j;
            }
        }
    }

    private CpuCacheItem e(CpuCacheItem.CpuDataType cpuDataType, String str) {
        int ordinal = cpuDataType.ordinal();
        if (ordinal == 0) {
            return this.f3669d.get(str);
        }
        if (ordinal == 1) {
            return this.f3670e.get(str);
        }
        if (ordinal != 2) {
            return null;
        }
        return this.f3671f.get(str);
    }

    private static CpuCacheItem g(CpuCacheItem.CpuDataType cpuDataType, CpuCacheItem cpuCacheItem, double d2, double d3) {
        if (cpuCacheItem == null) {
            cpuCacheItem = new CpuCacheItem(cpuDataType, System.currentTimeMillis());
            cpuCacheItem.k(e.b.b.l.a.a.a().e());
        }
        if (d2 >= 0.0d || d3 >= 0.0d) {
            cpuCacheItem.c();
        }
        cpuCacheItem.b(d3);
        cpuCacheItem.a(d2);
        cpuCacheItem.l(d2);
        cpuCacheItem.m(d3);
        return cpuCacheItem;
    }

    void b(double d2, double d3) {
        if (this.a.get()) {
            String str = e.b.b.l.a.a.a().e();
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-CPU", str);
            }
            synchronized (b.class) {
                CpuCacheItem.CpuDataType cpuDataType = a.c.a.f() ? CpuCacheItem.CpuDataType.FRONT : CpuCacheItem.CpuDataType.BACK;
                CpuCacheItem g2 = g(cpuDataType, e(cpuDataType, str), d2, d3);
                c(cpuDataType, str, g2);
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.a("APM-CPU", "after add cache data: " + g2);
                }
                CpuCacheItem.CpuDataType cpuDataType2 = CpuCacheItem.CpuDataType.MIX;
                c(cpuDataType2, str, g(cpuDataType2, e(cpuDataType2, str), d2, d3));
            }
        }
    }

    boolean f() {
        return this.a.get();
    }

    void h(com.bytedance.apm6.cpu.b.a aVar) {
        if (this.a.compareAndSet(false, true)) {
            this.f3669d = new HashMap<>();
            this.f3670e = new HashMap<>();
            this.f3671f = new HashMap<>();
            this.b = aVar;
        }
    }

    public void i(b.a aVar) {
        if (this.a.get()) {
            synchronized (b.class) {
                d(CpuCacheItem.CpuDataType.FRONT, aVar);
                d(CpuCacheItem.CpuDataType.BACK, aVar);
                d(CpuCacheItem.CpuDataType.MIX, aVar);
            }
        }
    }
}
