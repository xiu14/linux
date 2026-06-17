package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Objects;

/* renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0730j implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> a;
    private final e.c.h.f.f b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.f.f f6611c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.h.f.g f6612d;

    /* renamed from: e, reason: collision with root package name */
    private final U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f6613e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.h.f.e<com.facebook.cache.common.b> f6614f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.h.f.e<com.facebook.cache.common.b> f6615g;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        private final V f6616c;

        /* renamed from: d, reason: collision with root package name */
        private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> f6617d;

        /* renamed from: e, reason: collision with root package name */
        private final e.c.h.f.f f6618e;

        /* renamed from: f, reason: collision with root package name */
        private final e.c.h.f.f f6619f;

        /* renamed from: g, reason: collision with root package name */
        private final e.c.h.f.g f6620g;
        private final e.c.h.f.e<com.facebook.cache.common.b> h;
        private final e.c.h.f.e<com.facebook.cache.common.b> i;

        public a(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v, e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar, e.c.h.f.f fVar, e.c.h.f.f fVar2, e.c.h.f.g gVar, e.c.h.f.e<com.facebook.cache.common.b> eVar, e.c.h.f.e<com.facebook.cache.common.b> eVar2) {
            super(interfaceC0732l);
            this.f6616c = v;
            this.f6617d = sVar;
            this.f6618e = fVar;
            this.f6619f = fVar2;
            this.f6620g = gVar;
            this.h = eVar;
            this.i = eVar2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = (e.c.c.g.a) obj;
            try {
                e.c.h.m.b.b();
                if (!AbstractC0722b.f(i) && aVar != null && !AbstractC0722b.l(i, 8)) {
                    ImageRequest d2 = this.f6616c.d();
                    ((e.c.h.f.l) this.f6620g).b(d2, this.f6616c.b());
                    if (this.f6616c.j("origin").equals("memory_bitmap")) {
                        Objects.requireNonNull(this.f6616c.f().j());
                        Objects.requireNonNull(this.f6616c.f().j());
                    }
                    n().c(aVar, i);
                }
                n().c(aVar, i);
            } finally {
                e.c.h.m.b.b();
            }
        }
    }

    public C0730j(e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar, e.c.h.f.f fVar, e.c.h.f.f fVar2, e.c.h.f.g gVar, e.c.h.f.e<com.facebook.cache.common.b> eVar, e.c.h.f.e<com.facebook.cache.common.b> eVar2, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u) {
        this.a = sVar;
        this.b = fVar;
        this.f6611c = fVar2;
        this.f6612d = gVar;
        this.f6614f = eVar;
        this.f6615g = eVar2;
        this.f6613e = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        try {
            e.c.h.m.b.b();
            X n = v.n();
            n.e(v, "BitmapProbeProducer");
            a aVar = new a(interfaceC0732l, v, this.a, this.b, this.f6611c, this.f6612d, this.f6614f, this.f6615g);
            n.j(v, "BitmapProbeProducer", null);
            e.c.h.m.b.b();
            this.f6613e.b(aVar, v);
            e.c.h.m.b.b();
        } finally {
            e.c.h.m.b.b();
        }
    }
}
