package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
class N implements c.c<com.facebook.imagepipeline.image.f, Void> {
    final /* synthetic */ X a;
    final /* synthetic */ V b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC0732l f6556c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.facebook.cache.common.b f6557d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f6558e;

    N(P p, X x, V v, InterfaceC0732l interfaceC0732l, com.facebook.cache.common.b bVar) {
        this.f6558e = p;
        this.a = x;
        this.b = v;
        this.f6556c = interfaceC0732l;
        this.f6557d = bVar;
    }

    @Override // c.c
    public Void a(c.h<com.facebook.imagepipeline.image.f> hVar) throws Exception {
        if (hVar.f() || (hVar.g() && (hVar.d() instanceof CancellationException))) {
            this.a.d(this.b, "PartialDiskCacheProducer", null);
            this.f6556c.d();
        } else if (hVar.g()) {
            this.a.k(this.b, "PartialDiskCacheProducer", hVar.d(), null);
            P.c(this.f6558e, this.f6556c, this.b, this.f6557d, null);
        } else {
            com.facebook.imagepipeline.image.f e2 = hVar.e();
            if (e2 != null) {
                X x = this.a;
                V v = this.b;
                x.j(v, "PartialDiskCacheProducer", P.d(x, v, true, e2.I()));
                int I = e2.I() - 1;
                e.c.c.d.h.a(I > 0);
                com.facebook.imagepipeline.common.a aVar = new com.facebook.imagepipeline.common.a(0, I);
                e2.j0(aVar);
                int I2 = e2.I();
                ImageRequest d2 = this.b.d();
                com.facebook.imagepipeline.common.a c2 = d2.c();
                if (c2 != null && aVar.a <= c2.a && aVar.b >= c2.b) {
                    this.b.g("disk", "partial");
                    this.a.c(this.b, "PartialDiskCacheProducer", true);
                    this.f6556c.c(e2, 9);
                } else {
                    this.f6556c.c(e2, 8);
                    com.facebook.imagepipeline.request.b b = com.facebook.imagepipeline.request.b.b(d2);
                    int i = I2 - 1;
                    e.c.c.d.h.a(i >= 0);
                    b.A(new com.facebook.imagepipeline.common.a(i, Integer.MAX_VALUE));
                    P.c(this.f6558e, this.f6556c, new b0(b.a(), this.b), this.f6557d, e2);
                }
            } else {
                X x2 = this.a;
                V v2 = this.b;
                x2.j(v2, "PartialDiskCacheProducer", P.d(x2, v2, false, 0));
                P.c(this.f6558e, this.f6556c, this.b, this.f6557d, e2);
            }
        }
        return null;
    }
}
