package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0721a implements U<com.facebook.imagepipeline.image.f> {
    private final U<com.facebook.imagepipeline.image.f> a;

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    private static class b extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {
        b(InterfaceC0732l interfaceC0732l, C0329a c0329a) {
            super(interfaceC0732l);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            if (fVar == null) {
                n().c(null, i);
                return;
            }
            if (!com.facebook.imagepipeline.image.f.Y(fVar)) {
                fVar.e0();
            }
            n().c(fVar, i);
        }
    }

    public C0721a(U<com.facebook.imagepipeline.image.f> u) {
        this.a = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        this.a.b(new b(interfaceC0732l, null), v);
    }
}
