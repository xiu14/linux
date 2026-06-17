package e.c.e.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import com.facebook.imagepipeline.image.h;
import com.facebook.imagepipeline.image.i;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.d.h;
import e.c.c.d.j;
import e.c.h.f.s;
import e.c.h.g.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class d extends com.facebook.drawee.controller.a<e.c.c.g.a<com.facebook.imagepipeline.image.d>, h> {
    private final e.c.h.k.a B;
    private final e.c.c.d.e<e.c.h.k.a> C;
    private final s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> D;
    private com.facebook.cache.common.b E;
    private j<com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> F;
    private boolean G;
    private e.c.c.d.e<e.c.h.k.a> H;
    private e.c.e.b.a.i.f I;

    /* renamed from: J, reason: collision with root package name */
    private Set<e.c.h.l.f> f9768J;
    private e.c.e.b.a.i.b K;
    private e.c.e.b.a.h.b L;
    private ImageRequest M;
    private ImageRequest[] N;
    private ImageRequest O;

    public d(Resources resources, com.facebook.drawee.components.a aVar, e.c.h.k.a aVar2, Executor executor, s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, e.c.c.d.e<e.c.h.k.a> eVar) {
        super(aVar, executor, null, null);
        this.B = new a(resources, aVar2);
        this.C = eVar;
        this.D = sVar;
    }

    private Drawable h0(e.c.c.d.e<e.c.h.k.a> eVar, com.facebook.imagepipeline.image.d dVar) {
        Drawable c2;
        if (eVar == null) {
            return null;
        }
        Iterator<e.c.h.k.a> it2 = eVar.iterator();
        while (it2.hasNext()) {
            e.c.h.k.a next = it2.next();
            if (next.b(dVar) && (c2 = next.c(dVar)) != null) {
                return c2;
            }
        }
        return null;
    }

    private void i0(com.facebook.imagepipeline.image.d dVar) {
        String str;
        o w;
        if (this.G) {
            if (k() == null) {
                e.c.e.c.a aVar = new e.c.e.c.a();
                e.c.e.c.b.a aVar2 = new e.c.e.c.b.a(aVar);
                this.L = new e.c.e.b.a.h.b();
                e(aVar2);
                T(aVar);
            }
            if (this.K == null) {
                c0(this.L);
            }
            if (k() instanceof e.c.e.c.a) {
                e.c.e.c.a aVar3 = (e.c.e.c.a) k();
                aVar3.e(q());
                e.c.e.e.b p = p();
                q qVar = null;
                if (p != null && (w = com.bytedance.feedbackerlib.a.w(p.f())) != null) {
                    qVar = w.s();
                }
                aVar3.j(qVar);
                int b = this.L.b();
                switch (b) {
                    case 2:
                        str = "network";
                        break;
                    case 3:
                        str = "disk";
                        break;
                    case 4:
                        str = "memory_encoded";
                        break;
                    case 5:
                        str = "memory_bitmap";
                        break;
                    case 6:
                        str = "memory_bitmap_shortcut";
                        break;
                    case 7:
                        str = "local";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
                aVar3.i(str, e.c.e.b.a.h.a.a(b));
                if (dVar == null) {
                    aVar3.d();
                    return;
                }
                aVar3.f(dVar.getWidth(), dVar.getHeight());
                aVar3.h(dVar.o());
                try {
                    if (dVar.getExtras().get("encoded_size") != null) {
                        aVar3.g(Long.parseLong(dVar.getExtras().get("encoded_size").toString()));
                    }
                } catch (Exception e2) {
                    e.c.c.e.a.e(d.class, "updateDebugOverlay setFileSize failed, exception is: " + e2);
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.a
    public Map E(h hVar) {
        h hVar2 = hVar;
        if (hVar2 == null) {
            return null;
        }
        return hVar2.getExtras();
    }

    @Override // com.facebook.drawee.controller.a
    protected void J(String str, e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        synchronized (this) {
            e.c.e.b.a.i.b bVar = this.K;
            if (bVar != null) {
                bVar.a(str, 6, true, "PipelineDraweeController");
            }
            e.c.h.l.f f2 = l.j().i().f(t(), e0());
            f2.a(t(), null, "-1", false);
            f2.c(t(), "-1", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.controller.a
    protected void M(Drawable drawable) {
        if (drawable instanceof e.c.d.a.a) {
            ((e.c.d.a.a) drawable).a();
        }
    }

    @Override // com.facebook.drawee.controller.a
    protected void O(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        int i = e.c.c.g.a.h;
        if (aVar2 != null) {
            aVar2.close();
        }
    }

    @Override // com.facebook.drawee.controller.a, e.c.e.e.a
    public void a(e.c.e.e.b bVar) {
        super.a(bVar);
        i0(null);
    }

    public synchronized void c0(e.c.e.b.a.i.b bVar) {
        e.c.e.b.a.i.b bVar2 = this.K;
        if (bVar2 instanceof e.c.e.b.a.i.a) {
            ((e.c.e.b.a.i.a) bVar2).b(bVar);
        } else if (bVar2 != null) {
            this.K = new e.c.e.b.a.i.a(bVar2, bVar);
        } else {
            this.K = bVar;
        }
    }

    public synchronized void d0(e.c.h.l.f fVar) {
        if (this.f9768J == null) {
            this.f9768J = new HashSet();
        }
        this.f9768J.add(fVar);
    }

    public synchronized e.c.h.l.f e0() {
        e.c.e.b.a.i.c cVar = this.K != null ? new e.c.e.b.a.i.c(q(), this.K) : null;
        Set<e.c.h.l.f> set = this.f9768J;
        if (set == null) {
            return cVar;
        }
        e.c.h.l.d dVar = new e.c.h.l.d(set);
        if (cVar != null) {
            dVar.m(cVar);
        }
        return dVar;
    }

    public void f0(j<com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> jVar, String str, com.facebook.cache.common.b bVar, Object obj, e.c.c.d.e<e.c.h.k.a> eVar, e.c.e.b.a.i.b bVar2, ImageRequest imageRequest) {
        e.c.h.m.b.b();
        y(str, obj, imageRequest);
        this.F = jVar;
        i0(null);
        this.E = bVar;
        this.H = null;
        synchronized (this) {
            this.K = null;
        }
        i0(null);
        c0(null);
        e.c.h.m.b.b();
    }

    @Override // com.facebook.drawee.controller.a
    protected Drawable g(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        try {
            e.c.h.m.b.b();
            e.c.c.d.h.f(e.c.c.g.a.x(aVar2));
            com.facebook.imagepipeline.image.d r = aVar2.r();
            i0(r);
            if (r instanceof com.facebook.imagepipeline.image.c) {
                return ((com.facebook.imagepipeline.image.c) r).s();
            }
            Drawable h0 = h0(this.H, r);
            if (h0 == null && (h0 = h0(this.C, r)) == null) {
                Objects.requireNonNull(l.j().i().g());
                Objects.requireNonNull(r);
                h0 = this.B.a(r, m());
                if (h0 == null) {
                    throw new UnsupportedOperationException("Unrecognized image class: " + r);
                }
            }
            e.c.h.m.b.b();
            return h0;
        } finally {
            e.c.h.m.b.b();
        }
    }

    protected synchronized void g0(e.c.e.b.a.i.e eVar, AbstractDraweeControllerBuilder<e, ImageRequest, e.c.c.g.a<com.facebook.imagepipeline.image.d>, h> abstractDraweeControllerBuilder, j<Boolean> jVar) {
        e.c.e.b.a.i.f fVar = this.I;
        if (fVar != null) {
            fVar.d();
        }
        if (eVar != null) {
            if (this.I == null) {
                this.I = new e.c.e.b.a.i.f(AwakeTimeSinceBootClock.get(), this, jVar);
            }
            this.I.a(eVar);
            this.I.e(true);
            this.I.f(abstractDraweeControllerBuilder);
        }
        this.M = abstractDraweeControllerBuilder.g();
        this.N = abstractDraweeControllerBuilder.f();
        this.O = abstractDraweeControllerBuilder.h();
    }

    @Override // com.facebook.drawee.controller.a
    protected e.c.c.g.a<com.facebook.imagepipeline.image.d> i() {
        com.facebook.cache.common.b bVar;
        e.c.h.m.b.b();
        try {
            s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar = this.D;
            if (sVar != null && (bVar = this.E) != null) {
                e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = sVar.get(bVar);
                if (aVar == null || ((i) aVar.r().l()).b()) {
                    return aVar;
                }
                aVar.close();
            }
            return null;
        } finally {
            e.c.h.m.b.b();
        }
    }

    public synchronized void j0(e.c.e.b.a.i.b bVar) {
        e.c.e.b.a.i.b bVar2 = this.K;
        if (bVar2 instanceof e.c.e.b.a.i.a) {
            ((e.c.e.b.a.i.a) bVar2).c(bVar);
        } else {
            if (bVar2 == bVar) {
                this.K = null;
            }
        }
    }

    public synchronized void k0(e.c.h.l.f fVar) {
        Set<e.c.h.l.f> set = this.f9768J;
        if (set == null) {
            return;
        }
        set.remove(fVar);
    }

    @Override // com.facebook.drawee.controller.a
    public com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> l() {
        e.c.h.m.b.b();
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.n(d.class, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> dVar = this.F.get();
        e.c.h.m.b.b();
        return dVar;
    }

    public void l0(boolean z) {
        this.G = z;
    }

    @Override // com.facebook.drawee.controller.a
    protected int r(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2.s();
        }
        return 0;
    }

    @Override // com.facebook.drawee.controller.a
    protected h s(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        e.c.c.d.h.f(e.c.c.g.a.x(aVar2));
        return aVar2.r();
    }

    @Override // com.facebook.drawee.controller.a
    public String toString() {
        h.b k = e.c.c.d.h.k(this);
        k.b("super", super.toString());
        k.b("dataSourceSupplier", this.F);
        return k.toString();
    }

    @Override // com.facebook.drawee.controller.a
    protected Uri v() {
        Uri apply;
        Uri apply2;
        ImageRequest imageRequest = this.M;
        ImageRequest imageRequest2 = this.O;
        ImageRequest[] imageRequestArr = this.N;
        e.c.c.d.d<ImageRequest, Uri> dVar = ImageRequest.B;
        if (imageRequest != null && (apply2 = dVar.apply(imageRequest)) != null) {
            return apply2;
        }
        if (imageRequestArr != null && imageRequestArr.length > 0 && imageRequestArr[0] != null && (apply = dVar.apply(imageRequestArr[0])) != null) {
            return apply;
        }
        if (imageRequest2 != null) {
            return dVar.apply(imageRequest2);
        }
        return null;
    }
}
