package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Objects;

/* renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0728h implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> a;
    private final e.c.h.f.g b;

    /* renamed from: c, reason: collision with root package name */
    private final U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f6600c;

    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    class a extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.b f6601c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0732l interfaceC0732l, com.facebook.cache.common.b bVar, boolean z) {
            super(interfaceC0732l);
            this.f6601c = bVar;
            this.f6602d = z;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar;
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = (e.c.c.g.a) obj;
            try {
                e.c.h.m.b.b();
                boolean e2 = AbstractC0722b.e(i);
                if (aVar2 != null) {
                    if (!aVar2.r().p() && !AbstractC0722b.m(i, 8)) {
                        if (!e2 && (aVar = C0728h.this.a.get(this.f6601c)) != null) {
                            try {
                                com.facebook.imagepipeline.image.k l = aVar2.r().l();
                                com.facebook.imagepipeline.image.i iVar = (com.facebook.imagepipeline.image.i) aVar.r().l();
                                if (iVar.b() || iVar.a() >= ((com.facebook.imagepipeline.image.i) l).a()) {
                                    n().c(aVar, i);
                                    e.c.c.g.a.o(aVar);
                                }
                            } finally {
                                e.c.c.g.a.o(aVar);
                            }
                        }
                        e.c.c.g.a<com.facebook.imagepipeline.image.d> b = this.f6602d ? C0728h.this.a.b(this.f6601c, aVar2) : null;
                        if (e2) {
                            try {
                                n().b(1.0f);
                            } catch (Throwable th) {
                                e.c.c.g.a.o(b);
                                throw th;
                            }
                        }
                        InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> n = n();
                        if (b != null) {
                            aVar2 = b;
                        }
                        n.c(aVar2, i);
                        e.c.c.g.a.o(b);
                    }
                    n().c(aVar2, i);
                } else if (e2) {
                    n().c(null, i);
                }
            } finally {
                e.c.h.m.b.b();
            }
        }
    }

    public C0728h(e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, e.c.h.f.g gVar, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u) {
        this.a = sVar;
        this.b = gVar;
        this.f6600c = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        int i;
        try {
            e.c.h.m.b.b();
            X n = v.n();
            n.e(v, e());
            com.facebook.cache.common.b a2 = ((e.c.h.f.l) this.b).a(v.d(), v.b());
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = this.a.get(a2);
            if (aVar != null) {
                v.h(aVar.r().getExtras());
                if (((com.facebook.imagepipeline.image.i) aVar.r().l()).b()) {
                    Objects.requireNonNull(aVar.r());
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    n.j(v, e(), n.g(v, e()) ? e.c.c.d.f.of("cached_value_found", "true") : null);
                    n.c(v, e(), true);
                    v.g("memory_bitmap", d());
                    interfaceC0732l.b(1.0f);
                }
                interfaceC0732l.c(aVar, i);
                aVar.close();
                if (i != 0) {
                    return;
                }
            }
            if (v.p().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                n.j(v, e(), n.g(v, e()) ? e.c.c.d.f.of("cached_value_found", "false") : null);
                n.c(v, e(), false);
                v.g("memory_bitmap", d());
                interfaceC0732l.c(null, 1);
                return;
            }
            InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f2 = f(interfaceC0732l, a2, v.d().y());
            n.j(v, e(), n.g(v, e()) ? e.c.c.d.f.of("cached_value_found", "false") : null);
            e.c.h.m.b.b();
            this.f6600c.b(f2, v);
            e.c.h.m.b.b();
        } finally {
            e.c.h.m.b.b();
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, com.facebook.cache.common.b bVar, boolean z) {
        return new a(interfaceC0732l, bVar, z);
    }
}
