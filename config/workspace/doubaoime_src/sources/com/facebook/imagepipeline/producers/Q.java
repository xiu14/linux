package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: classes2.dex */
public class Q implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> a;
    private final e.c.h.f.g b;

    /* renamed from: c, reason: collision with root package name */
    private final U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f6567c;

    public static class a extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        private final com.facebook.cache.common.b f6568c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6569d;

        /* renamed from: e, reason: collision with root package name */
        private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f6570e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6571f;

        public a(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, com.facebook.cache.common.b bVar, boolean z, e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, boolean z2) {
            super(interfaceC0732l);
            this.f6568c = bVar;
            this.f6569d = z;
            this.f6570e = sVar;
            this.f6571f = z2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = (e.c.c.g.a) obj;
            if (aVar == null) {
                if (AbstractC0722b.e(i)) {
                    n().c(null, i);
                }
            } else if (!AbstractC0722b.f(i) || this.f6569d) {
                e.c.c.g.a<com.facebook.imagepipeline.image.d> b = this.f6571f ? this.f6570e.b(this.f6568c, aVar) : null;
                try {
                    n().b(1.0f);
                    InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> n = n();
                    if (b != null) {
                        aVar = b;
                    }
                    n.c(aVar, i);
                } finally {
                    e.c.c.g.a.o(b);
                }
            }
        }
    }

    public Q(e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, e.c.h.f.g gVar, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u) {
        this.a = sVar;
        this.b = gVar;
        this.f6567c = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        X n = v.n();
        ImageRequest d2 = v.d();
        Object b = v.b();
        com.facebook.imagepipeline.request.c k = d2.k();
        if (k == null || k.c() == null) {
            this.f6567c.b(interfaceC0732l, v);
            return;
        }
        n.e(v, "PostprocessedBitmapMemoryCacheProducer");
        com.facebook.cache.common.b d3 = ((e.c.h.f.l) this.b).d(d2, b);
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = this.a.get(d3);
        if (aVar == null) {
            a aVar2 = new a(interfaceC0732l, d3, k instanceof com.facebook.imagepipeline.request.d, this.a, v.d().y());
            n.j(v, "PostprocessedBitmapMemoryCacheProducer", n.g(v, "PostprocessedBitmapMemoryCacheProducer") ? e.c.c.d.f.of("cached_value_found", "false") : null);
            this.f6567c.b(aVar2, v);
        } else {
            n.j(v, "PostprocessedBitmapMemoryCacheProducer", n.g(v, "PostprocessedBitmapMemoryCacheProducer") ? e.c.c.d.f.of("cached_value_found", "true") : null);
            n.c(v, "PostprocessedBitmapMemoryCacheProducer", true);
            v.g("memory_bitmap", "postprocessed");
            interfaceC0732l.b(1.0f);
            interfaceC0732l.c(aVar, 1);
            aVar.close();
        }
    }
}
