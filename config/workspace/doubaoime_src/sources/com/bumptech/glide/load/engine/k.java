package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C.a;
import com.bumptech.glide.load.engine.C.i;
import com.bumptech.glide.load.engine.C0500a;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.k.a;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k implements m, i.a, p.a {
    private static final boolean i = Log.isLoggable("Engine", 2);
    private final s a;
    private final o b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.C.i f1648c;

    /* renamed from: d, reason: collision with root package name */
    private final b f1649d;

    /* renamed from: e, reason: collision with root package name */
    private final y f1650e;

    /* renamed from: f, reason: collision with root package name */
    private final c f1651f;

    /* renamed from: g, reason: collision with root package name */
    private final a f1652g;
    private final C0500a h;

    @VisibleForTesting
    static class a {
        final DecodeJob.d a;
        final Pools.Pool<DecodeJob<?>> b = com.bumptech.glide.util.k.a.a(150, new C0029a());

        /* renamed from: c, reason: collision with root package name */
        private int f1653c;

        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C0029a implements a.b<DecodeJob<?>> {
            C0029a() {
            }

            @Override // com.bumptech.glide.util.k.a.b
            public DecodeJob<?> a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.a, aVar.b);
            }
        }

        a(DecodeJob.d dVar) {
            this.a = dVar;
        }

        <R> DecodeJob<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.d dVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.f fVar, DecodeJob.a<R> aVar) {
            DecodeJob<R> decodeJob = (DecodeJob) this.b.acquire();
            Objects.requireNonNull(decodeJob, "Argument must not be null");
            int i3 = this.f1653c;
            this.f1653c = i3 + 1;
            decodeJob.k(eVar, obj, nVar, dVar, i, i2, cls, cls2, priority, jVar, map, z, z2, z3, fVar, aVar, i3);
            return decodeJob;
        }
    }

    @VisibleForTesting
    static class b {
        final com.bumptech.glide.load.engine.D.a a;
        final com.bumptech.glide.load.engine.D.a b;

        /* renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.D.a f1654c;

        /* renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.D.a f1655d;

        /* renamed from: e, reason: collision with root package name */
        final m f1656e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f1657f;

        /* renamed from: g, reason: collision with root package name */
        final Pools.Pool<l<?>> f1658g = com.bumptech.glide.util.k.a.a(150, new a());

        class a implements a.b<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.k.a.b
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.a, bVar.b, bVar.f1654c, bVar.f1655d, bVar.f1656e, bVar.f1657f, bVar.f1658g);
            }
        }

        b(com.bumptech.glide.load.engine.D.a aVar, com.bumptech.glide.load.engine.D.a aVar2, com.bumptech.glide.load.engine.D.a aVar3, com.bumptech.glide.load.engine.D.a aVar4, m mVar, p.a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.f1654c = aVar3;
            this.f1655d = aVar4;
            this.f1656e = mVar;
            this.f1657f = aVar5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements DecodeJob.d {
        private final a.InterfaceC0022a a;
        private volatile com.bumptech.glide.load.engine.C.a b;

        c(a.InterfaceC0022a interfaceC0022a) {
            this.a = interfaceC0022a;
        }

        public com.bumptech.glide.load.engine.C.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.build();
                    }
                    if (this.b == null) {
                        this.b = new com.bumptech.glide.load.engine.C.b();
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        private final l<?> a;
        private final com.bumptech.glide.request.i b;

        d(com.bumptech.glide.request.i iVar, l<?> lVar) {
            this.b = iVar;
            this.a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.a.l(this.b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.C.i iVar, a.InterfaceC0022a interfaceC0022a, com.bumptech.glide.load.engine.D.a aVar, com.bumptech.glide.load.engine.D.a aVar2, com.bumptech.glide.load.engine.D.a aVar3, com.bumptech.glide.load.engine.D.a aVar4, boolean z) {
        this.f1648c = iVar;
        c cVar = new c(interfaceC0022a);
        this.f1651f = cVar;
        C0500a c0500a = new C0500a(z);
        this.h = c0500a;
        c0500a.d(this);
        this.b = new o();
        this.a = new s();
        this.f1649d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f1652g = new a(cVar);
        this.f1650e = new y();
        iVar.d(this);
    }

    @Nullable
    private p<?> c(n nVar, boolean z, long j) {
        p<?> pVar;
        if (!z) {
            return null;
        }
        C0500a c0500a = this.h;
        synchronized (c0500a) {
            C0500a.b bVar = c0500a.f1628c.get(nVar);
            if (bVar == null) {
                pVar = null;
            } else {
                pVar = bVar.get();
                if (pVar == null) {
                    c0500a.c(bVar);
                }
            }
        }
        if (pVar != null) {
            pVar.b();
        }
        if (pVar != null) {
            if (i) {
                d("Loaded resource from active resources", j, nVar);
            }
            return pVar;
        }
        v<?> c2 = this.f1648c.c(nVar);
        p<?> pVar2 = c2 == null ? null : c2 instanceof p ? (p) c2 : new p<>(c2, true, true, nVar, this);
        if (pVar2 != null) {
            pVar2.b();
            this.h.a(nVar, pVar2);
        }
        if (pVar2 == null) {
            return null;
        }
        if (i) {
            d("Loaded resource from cache", j, nVar);
        }
        return pVar2;
    }

    private static void d(String str, long j, com.bumptech.glide.load.d dVar) {
        StringBuilder S = e.a.a.a.a.S(str, " in ");
        S.append(com.bumptech.glide.util.f.a(j));
        S.append("ms, key: ");
        S.append(dVar);
        Log.v("Engine", S.toString());
    }

    private <R> d i(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.d dVar, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z, boolean z2, com.bumptech.glide.load.f fVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.request.i iVar, Executor executor, n nVar, long j) {
        l<?> a2 = this.a.a(nVar, z6);
        if (a2 != null) {
            a2.a(iVar, executor);
            if (i) {
                d("Added to existing load", j, nVar);
            }
            return new d(iVar, a2);
        }
        l<?> acquire = this.f1649d.f1658g.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        acquire.f(nVar, z3, z4, z5, z6);
        DecodeJob<?> a3 = this.f1652g.a(eVar, obj, nVar, dVar, i2, i3, cls, cls2, priority, jVar, map, z, z2, z6, fVar, acquire);
        this.a.c(nVar, acquire);
        acquire.a(iVar, executor);
        acquire.n(a3);
        if (i) {
            d("Started new load", j, nVar);
        }
        return new d(iVar, acquire);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void a(com.bumptech.glide.load.d dVar, p<?> pVar) {
        C0500a c0500a = this.h;
        synchronized (c0500a) {
            C0500a.b remove = c0500a.f1628c.remove(dVar);
            if (remove != null) {
                remove.f1631c = null;
                remove.clear();
            }
        }
        if (pVar.e()) {
            this.f1648c.b(dVar, pVar);
        } else {
            this.f1650e.a(pVar, false);
        }
    }

    public <R> d b(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.d dVar, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z, boolean z2, com.bumptech.glide.load.f fVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.request.i iVar, Executor executor) {
        long j;
        if (i) {
            int i4 = com.bumptech.glide.util.f.b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        Objects.requireNonNull(this.b);
        n nVar = new n(obj, dVar, i2, i3, map, cls, cls2, fVar);
        synchronized (this) {
            p<?> c2 = c(nVar, z3, j2);
            if (c2 == null) {
                return i(eVar, obj, dVar, i2, i3, cls, cls2, priority, jVar, map, z, z2, fVar, z3, z4, z5, z6, iVar, executor, nVar, j2);
            }
            ((SingleRequest) iVar).p(c2, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    public synchronized void e(l<?> lVar, com.bumptech.glide.load.d dVar) {
        this.a.d(dVar, lVar);
    }

    public synchronized void f(l<?> lVar, com.bumptech.glide.load.d dVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.e()) {
                this.h.a(dVar, pVar);
            }
        }
        this.a.d(dVar, lVar);
    }

    public void g(@NonNull v<?> vVar) {
        this.f1650e.a(vVar, true);
    }

    public void h(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).f();
    }
}
