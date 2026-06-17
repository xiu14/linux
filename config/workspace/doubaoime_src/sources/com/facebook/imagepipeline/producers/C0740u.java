package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0740u implements U<com.facebook.imagepipeline.image.f> {
    private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> a;
    private final e.c.h.f.g b;

    /* renamed from: c, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6655c;

    /* renamed from: com.facebook.imagepipeline.producers.u$a */
    private static class a extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> f6656c;

        /* renamed from: d, reason: collision with root package name */
        private final com.facebook.cache.common.b f6657d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6658e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6659f;

        public a(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar, com.facebook.cache.common.b bVar, boolean z, boolean z2) {
            super(interfaceC0732l);
            this.f6656c = sVar;
            this.f6657d = bVar;
            this.f6658e = z;
            this.f6659f = z2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            try {
                e.c.h.m.b.b();
                if (!AbstractC0722b.f(i) && fVar != null && !AbstractC0722b.l(i, 10) && fVar.z() != e.c.g.d.b) {
                    e.c.c.g.a<com.facebook.common.memory.g> l = fVar.l();
                    if (l != null) {
                        e.c.c.g.a<com.facebook.common.memory.g> aVar = null;
                        try {
                            if (this.f6659f && this.f6658e) {
                                aVar = this.f6656c.b(this.f6657d, l);
                            }
                            if (aVar != null) {
                                try {
                                    com.facebook.imagepipeline.image.f fVar2 = new com.facebook.imagepipeline.image.f(aVar);
                                    fVar2.h(fVar);
                                    try {
                                        n().b(1.0f);
                                        n().c(fVar2, i);
                                        com.facebook.imagepipeline.image.f.d(fVar2);
                                    } catch (Throwable th) {
                                        com.facebook.imagepipeline.image.f.d(fVar2);
                                        throw th;
                                    }
                                } finally {
                                    e.c.c.g.a.o(aVar);
                                }
                            }
                        } finally {
                            e.c.c.g.a.o(l);
                        }
                    }
                    n().c(fVar, i);
                }
                n().c(fVar, i);
            } finally {
                e.c.h.m.b.b();
            }
        }
    }

    public C0740u(e.c.h.f.s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar, e.c.h.f.g gVar, U<com.facebook.imagepipeline.image.f> u) {
        this.a = sVar;
        this.b = gVar;
        this.f6655c = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        try {
            e.c.h.m.b.b();
            X n = v.n();
            n.e(v, "EncodedMemoryCacheProducer");
            com.facebook.cache.common.b b = ((e.c.h.f.l) this.b).b(v.d(), v.b());
            e.c.c.g.a<com.facebook.common.memory.g> aVar = this.a.get(b);
            try {
                if (aVar != null) {
                    com.facebook.imagepipeline.image.f fVar = new com.facebook.imagepipeline.image.f(aVar);
                    try {
                        n.j(v, "EncodedMemoryCacheProducer", n.g(v, "EncodedMemoryCacheProducer") ? e.c.c.d.f.of("cached_value_found", "true") : null);
                        n.c(v, "EncodedMemoryCacheProducer", true);
                        v.l("memory_encoded");
                        interfaceC0732l.b(1.0f);
                        interfaceC0732l.c(fVar, 1);
                        return;
                    } finally {
                        com.facebook.imagepipeline.image.f.d(fVar);
                    }
                }
                if (v.p().getValue() < ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                    a aVar2 = new a(interfaceC0732l, this.a, b, v.d().y(), v.f().j().e());
                    n.j(v, "EncodedMemoryCacheProducer", n.g(v, "EncodedMemoryCacheProducer") ? e.c.c.d.f.of("cached_value_found", "false") : null);
                    this.f6655c.b(aVar2, v);
                } else {
                    n.j(v, "EncodedMemoryCacheProducer", n.g(v, "EncodedMemoryCacheProducer") ? e.c.c.d.f.of("cached_value_found", "false") : null);
                    n.c(v, "EncodedMemoryCacheProducer", false);
                    v.g("memory_encoded", "nil-result");
                    interfaceC0732l.c(null, 1);
                }
            } finally {
                e.c.c.g.a.o(aVar);
            }
        } finally {
            e.c.h.m.b.b();
        }
    }
}
