package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.g;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.util.k.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class DecodeJob<R> implements g.a, Runnable, Comparable<DecodeJob<?>>, a.d {
    private DataSource A;
    private com.bumptech.glide.load.data.d<?> B;
    private volatile g C;
    private volatile boolean D;
    private volatile boolean E;

    /* renamed from: J, reason: collision with root package name */
    private boolean f1620J;

    /* renamed from: d, reason: collision with root package name */
    private final d f1622d;

    /* renamed from: e, reason: collision with root package name */
    private final Pools.Pool<DecodeJob<?>> f1623e;
    private com.bumptech.glide.e h;
    private com.bumptech.glide.load.d i;
    private Priority j;
    private n k;
    private int l;
    private int m;
    private j n;
    private com.bumptech.glide.load.f o;
    private a<R> p;
    private int q;
    private Stage r;
    private RunReason s;
    private long t;
    private boolean u;
    private Object v;
    private Thread w;
    private com.bumptech.glide.load.d x;
    private com.bumptech.glide.load.d y;
    private Object z;
    private final h<R> a = new h<>();
    private final List<Throwable> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.k.d f1621c = com.bumptech.glide.util.k.d.a();

    /* renamed from: f, reason: collision with root package name */
    private final c<?> f1624f = new c<>();

    /* renamed from: g, reason: collision with root package name */
    private final e f1625g = new e();

    private enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    interface a<R> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b<Z> implements i.a<Z> {
        private final DataSource a;

        b(DataSource dataSource) {
            this.a = dataSource;
        }

        @NonNull
        public v<Z> a(@NonNull v<Z> vVar) {
            return DecodeJob.this.n(this.a, vVar);
        }
    }

    private static class c<Z> {
        private com.bumptech.glide.load.d a;
        private com.bumptech.glide.load.h<Z> b;

        /* renamed from: c, reason: collision with root package name */
        private u<Z> f1626c;

        c() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.f1626c = null;
        }

        void b(d dVar, com.bumptech.glide.load.f fVar) {
            try {
                ((k.c) dVar).a().a(this.a, new f(this.b, this.f1626c, fVar));
            } finally {
                this.f1626c.e();
            }
        }

        boolean c() {
            return this.f1626c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.d dVar, com.bumptech.glide.load.h<X> hVar, u<X> uVar) {
            this.a = dVar;
            this.b = hVar;
            this.f1626c = uVar;
        }
    }

    interface d {
    }

    private static class e {
        private boolean a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1627c;

        e() {
        }

        private boolean a(boolean z) {
            return (this.f1627c || z || this.b) && this.a;
        }

        synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f1627c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.b = false;
            this.a = false;
            this.f1627c = false;
        }
    }

    DecodeJob(d dVar, Pools.Pool<DecodeJob<?>> pool) {
        this.f1622d = dVar;
        this.f1623e = pool;
    }

    private <Data> v<R> f(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) throws q {
        if (data == null) {
            return null;
        }
        try {
            int i = com.bumptech.glide.util.f.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v<R> g2 = g(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                l("Decoded result " + g2, elapsedRealtimeNanos, null);
            }
            return g2;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> g(Data data, DataSource dataSource) throws q {
        t<Data, ?, R> h = this.a.h(data.getClass());
        com.bumptech.glide.load.f fVar = this.o;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.a.x();
        com.bumptech.glide.load.e<Boolean> eVar = com.bumptech.glide.load.resource.bitmap.m.i;
        Boolean bool = (Boolean) fVar.c(eVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            fVar = new com.bumptech.glide.load.f();
            fVar.d(this.o);
            fVar.e(eVar, Boolean.valueOf(z));
        }
        com.bumptech.glide.load.f fVar2 = fVar;
        com.bumptech.glide.load.data.e<Data> k = this.h.i().k(data);
        try {
            return h.a(k, fVar2, this.l, this.m, new b(dataSource));
        } finally {
            k.b();
        }
    }

    private void h() {
        v<R> vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.t;
            StringBuilder M = e.a.a.a.a.M("data: ");
            M.append(this.z);
            M.append(", cache key: ");
            M.append(this.x);
            M.append(", fetcher: ");
            M.append(this.B);
            l("Retrieved data", j, M.toString());
        }
        u uVar = null;
        try {
            vVar = f(this.B, this.z, this.A);
        } catch (q e2) {
            e2.g(this.y, this.A);
            this.b.add(e2);
            vVar = null;
        }
        if (vVar == null) {
            r();
            return;
        }
        DataSource dataSource = this.A;
        boolean z = this.f1620J;
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
        if (this.f1624f.c()) {
            uVar = u.d(vVar);
            vVar = uVar;
        }
        t();
        ((l) this.p).i(vVar, dataSource, z);
        this.r = Stage.ENCODE;
        try {
            if (this.f1624f.c()) {
                this.f1624f.b(this.f1622d, this.o);
            }
            if (this.f1625g.b()) {
                p();
            }
        } finally {
            if (uVar != null) {
                uVar.e();
            }
        }
    }

    private g i() {
        int ordinal = this.r.ordinal();
        if (ordinal == 1) {
            return new w(this.a, this);
        }
        if (ordinal == 2) {
            return new com.bumptech.glide.load.engine.d(this.a, this);
        }
        if (ordinal == 3) {
            return new A(this.a, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("Unrecognized stage: ");
        M.append(this.r);
        throw new IllegalStateException(M.toString());
    }

    private Stage j(Stage stage) {
        int ordinal = stage.ordinal();
        if (ordinal == 0) {
            return this.n.b() ? Stage.RESOURCE_CACHE : j(Stage.RESOURCE_CACHE);
        }
        if (ordinal == 1) {
            return this.n.a() ? Stage.DATA_CACHE : j(Stage.DATA_CACHE);
        }
        if (ordinal == 2) {
            return this.u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return Stage.FINISHED;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    private void l(String str, long j, String str2) {
        StringBuilder S = e.a.a.a.a.S(str, " in ");
        S.append(com.bumptech.glide.util.f.a(j));
        S.append(", load key: ");
        S.append(this.k);
        S.append(str2 != null ? e.a.a.a.a.s(", ", str2) : "");
        S.append(", thread: ");
        S.append(Thread.currentThread().getName());
        Log.v("DecodeJob", S.toString());
    }

    private void m() {
        t();
        ((l) this.p).h(new q("Failed to load resource", new ArrayList(this.b)));
        if (this.f1625g.c()) {
            p();
        }
    }

    private void p() {
        this.f1625g.e();
        this.f1624f.a();
        this.a.a();
        this.D = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.E = false;
        this.v = null;
        this.b.clear();
        this.f1623e.release(this);
    }

    private void q(RunReason runReason) {
        this.s = runReason;
        ((l) this.p).m(this);
    }

    private void r() {
        this.w = Thread.currentThread();
        int i = com.bumptech.glide.util.f.b;
        this.t = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.E && this.C != null && !(z = this.C.b())) {
            this.r = j(this.r);
            this.C = i();
            if (this.r == Stage.SOURCE) {
                q(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.r == Stage.FINISHED || this.E) && !z) {
            m();
        }
    }

    private void s() {
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            this.r = j(Stage.INITIALIZE);
            this.C = i();
            r();
        } else if (ordinal == 1) {
            r();
        } else if (ordinal == 2) {
            h();
        } else {
            StringBuilder M = e.a.a.a.a.M("Unrecognized run reason: ");
            M.append(this.s);
            throw new IllegalStateException(M.toString());
        }
    }

    private void t() {
        Throwable th;
        this.f1621c.c();
        if (!this.D) {
            this.D = true;
            return;
        }
        if (this.b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.b;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void a(com.bumptech.glide.load.d dVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource) {
        dVar2.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.h(dVar, dataSource, dVar2.a());
        this.b.add(qVar);
        if (Thread.currentThread() != this.w) {
            q(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            r();
        }
    }

    @Override // com.bumptech.glide.util.k.a.d
    @NonNull
    public com.bumptech.glide.util.k.d b() {
        return this.f1621c;
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void c() {
        q(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int ordinal = this.j.ordinal() - decodeJob2.j.ordinal();
        return ordinal == 0 ? this.q - decodeJob2.q : ordinal;
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void d(com.bumptech.glide.load.d dVar, Object obj, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource, com.bumptech.glide.load.d dVar3) {
        this.x = dVar;
        this.z = obj;
        this.B = dVar2;
        this.A = dataSource;
        this.y = dVar3;
        this.f1620J = dVar != this.a.c().get(0);
        if (Thread.currentThread() != this.w) {
            q(RunReason.DECODE_DATA);
        } else {
            h();
        }
    }

    public void e() {
        this.E = true;
        g gVar = this.C;
        if (gVar != null) {
            gVar.cancel();
        }
    }

    DecodeJob<R> k(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.d dVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.f fVar, a<R> aVar, int i3) {
        this.a.v(eVar, obj, dVar, i, i2, jVar, cls, cls2, priority, fVar, map, z, z2, this.f1622d);
        this.h = eVar;
        this.i = dVar;
        this.j = priority;
        this.k = nVar;
        this.l = i;
        this.m = i2;
        this.n = jVar;
        this.u = z3;
        this.o = fVar;
        this.p = aVar;
        this.q = i3;
        this.s = RunReason.INITIALIZE;
        this.v = obj;
        return this;
    }

    @NonNull
    <Z> v<Z> n(DataSource dataSource, @NonNull v<Z> vVar) {
        v<Z> vVar2;
        com.bumptech.glide.load.i<Z> iVar;
        EncodeStrategy encodeStrategy;
        com.bumptech.glide.load.d eVar;
        Class<?> cls = vVar.get().getClass();
        com.bumptech.glide.load.h<Z> hVar = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.i<Z> s = this.a.s(cls);
            iVar = s;
            vVar2 = s.b(this.h, vVar, this.l, this.m);
        } else {
            vVar2 = vVar;
            iVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.recycle();
        }
        if (this.a.w(vVar2)) {
            hVar = this.a.n(vVar2);
            encodeStrategy = hVar.b(this.o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        com.bumptech.glide.load.h hVar2 = hVar;
        h<R> hVar3 = this.a;
        com.bumptech.glide.load.d dVar = this.x;
        List<o.a<?>> g2 = hVar3.g();
        int size = g2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (g2.get(i).a.equals(dVar)) {
                z = true;
                break;
            }
            i++;
        }
        if (!this.n.d(!z, dataSource, encodeStrategy)) {
            return vVar2;
        }
        if (hVar2 == null) {
            throw new g.d(vVar2.get().getClass());
        }
        int ordinal = encodeStrategy.ordinal();
        if (ordinal == 0) {
            eVar = new com.bumptech.glide.load.engine.e(this.x, this.i);
        } else {
            if (ordinal != 1) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            eVar = new x(this.a.b(), this.x, this.i, this.l, this.m, iVar, cls, this.o);
        }
        u d2 = u.d(vVar2);
        this.f1624f.d(eVar, hVar2, d2);
        return d2;
    }

    void o(boolean z) {
        if (this.f1625g.d(z)) {
            p();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    m();
                } else {
                    s();
                    if (dVar != null) {
                        dVar.b();
                    }
                }
            } finally {
                if (dVar != null) {
                    dVar.b();
                }
            }
        } catch (com.bumptech.glide.load.engine.c e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.r, th);
            }
            if (this.r != Stage.ENCODE) {
                this.b.add(th);
                m();
            }
            if (!this.E) {
                throw th;
            }
            throw th;
        }
    }

    boolean u() {
        Stage j = j(Stage.INITIALIZE);
        return j == Stage.RESOURCE_CACHE || j == Stage.DATA_CACHE;
    }
}
