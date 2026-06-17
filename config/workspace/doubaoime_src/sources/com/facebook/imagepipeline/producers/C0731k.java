package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0731k implements U<com.facebook.imagepipeline.image.f> {
    private final U<com.facebook.imagepipeline.image.f> a;
    private final U<com.facebook.imagepipeline.image.f> b;

    /* renamed from: com.facebook.imagepipeline.producers.k$b */
    private class b extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private V f6625c;

        b(InterfaceC0732l interfaceC0732l, V v, a aVar) {
            super(interfaceC0732l);
            this.f6625c = v;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void h(Throwable th) {
            C0731k.this.b.b(n(), this.f6625c);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            ImageRequest d2 = this.f6625c.d();
            boolean e2 = AbstractC0722b.e(i);
            boolean Y = com.bytedance.feedbackerlib.a.Y(fVar, d2.s());
            if (fVar != null && (Y || d2.i())) {
                if (e2 && Y) {
                    n().c(fVar, i);
                } else {
                    n().c(fVar, i & (-2));
                }
            }
            if (!e2 || Y) {
                return;
            }
            com.facebook.imagepipeline.image.f.d(fVar);
            C0731k.this.b.b(n(), this.f6625c);
        }
    }

    public C0731k(U<com.facebook.imagepipeline.image.f> u, U<com.facebook.imagepipeline.image.f> u2) {
        this.a = u;
        this.b = u2;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        this.a.b(new b(interfaceC0732l, v, null), v);
    }
}
