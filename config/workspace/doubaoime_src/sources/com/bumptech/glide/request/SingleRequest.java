package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j.m;
import com.bumptech.glide.request.l.a;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class SingleRequest<R> implements e, com.bumptech.glide.request.k.g, i {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);

    @GuardedBy("requestLock")
    private int A;

    @GuardedBy("requestLock")
    private int B;

    @GuardedBy("requestLock")
    private boolean C;

    @Nullable
    private RuntimeException D;
    private int a;

    @Nullable
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.k.d f1829c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f1830d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final g<R> f1831e;

    /* renamed from: f, reason: collision with root package name */
    private final RequestCoordinator f1832f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f1833g;
    private final com.bumptech.glide.e h;

    @Nullable
    private final Object i;
    private final Class<R> j;
    private final a<?> k;
    private final int l;
    private final int m;
    private final Priority n;
    private final com.bumptech.glide.request.k.h<R> o;

    @Nullable
    private final List<g<R>> p;
    private final com.bumptech.glide.request.l.c<? super R> q;
    private final Executor r;

    @GuardedBy("requestLock")
    private v<R> s;

    @GuardedBy("requestLock")
    private k.d t;

    @GuardedBy("requestLock")
    private long u;
    private volatile k v;

    @GuardedBy("requestLock")
    private Status w;

    @Nullable
    @GuardedBy("requestLock")
    private Drawable x;

    @Nullable
    @GuardedBy("requestLock")
    private Drawable y;

    @Nullable
    @GuardedBy("requestLock")
    private Drawable z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, com.bumptech.glide.e eVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, a<?> aVar, int i, int i2, Priority priority, com.bumptech.glide.request.k.h<R> hVar, @Nullable g<R> gVar, @Nullable List<g<R>> list, RequestCoordinator requestCoordinator, k kVar, com.bumptech.glide.request.l.c<? super R> cVar, Executor executor) {
        this.b = E ? String.valueOf(hashCode()) : null;
        this.f1829c = com.bumptech.glide.util.k.d.a();
        this.f1830d = obj;
        this.f1833g = context;
        this.h = eVar;
        this.i = obj2;
        this.j = cls;
        this.k = aVar;
        this.l = i;
        this.m = i2;
        this.n = priority;
        this.o = hVar;
        this.f1831e = gVar;
        this.p = list;
        this.f1832f = requestCoordinator;
        this.v = kVar;
        this.q = cVar;
        this.r = executor;
        this.w = Status.PENDING;
        if (this.D == null && eVar.g().a(d.C0020d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    private void e() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    private Drawable f() {
        if (this.z == null) {
            Drawable k = this.k.k();
            this.z = k;
            if (k == null && this.k.l() > 0) {
                this.z = k(this.k.l());
            }
        }
        return this.z;
    }

    @GuardedBy("requestLock")
    private Drawable i() {
        if (this.y == null) {
            Drawable q = this.k.q();
            this.y = q;
            if (q == null && this.k.r() > 0) {
                this.y = k(this.k.r());
            }
        }
        return this.y;
    }

    @GuardedBy("requestLock")
    private boolean j() {
        RequestCoordinator requestCoordinator = this.f1832f;
        return requestCoordinator == null || !requestCoordinator.getRoot().a();
    }

    @GuardedBy("requestLock")
    private Drawable k(@DrawableRes int i) {
        return com.bumptech.glide.load.k.e.b.a(this.f1833g, i, this.k.w() != null ? this.k.w() : this.f1833g.getTheme());
    }

    private void l(String str) {
        StringBuilder S = e.a.a.a.a.S(str, " this: ");
        S.append(this.b);
        Log.v("GlideRequest", S.toString());
    }

    public static <R> SingleRequest<R> m(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i, int i2, Priority priority, com.bumptech.glide.request.k.h<R> hVar, g<R> gVar, @Nullable List<g<R>> list, RequestCoordinator requestCoordinator, k kVar, com.bumptech.glide.request.l.c<? super R> cVar, Executor executor) {
        return new SingleRequest<>(context, eVar, obj, obj2, cls, aVar, i, i2, priority, hVar, gVar, list, requestCoordinator, kVar, cVar, executor);
    }

    private void o(q qVar, int i) {
        boolean z;
        this.f1829c.c();
        synchronized (this.f1830d) {
            Objects.requireNonNull(qVar);
            int h = this.h.h();
            if (h <= i) {
                Log.w("Glide", "Load failed for [" + this.i + "] with dimensions [" + this.A + "x" + this.B + "]", qVar);
                if (h <= 4) {
                    qVar.e("Glide");
                }
            }
            this.t = null;
            this.w = Status.FAILED;
            RequestCoordinator requestCoordinator = this.f1832f;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
            boolean z2 = true;
            this.C = true;
            try {
                List<g<R>> list = this.p;
                if (list != null) {
                    Iterator<g<R>> it2 = list.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        z |= it2.next().d(qVar, this.i, this.o, j());
                    }
                } else {
                    z = false;
                }
                g<R> gVar = this.f1831e;
                if (gVar == null || !gVar.d(qVar, this.i, this.o, j())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    r();
                }
            } finally {
                this.C = false;
            }
        }
    }

    @GuardedBy("requestLock")
    private void q(v<R> vVar, R r, DataSource dataSource, boolean z) {
        boolean z2;
        boolean j = j();
        this.w = Status.COMPLETE;
        this.s = vVar;
        if (this.h.h() <= 3) {
            StringBuilder M = e.a.a.a.a.M("Finished loading ");
            M.append(r.getClass().getSimpleName());
            M.append(" from ");
            M.append(dataSource);
            M.append(" for ");
            M.append(this.i);
            M.append(" with size [");
            M.append(this.A);
            M.append("x");
            M.append(this.B);
            M.append("] in ");
            M.append(com.bumptech.glide.util.f.a(this.u));
            M.append(" ms");
            Log.d("Glide", M.toString());
        }
        RequestCoordinator requestCoordinator = this.f1832f;
        if (requestCoordinator != null) {
            requestCoordinator.h(this);
        }
        boolean z3 = true;
        this.C = true;
        try {
            List<g<R>> list = this.p;
            if (list != null) {
                z2 = false;
                for (g<R> gVar : list) {
                    boolean g2 = z2 | gVar.g(r, this.i, this.o, dataSource, j);
                    z2 = gVar instanceof c ? ((c) gVar).a(r, this.i, this.o, dataSource, j, z) | g2 : g2;
                }
            } else {
                z2 = false;
            }
            g<R> gVar2 = this.f1831e;
            if (gVar2 == null || !gVar2.g(r, this.i, this.o, dataSource, j)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.o.b(r, ((a.C0045a) this.q).a(dataSource, j));
            }
        } finally {
            this.C = false;
        }
    }

    @GuardedBy("requestLock")
    private void r() {
        RequestCoordinator requestCoordinator = this.f1832f;
        if (requestCoordinator == null || requestCoordinator.e(this)) {
            Drawable f2 = this.i == null ? f() : null;
            if (f2 == null) {
                if (this.x == null) {
                    Drawable j = this.k.j();
                    this.x = j;
                    if (j == null && this.k.i() > 0) {
                        this.x = k(this.k.i());
                    }
                }
                f2 = this.x;
            }
            if (f2 == null) {
                f2 = i();
            }
            this.o.e(f2);
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean a() {
        boolean z;
        synchronized (this.f1830d) {
            z = this.w == Status.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.k.g
    public void b(int i, int i2) {
        Object obj;
        int i3 = i;
        this.f1829c.c();
        Object obj2 = this.f1830d;
        synchronized (obj2) {
            try {
                boolean z = E;
                if (z) {
                    l("Got onSizeReady in " + com.bumptech.glide.util.f.a(this.u));
                }
                if (this.w == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.w = status;
                    float v = this.k.v();
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(i3 * v);
                    }
                    this.A = i3;
                    this.B = i2 == Integer.MIN_VALUE ? i2 : Math.round(v * i2);
                    if (z) {
                        l("finished setup for calling load in " + com.bumptech.glide.util.f.a(this.u));
                    }
                    obj = obj2;
                    try {
                        try {
                            this.t = this.v.b(this.h, this.i, this.k.u(), this.A, this.B, this.k.t(), this.j, this.n, this.k.h(), this.k.x(), this.k.H(), this.k.E(), this.k.n(), this.k.C(), this.k.z(), this.k.y(), this.k.m(), this, this.r);
                            if (this.w != status) {
                                this.t = null;
                            }
                            if (z) {
                                l("finished onSizeReady in " + com.bumptech.glide.util.f.a(this.u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(e eVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        Priority priority2;
        int size2;
        if (!(eVar instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f1830d) {
            i = this.l;
            i2 = this.m;
            obj = this.i;
            cls = this.j;
            aVar = this.k;
            priority = this.n;
            List<g<R>> list = this.p;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) eVar;
        synchronized (singleRequest.f1830d) {
            i3 = singleRequest.l;
            i4 = singleRequest.m;
            obj2 = singleRequest.i;
            cls2 = singleRequest.j;
            aVar2 = singleRequest.k;
            priority2 = singleRequest.n;
            List<g<R>> list2 = singleRequest.p;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            int i5 = com.bumptech.glide.util.j.f1862d;
            if ((obj == null ? obj2 == null : obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.B(aVar2)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:9:0x0013, B:11:0x0025, B:12:0x002a, B:14:0x002e, B:15:0x0031, B:17:0x0035, B:22:0x0041, B:23:0x004a, B:24:0x004c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.bumptech.glide.request.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1830d
            monitor-enter(r0)
            r5.e()     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.util.k.d r1 = r5.f1829c     // Catch: java.lang.Throwable -> L55
            r1.c()     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.w     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L55
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            return
        L13:
            r5.e()     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.util.k.d r1 = r5.f1829c     // Catch: java.lang.Throwable -> L55
            r1.c()     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.request.k.h<R> r1 = r5.o     // Catch: java.lang.Throwable -> L55
            r1.a(r5)     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.load.engine.k$d r1 = r5.t     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r1 == 0) goto L2a
            r1.a()     // Catch: java.lang.Throwable -> L55
            r5.t = r3     // Catch: java.lang.Throwable -> L55
        L2a:
            com.bumptech.glide.load.engine.v<R> r1 = r5.s     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L31
            r5.s = r3     // Catch: java.lang.Throwable -> L55
            r3 = r1
        L31:
            com.bumptech.glide.request.RequestCoordinator r1 = r5.f1832f     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L3e
            boolean r1 = r1.i(r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L3c
            goto L3e
        L3c:
            r1 = 0
            goto L3f
        L3e:
            r1 = 1
        L3f:
            if (r1 == 0) goto L4a
            com.bumptech.glide.request.k.h<R> r1 = r5.o     // Catch: java.lang.Throwable -> L55
            android.graphics.drawable.Drawable r4 = r5.i()     // Catch: java.lang.Throwable -> L55
            r1.j(r4)     // Catch: java.lang.Throwable -> L55
        L4a:
            r5.w = r2     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L54
            com.bumptech.glide.load.engine.k r0 = r5.v
            r0.h(r3)
        L54:
            return
        L55:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    @Override // com.bumptech.glide.request.e
    public boolean d() {
        boolean z;
        synchronized (this.f1830d) {
            z = this.w == Status.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public void g() {
        synchronized (this.f1830d) {
            e();
            this.f1829c.c();
            int i = com.bumptech.glide.util.f.b;
            this.u = SystemClock.elapsedRealtimeNanos();
            if (this.i == null) {
                if (com.bumptech.glide.util.j.j(this.l, this.m)) {
                    this.A = this.l;
                    this.B = this.m;
                }
                o(new q("Received null model"), f() == null ? 5 : 3);
                return;
            }
            Status status = this.w;
            if (status == Status.RUNNING) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (status == Status.COMPLETE) {
                p(this.s, DataSource.MEMORY_CACHE, false);
                return;
            }
            List<g<R>> list = this.p;
            if (list != null) {
                for (g<R> gVar : list) {
                    if (gVar instanceof c) {
                        Objects.requireNonNull((c) gVar);
                    }
                }
            }
            this.a = -1;
            Status status2 = Status.WAITING_FOR_SIZE;
            this.w = status2;
            if (com.bumptech.glide.util.j.j(this.l, this.m)) {
                b(this.l, this.m);
            } else {
                this.o.k(this);
            }
            Status status3 = this.w;
            if (status3 == Status.RUNNING || status3 == status2) {
                RequestCoordinator requestCoordinator = this.f1832f;
                if (requestCoordinator == null || requestCoordinator.e(this)) {
                    this.o.h(i());
                }
            }
            if (E) {
                l("finished run method in " + com.bumptech.glide.util.f.a(this.u));
            }
        }
    }

    public Object h() {
        this.f1829c.c();
        return this.f1830d;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z;
        synchronized (this.f1830d) {
            z = this.w == Status.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z;
        synchronized (this.f1830d) {
            Status status = this.w;
            z = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
        }
        return z;
    }

    public void n(q qVar) {
        o(qVar, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(v<?> vVar, DataSource dataSource, boolean z) {
        this.f1829c.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f1830d) {
                try {
                    this.t = null;
                    if (vVar == null) {
                        o(new q("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.j.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.f1832f;
                            if (requestCoordinator == null || requestCoordinator.f(this)) {
                                q(vVar, obj, dataSource, z);
                                return;
                            }
                            this.s = null;
                            this.w = Status.COMPLETE;
                            this.v.h(vVar);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        o(new q(sb.toString()), 5);
                        this.v.h(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.v.h(vVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f1830d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f1830d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
