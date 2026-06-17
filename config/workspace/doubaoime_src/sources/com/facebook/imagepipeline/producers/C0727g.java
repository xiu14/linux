package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.Objects;

/* renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0727g extends J<Pair<com.facebook.cache.common.b, String>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

    /* renamed from: f, reason: collision with root package name */
    private final e.c.h.f.g f6599f;

    public C0727g(e.c.h.f.g gVar, U u) {
        super(u, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f6599f = gVar;
    }

    @Override // com.facebook.imagepipeline.producers.J
    public e.c.c.g.a<com.facebook.imagepipeline.image.d> g(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        return e.c.c.g.a.h(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.J
    public e.c.c.g.a<com.facebook.imagepipeline.image.d> h(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        if (aVar2 == null || aVar2.r() == null) {
            return null;
        }
        Objects.requireNonNull(aVar2.r());
        return e.c.c.g.a.z(null);
    }

    @Override // com.facebook.imagepipeline.producers.J
    public e.c.g.d i(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
        e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = aVar;
        if (aVar2 == null || aVar2.r() == null) {
            return null;
        }
        return aVar2.r().h();
    }

    @Override // com.facebook.imagepipeline.producers.J
    protected Pair<com.facebook.cache.common.b, String> j(V v) {
        return Pair.create(((e.c.h.f.l) this.f6599f).a(v.d(), v.b()), !v.d().z() ? v.getId() : String.valueOf(v.p().getValue()));
    }
}
