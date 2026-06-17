package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0726f extends C0728h {
    public C0726f(e.c.h.f.s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, e.c.h.f.g gVar, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u) {
        super(sVar, gVar, u);
    }

    @Override // com.facebook.imagepipeline.producers.C0728h
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C0728h
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C0728h
    protected InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> f(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, com.facebook.cache.common.b bVar, boolean z) {
        return interfaceC0732l;
    }
}
