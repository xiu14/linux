package e.c.h.g;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.d.h;
import e.c.h.f.s;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class h {
    private static final CancellationException m = new CancellationException("Prefetching is not enabled");
    private final p a;
    private final e.c.h.l.f b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.l.e f9884c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.c.d.j<Boolean> f9885d;

    /* renamed from: e, reason: collision with root package name */
    private final s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f9886e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.h.f.g f9887f;

    /* renamed from: g, reason: collision with root package name */
    private final g0 f9888g;
    private final e.c.c.d.j<Boolean> h;
    private final j k;
    private AtomicLong i = new AtomicLong();
    private final e.c.b.a j = null;
    private final q l = new q();

    class a implements e.c.c.d.j<com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> {
        final /* synthetic */ ImageRequest a;
        final /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageRequest.RequestLevel f9889c;

        a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
            this.a = imageRequest;
            this.b = obj;
            this.f9889c = requestLevel;
        }

        @Override // e.c.c.d.j
        public com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> get() {
            return h.this.a(this.a, this.b, this.f9889c);
        }

        public String toString() {
            h.b k = e.c.c.d.h.k(this);
            k.b("uri", this.a.v());
            return k.toString();
        }
    }

    public h(p pVar, Set<e.c.h.l.f> set, Set<e.c.h.l.e> set2, e.c.c.d.j<Boolean> jVar, s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar2, e.c.h.f.f fVar, e.c.h.f.f fVar2, HashMap<String, e.c.h.f.f> hashMap, e.c.h.f.g gVar, g0 g0Var, e.c.c.d.j<Boolean> jVar2, e.c.c.d.j<Boolean> jVar3, e.c.b.a aVar, j jVar4) {
        this.a = pVar;
        this.b = new e.c.h.l.d(set);
        this.f9884c = new e.c.h.l.c(set2);
        this.f9885d = jVar;
        this.f9886e = sVar;
        this.f9887f = gVar;
        this.f9888g = g0Var;
        this.h = jVar2;
        this.k = jVar4;
    }

    private <T> com.facebook.datasource.d<e.c.c.g.a<T>> i(U<e.c.c.g.a<T>> u, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, e.c.h.l.f fVar, Priority priority, String str) {
        boolean z;
        e.c.h.m.b.b();
        e.c.h.l.f f2 = f(imageRequest, fVar);
        A a2 = new A(f(imageRequest, fVar), this.f9884c);
        e.c.b.a aVar = this.j;
        if (aVar != null) {
            aVar.a(obj, false);
        }
        try {
            ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.j(), requestLevel);
            String valueOf = String.valueOf(this.i.getAndIncrement());
            if (!imageRequest.p() && !imageRequest.o() && com.facebook.common.util.c.h(imageRequest.v())) {
                z = false;
                return e.c.h.h.c.t(u, new b0(imageRequest, valueOf, null, a2, f2, obj, max, false, z, priority, this.k), a2);
            }
            z = true;
            return e.c.h.h.c.t(u, new b0(imageRequest, valueOf, null, a2, f2, obj, max, false, z, priority, this.k), a2);
        } catch (Exception e2) {
            return com.facebook.datasource.e.c(e2);
        } finally {
            e.c.h.m.b.b();
        }
    }

    private com.facebook.datasource.d<Void> j(U<Void> u, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority) {
        A a2 = new A(f(imageRequest, null), this.f9884c);
        e.c.h.l.f f2 = f(imageRequest, null);
        e.c.b.a aVar = this.j;
        if (aVar != null) {
            aVar.a(obj, true);
        }
        try {
            return e.c.h.h.d.t(u, new b0(imageRequest, String.valueOf(this.i.getAndIncrement()), a2, f2, obj, ImageRequest.RequestLevel.getMax(imageRequest.j(), requestLevel), true, false, Priority.getLowerPriority(priority, Priority.MEDIUM), this.k), a2);
        } catch (Exception e2) {
            return com.facebook.datasource.e.c(e2);
        }
    }

    public com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return b(imageRequest, obj, requestLevel, null, imageRequest != null ? imageRequest.n() : Priority.HIGH);
    }

    public com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> b(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, e.c.h.l.f fVar, Priority priority) {
        try {
            return i(this.a.e(imageRequest), imageRequest, requestLevel, obj, fVar, priority, null);
        } catch (Exception e2) {
            return com.facebook.datasource.e.c(e2);
        }
    }

    public s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> c() {
        return this.f9886e;
    }

    public e.c.h.f.g d() {
        return this.f9887f;
    }

    public e.c.c.d.j<com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> e(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return new a(imageRequest, null, requestLevel);
    }

    public e.c.h.l.f f(ImageRequest imageRequest, e.c.h.l.f fVar) {
        return fVar == null ? imageRequest.r() == null ? this.b : new e.c.h.l.d(this.b, imageRequest.r()) : imageRequest.r() == null ? new e.c.h.l.d(this.b, fVar) : new e.c.h.l.d(this.b, fVar, imageRequest.r());
    }

    public q g() {
        return this.l;
    }

    public com.facebook.datasource.d<Void> h(ImageRequest imageRequest, Object obj) {
        Priority n = imageRequest != null ? imageRequest.n() : Priority.HIGH;
        if (!this.f9885d.get().booleanValue()) {
            return com.facebook.datasource.e.c(m);
        }
        try {
            return j(this.a.f(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, null, n);
        } catch (Exception e2) {
            return com.facebook.datasource.e.c(e2);
        }
    }
}
