package e.c.e.b.a;

import android.content.res.Resources;
import e.c.c.d.j;
import e.c.h.f.s;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class g {
    private Resources a;
    private com.facebook.drawee.components.a b;

    /* renamed from: c, reason: collision with root package name */
    private e.c.h.k.a f9772c;

    /* renamed from: d, reason: collision with root package name */
    private Executor f9773d;

    /* renamed from: e, reason: collision with root package name */
    private s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f9774e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.c.d.e<e.c.h.k.a> f9775f;

    /* renamed from: g, reason: collision with root package name */
    private j<Boolean> f9776g;
    private Set<com.facebook.drawee.controller.e> h;

    public Set<com.facebook.drawee.controller.e> a() {
        return this.h;
    }

    public void b(Resources resources, com.facebook.drawee.components.a aVar, e.c.h.k.a aVar2, Executor executor, s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, e.c.c.d.e<e.c.h.k.a> eVar, j<Boolean> jVar, Set<com.facebook.drawee.controller.e> set) {
        this.a = resources;
        this.b = aVar;
        this.f9772c = aVar2;
        this.f9773d = executor;
        this.f9774e = sVar;
        this.f9775f = null;
        this.f9776g = null;
        this.h = null;
    }

    public d c() {
        d dVar = new d(this.a, this.b, this.f9772c, this.f9773d, this.f9774e, this.f9775f);
        j<Boolean> jVar = this.f9776g;
        if (jVar != null) {
            dVar.l0(jVar.get().booleanValue());
        }
        return dVar;
    }
}
