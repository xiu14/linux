package e.c.e.b.a.i;

import android.graphics.Rect;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.d.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class f implements g {
    private final e.c.e.b.a.d a;
    private final com.facebook.common.time.b b;

    /* renamed from: c, reason: collision with root package name */
    private final h f9777c = new h();

    /* renamed from: d, reason: collision with root package name */
    private final j<Boolean> f9778d;

    /* renamed from: e, reason: collision with root package name */
    private c f9779e;

    /* renamed from: f, reason: collision with root package name */
    private b f9780f;

    /* renamed from: g, reason: collision with root package name */
    private e.c.e.b.a.i.i.c f9781g;
    private e.c.e.b.a.i.i.a h;
    private e.c.h.l.d i;
    private List<e> j;
    private boolean k;

    public f(com.facebook.common.time.b bVar, e.c.e.b.a.d dVar, j<Boolean> jVar) {
        this.b = bVar;
        this.a = dVar;
        this.f9778d = jVar;
    }

    public void a(e eVar) {
        if (this.j == null) {
            this.j = new CopyOnWriteArrayList();
        }
        this.j.add(eVar);
    }

    public void b(h hVar, int i) {
        List<e> list;
        if (!this.k || (list = this.j) == null || list.isEmpty()) {
            return;
        }
        d A = hVar.A();
        Iterator<e> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().b(A, i);
        }
    }

    public void c(h hVar, int i) {
        List<e> list;
        e.c.e.e.b p;
        hVar.n(i);
        if (!this.k || (list = this.j) == null || list.isEmpty()) {
            return;
        }
        if (i == 3 && (p = this.a.p()) != null && p.f() != null) {
            Rect bounds = p.f().getBounds();
            this.f9777c.u(bounds.width());
            this.f9777c.t(bounds.height());
        }
        d A = hVar.A();
        Iterator<e> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().a(A, i);
        }
    }

    public void d() {
        List<e> list = this.j;
        if (list != null) {
            list.clear();
        }
        e(false);
        this.f9777c.b();
    }

    public void e(boolean z) {
        this.k = z;
        if (!z) {
            b bVar = this.f9780f;
            if (bVar != null) {
                this.a.j0(bVar);
            }
            e.c.e.b.a.i.i.a aVar = this.h;
            if (aVar != null) {
                this.a.P(aVar);
            }
            e.c.h.l.d dVar = this.i;
            if (dVar != null) {
                this.a.k0(dVar);
                return;
            }
            return;
        }
        if (this.h == null) {
            this.h = new e.c.e.b.a.i.i.a(this.b, this.f9777c, this, this.f9778d);
        }
        if (this.f9781g == null) {
            this.f9781g = new e.c.e.b.a.i.i.c(this.b, this.f9777c);
        }
        if (this.f9780f == null) {
            this.f9780f = new e.c.e.b.a.i.i.b(this.f9777c, this);
        }
        c cVar = this.f9779e;
        if (cVar == null) {
            this.f9779e = new c(this.a.q(), this.f9780f);
        } else {
            cVar.m(this.a.q());
        }
        if (this.i == null) {
            this.i = new e.c.h.l.d(this.f9781g, this.f9779e);
        }
        b bVar2 = this.f9780f;
        if (bVar2 != null) {
            this.a.c0(bVar2);
        }
        e.c.e.b.a.i.i.a aVar2 = this.h;
        if (aVar2 != null) {
            this.a.f(aVar2);
        }
        e.c.h.l.d dVar2 = this.i;
        if (dVar2 != null) {
            this.a.d0(dVar2);
        }
    }

    public void f(AbstractDraweeControllerBuilder<e.c.e.b.a.e, ImageRequest, e.c.c.g.a<com.facebook.imagepipeline.image.d>, com.facebook.imagepipeline.image.h> abstractDraweeControllerBuilder) {
        this.f9777c.i(abstractDraweeControllerBuilder.g(), abstractDraweeControllerBuilder.h(), abstractDraweeControllerBuilder.f());
    }
}
