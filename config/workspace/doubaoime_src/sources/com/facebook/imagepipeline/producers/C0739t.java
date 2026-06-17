package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0739t extends J<Pair<com.facebook.cache.common.b, String>, com.facebook.imagepipeline.image.f> {

    /* renamed from: f, reason: collision with root package name */
    private final e.c.h.f.g f6654f;

    public C0739t(e.c.h.f.g gVar, boolean z, U u) {
        super(u, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f6654f = gVar;
    }

    @Override // com.facebook.imagepipeline.producers.J
    public com.facebook.imagepipeline.image.f g(com.facebook.imagepipeline.image.f fVar) {
        return com.facebook.imagepipeline.image.f.a(fVar);
    }

    @Override // com.facebook.imagepipeline.producers.J
    public e.c.g.d i(com.facebook.imagepipeline.image.f fVar) {
        com.facebook.imagepipeline.image.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.z();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.J
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pair<com.facebook.cache.common.b, String> j(V v) {
        return Pair.create(((e.c.h.f.l) this.f6654f).b(v.d(), v.b()), !v.d().z() ? v.getId() : String.valueOf(v.p().getValue()));
    }
}
