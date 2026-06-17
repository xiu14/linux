package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0741v implements U<com.facebook.imagepipeline.image.f> {
    private final e.c.h.f.f a;
    private final e.c.h.f.f b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.f.g f6660c;

    /* renamed from: d, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6661d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.h.f.e<com.facebook.cache.common.b> f6662e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.h.f.e<com.facebook.cache.common.b> f6663f;

    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    private static class a extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final V f6664c;

        /* renamed from: d, reason: collision with root package name */
        private final e.c.h.f.f f6665d;

        /* renamed from: e, reason: collision with root package name */
        private final e.c.h.f.f f6666e;

        /* renamed from: f, reason: collision with root package name */
        private final e.c.h.f.g f6667f;

        /* renamed from: g, reason: collision with root package name */
        private final e.c.h.f.e<com.facebook.cache.common.b> f6668g;
        private final e.c.h.f.e<com.facebook.cache.common.b> h;

        public a(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v, e.c.h.f.f fVar, e.c.h.f.f fVar2, e.c.h.f.g gVar, e.c.h.f.e<com.facebook.cache.common.b> eVar, e.c.h.f.e<com.facebook.cache.common.b> eVar2) {
            super(interfaceC0732l);
            this.f6664c = v;
            this.f6665d = fVar;
            this.f6666e = fVar2;
            this.f6667f = gVar;
            this.f6668g = eVar;
            this.h = eVar2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            try {
                e.c.h.m.b.b();
                if (!AbstractC0722b.f(i) && fVar != null && !AbstractC0722b.l(i, 10) && fVar.z() != e.c.g.d.b) {
                    ImageRequest d2 = this.f6664c.d();
                    com.facebook.cache.common.b b = ((e.c.h.f.l) this.f6667f).b(d2, this.f6664c.b());
                    this.f6668g.a(b);
                    if (this.f6664c.j("origin").equals("memory_encoded")) {
                        if (!this.h.b(b)) {
                            (d2.d() == ImageRequest.CacheChoice.SMALL ? this.f6666e : this.f6665d).k(b);
                            this.h.a(b);
                        }
                    } else if (this.f6664c.j("origin").equals("disk")) {
                        this.h.a(b);
                    }
                    n().c(fVar, i);
                }
                n().c(fVar, i);
            } finally {
                e.c.h.m.b.b();
            }
        }
    }

    public C0741v(e.c.h.f.f fVar, e.c.h.f.f fVar2, e.c.h.f.g gVar, e.c.h.f.e eVar, e.c.h.f.e eVar2, U<com.facebook.imagepipeline.image.f> u) {
        this.a = fVar;
        this.b = fVar2;
        this.f6660c = gVar;
        this.f6662e = eVar;
        this.f6663f = eVar2;
        this.f6661d = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        try {
            e.c.h.m.b.b();
            X n = v.n();
            n.e(v, "EncodedProbeProducer");
            a aVar = new a(interfaceC0732l, v, this.a, this.b, this.f6660c, this.f6662e, this.f6663f);
            n.j(v, "EncodedProbeProducer", null);
            e.c.h.m.b.b();
            this.f6661d.b(aVar, v);
            e.c.h.m.b.b();
        } finally {
            e.c.h.m.b.b();
        }
    }
}
