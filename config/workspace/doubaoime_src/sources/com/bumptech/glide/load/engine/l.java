package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.k.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class l<R> implements DecodeJob.a<R>, a.d {
    private static final c z = new c();
    final e a;
    private final com.bumptech.glide.util.k.d b;

    /* renamed from: c, reason: collision with root package name */
    private final p.a f1660c;

    /* renamed from: d, reason: collision with root package name */
    private final Pools.Pool<l<?>> f1661d;

    /* renamed from: e, reason: collision with root package name */
    private final c f1662e;

    /* renamed from: f, reason: collision with root package name */
    private final m f1663f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.D.a f1664g;
    private final com.bumptech.glide.load.engine.D.a h;
    private final com.bumptech.glide.load.engine.D.a i;
    private final com.bumptech.glide.load.engine.D.a j;
    private final AtomicInteger k;
    private com.bumptech.glide.load.d l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private v<?> q;
    DataSource r;
    private boolean s;
    q t;
    private boolean u;
    p<?> v;
    private DecodeJob<R> w;
    private volatile boolean x;
    private boolean y;

    private class a implements Runnable {
        private final com.bumptech.glide.request.i a;

        a(com.bumptech.glide.request.i iVar) {
            this.a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (((SingleRequest) this.a).h()) {
                synchronized (l.this) {
                    if (l.this.a.b(this.a)) {
                        l lVar = l.this;
                        com.bumptech.glide.request.i iVar = this.a;
                        Objects.requireNonNull(lVar);
                        try {
                            ((SingleRequest) iVar).n(lVar.t);
                        } catch (Throwable th) {
                            throw new com.bumptech.glide.load.engine.c(th);
                        }
                    }
                    l.this.d();
                }
            }
        }
    }

    private class b implements Runnable {
        private final com.bumptech.glide.request.i a;

        b(com.bumptech.glide.request.i iVar) {
            this.a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (((SingleRequest) this.a).h()) {
                synchronized (l.this) {
                    if (l.this.a.b(this.a)) {
                        l.this.v.b();
                        l.this.c(this.a);
                        l.this.l(this.a);
                    }
                    l.this.d();
                }
            }
        }
    }

    @VisibleForTesting
    static class c {
        c() {
        }
    }

    static final class d {
        final com.bumptech.glide.request.i a;
        final Executor b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.a = iVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    l(com.bumptech.glide.load.engine.D.a aVar, com.bumptech.glide.load.engine.D.a aVar2, com.bumptech.glide.load.engine.D.a aVar3, com.bumptech.glide.load.engine.D.a aVar4, m mVar, p.a aVar5, Pools.Pool<l<?>> pool) {
        c cVar = z;
        this.a = new e();
        this.b = com.bumptech.glide.util.k.d.a();
        this.k = new AtomicInteger();
        this.f1664g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = aVar4;
        this.f1663f = mVar;
        this.f1660c = aVar5;
        this.f1661d = pool;
        this.f1662e = cVar;
    }

    private boolean g() {
        return this.u || this.s || this.x;
    }

    private synchronized void k() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.a.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.y = false;
        this.w.o(false);
        this.w = null;
        this.t = null;
        this.r = null;
        this.f1661d.release(this);
    }

    synchronized void a(com.bumptech.glide.request.i iVar, Executor executor) {
        this.b.c();
        this.a.a(iVar, executor);
        boolean z2 = true;
        if (this.s) {
            e(1);
            executor.execute(new b(iVar));
        } else if (this.u) {
            e(1);
            executor.execute(new a(iVar));
        } else {
            if (this.x) {
                z2 = false;
            }
            d.a.b.a.a(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // com.bumptech.glide.util.k.a.d
    @NonNull
    public com.bumptech.glide.util.k.d b() {
        return this.b;
    }

    @GuardedBy("this")
    void c(com.bumptech.glide.request.i iVar) {
        try {
            ((SingleRequest) iVar).p(this.v, this.r, this.y);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.c(th);
        }
    }

    void d() {
        p<?> pVar;
        synchronized (this) {
            this.b.c();
            d.a.b.a.a(g(), "Not yet complete!");
            int decrementAndGet = this.k.decrementAndGet();
            d.a.b.a.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.v;
                k();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void e(int i) {
        p<?> pVar;
        d.a.b.a.a(g(), "Not yet complete!");
        if (this.k.getAndAdd(i) == 0 && (pVar = this.v) != null) {
            pVar.b();
        }
    }

    @VisibleForTesting
    synchronized l<R> f(com.bumptech.glide.load.d dVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.l = dVar;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        return this;
    }

    public void h(q qVar) {
        synchronized (this) {
            this.t = qVar;
        }
        synchronized (this) {
            this.b.c();
            if (this.x) {
                k();
                return;
            }
            if (this.a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.u) {
                throw new IllegalStateException("Already failed once");
            }
            this.u = true;
            com.bumptech.glide.load.d dVar = this.l;
            e c2 = this.a.c();
            e(c2.size() + 1);
            ((k) this.f1663f).f(this, dVar, null);
            Iterator<d> it2 = c2.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                next.b.execute(new a(next.a));
            }
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(v<R> vVar, DataSource dataSource, boolean z2) {
        synchronized (this) {
            this.q = vVar;
            this.r = dataSource;
            this.y = z2;
        }
        synchronized (this) {
            this.b.c();
            if (this.x) {
                this.q.recycle();
                k();
                return;
            }
            if (this.a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.s) {
                throw new IllegalStateException("Already have resource");
            }
            c cVar = this.f1662e;
            v<?> vVar2 = this.q;
            boolean z3 = this.m;
            com.bumptech.glide.load.d dVar = this.l;
            p.a aVar = this.f1660c;
            Objects.requireNonNull(cVar);
            this.v = new p<>(vVar2, z3, true, dVar, aVar);
            this.s = true;
            e c2 = this.a.c();
            e(c2.size() + 1);
            ((k) this.f1663f).f(this, this.l, this.v);
            Iterator<d> it2 = c2.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                next.b.execute(new b(next.a));
            }
            d();
        }
    }

    boolean j() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r2.k.get() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized void l(com.bumptech.glide.request.i r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.k.d r0 = r2.b     // Catch: java.lang.Throwable -> L44
            r0.c()     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.engine.l$e r0 = r2.a     // Catch: java.lang.Throwable -> L44
            r0.d(r3)     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.engine.l$e r3 = r2.a     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L42
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> L44
            r0 = 1
            if (r3 == 0) goto L1b
            goto L2b
        L1b:
            r2.x = r0     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.engine.DecodeJob<R> r3 = r2.w     // Catch: java.lang.Throwable -> L44
            r3.e()     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.engine.m r3 = r2.f1663f     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.d r1 = r2.l     // Catch: java.lang.Throwable -> L44
            com.bumptech.glide.load.engine.k r3 = (com.bumptech.glide.load.engine.k) r3     // Catch: java.lang.Throwable -> L44
            r3.e(r2, r1)     // Catch: java.lang.Throwable -> L44
        L2b:
            boolean r3 = r2.s     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L35
            boolean r3 = r2.u     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicInteger r3 = r2.k     // Catch: java.lang.Throwable -> L44
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L42
            r2.k()     // Catch: java.lang.Throwable -> L44
        L42:
            monitor-exit(r2)
            return
        L44:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.l.l(com.bumptech.glide.request.i):void");
    }

    public void m(DecodeJob<?> decodeJob) {
        (this.n ? this.i : this.o ? this.j : this.h).execute(decodeJob);
    }

    public synchronized void n(DecodeJob<R> decodeJob) {
        this.w = decodeJob;
        (decodeJob.u() ? this.f1664g : this.n ? this.i : this.o ? this.j : this.h).execute(decodeJob);
    }

    static final class e implements Iterable<d> {
        private final List<d> a;

        e() {
            this.a = new ArrayList(2);
        }

        void a(com.bumptech.glide.request.i iVar, Executor executor) {
            this.a.add(new d(iVar, executor));
        }

        boolean b(com.bumptech.glide.request.i iVar) {
            return this.a.contains(new d(iVar, com.bumptech.glide.util.d.a()));
        }

        e c() {
            return new e(new ArrayList(this.a));
        }

        void clear() {
            this.a.clear();
        }

        void d(com.bumptech.glide.request.i iVar) {
            this.a.remove(new d(iVar, com.bumptech.glide.util.d.a()));
        }

        boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.a.iterator();
        }

        int size() {
            return this.a.size();
        }

        e(List<d> list) {
            this.a = list;
        }
    }
}
