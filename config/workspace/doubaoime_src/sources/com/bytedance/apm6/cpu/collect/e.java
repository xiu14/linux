package com.bytedance.apm6.cpu.collect;

import android.os.Process;
import android.util.Pair;
import com.bytedance.apm.util.k;
import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.apm6.cpu.collect.a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.monitor.collector.j;
import e.b.b.m.h.a;
import e.b.o.a.a.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class e extends e.b.b.m.g.b {
    private b a;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f3673c;

    /* renamed from: d, reason: collision with root package name */
    private long f3674d;

    /* renamed from: e, reason: collision with root package name */
    private long f3675e;

    /* renamed from: f, reason: collision with root package name */
    private long f3676f;

    /* renamed from: g, reason: collision with root package name */
    private long f3677g;
    private com.bytedance.apm6.cpu.b.a h;
    private e.b.o.a.a.b i;
    private boolean j = true;
    private AtomicBoolean b = new AtomicBoolean(false);

    e(b bVar, e.b.o.a.a.b bVar2) {
        this.a = bVar;
        this.i = bVar2;
    }

    static void c(e eVar, boolean z) {
        com.bytedance.apm6.cpu.b.a aVar = eVar.h;
        eVar.f3674d = z ? aVar.c() : aVar.a();
        eVar.f3675e = z ? eVar.h.d() : eVar.h.b();
    }

    static void f(e eVar) {
        Objects.requireNonNull(eVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - eVar.f3676f < eVar.f3674d) {
            return;
        }
        eVar.f3676f = currentTimeMillis;
        int b = com.bytedance.apm.util.b.b();
        if (b <= 0) {
            return;
        }
        long b2 = j.h().b();
        long g2 = j.h().g(b);
        boolean z = false;
        try {
            Thread.sleep(360L);
        } catch (InterruptedException unused) {
            z = true;
        }
        if (z) {
            return;
        }
        long b3 = j.h().b();
        double d2 = j.h().g(b) - g2 > 0 ? (b3 - b2) / r9 : -1.0d;
        double d3 = (b3 - b2) * 1000.0d;
        double currentTimeMillis2 = (d3 / (System.currentTimeMillis() - currentTimeMillis)) / com.bytedance.apm.util.b.e(100L);
        if (com.bytedance.apm.g.B()) {
            e.b.b.n.g.b.a("APM-CPU", String.valueOf(d3) + " " + (System.currentTimeMillis() - currentTimeMillis) + " " + com.bytedance.apm.util.b.e(100L));
        }
        if (com.bytedance.apm.g.B()) {
            e.b.b.n.g.b.a("APM-CPU", "collect cpu data, rate: " + d2 + " speed: " + currentTimeMillis2);
        }
        b.a aVar = null;
        try {
            ((e.b.o.a.b.a) eVar.i).j();
            aVar = ((e.b.o.a.b.a) eVar.i).d();
        } catch (Throwable unused2) {
        }
        if (eVar.a.f()) {
            eVar.a.b(d2, currentTimeMillis2);
            eVar.a.i(aVar);
        }
        com.bytedance.apm6.cpu.c.a.c().d(d2, currentTimeMillis2);
        Objects.requireNonNull(a.c.a);
    }

    static void g(e eVar) {
        com.bytedance.apm6.cpu.exception.e eVar2;
        Objects.requireNonNull(eVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - eVar.f3677g < eVar.f3675e) {
            return;
        }
        eVar.f3677g = currentTimeMillis;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z = false;
        com.bytedance.android.input.k.b.a.U(Process.myPid(), hashMap);
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
            e.b.b.n.g.b.c("APM-CPU", "InterruptedException", e2);
            z = true;
        }
        if (z) {
            return;
        }
        com.bytedance.android.input.k.b.a.U(Process.myPid(), hashMap2);
        b.a aVar = null;
        try {
            aVar = ((e.b.o.a.b.a) eVar.i).d();
        } catch (Exception unused) {
        }
        if (hashMap.isEmpty() || hashMap2.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (Map.Entry entry : hashMap.entrySet()) {
            com.bytedance.apm6.cpu.exception.e eVar3 = (com.bytedance.apm6.cpu.exception.e) entry.getValue();
            if (eVar3 != null && (eVar2 = (com.bytedance.apm6.cpu.exception.e) hashMap2.get(entry.getKey())) != null && eVar2.g().equals(eVar3.g())) {
                long e3 = eVar2.e() - eVar3.e();
                if (e3 != 0) {
                    StringBuilder M = e.a.a.a.a.M("cpu_thread=");
                    M.append(eVar2.g());
                    M.append(" thread_time=");
                    M.append(e3);
                    M.append(" app_time=");
                    M.append(0L);
                    e.b.b.n.g.b.a("APM-CPU", M.toString());
                    double d2 = e3;
                    linkedList.add(new k(eVar2.g(), Double.valueOf(d2)));
                    linkedList2.add(new a.C0428a(eVar2.g(), d2, eVar2.f()));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        Collections.sort(linkedList2, new d(eVar));
        synchronized (com.bytedance.apm6.cpu.c.a.c()) {
            new Pair(Long.valueOf(System.currentTimeMillis()), linkedList2);
        }
        if (eVar.h.g()) {
            f fVar = new f(a.c.a.f() ? CpuCacheItem.CpuDataType.FRONT : CpuCacheItem.CpuDataType.BACK, e.b.b.l.a.a.a().e(), linkedList, aVar);
            fVar.i(e.j.b.b.a(com.bytedance.apm.g.h()));
            try {
                fVar.j(((e.b.o.a.b.a) eVar.i).h());
            } catch (Throwable unused2) {
            }
            e.b.b.k.b.c(fVar);
        }
    }

    void h(com.bytedance.apm6.cpu.b.a aVar) {
        if (this.b.compareAndSet(false, true)) {
            this.h = aVar;
            if (this.f3673c == null) {
                this.f3673c = new c(this, 30000L, 30000L);
            }
            if (this.f3673c != null) {
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).c(this.f3673c);
            }
            try {
                ((e.b.o.a.b.a) this.i).k();
            } catch (Throwable unused) {
            }
        }
    }
}
