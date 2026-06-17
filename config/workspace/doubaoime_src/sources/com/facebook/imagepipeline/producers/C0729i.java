package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.util.Objects;

/* renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0729i implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6604c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6605d;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    private static class a extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        private final int f6606c;

        /* renamed from: d, reason: collision with root package name */
        private final int f6607d;

        a(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, int i, int i2) {
            super(interfaceC0732l);
            this.f6606c = i;
            this.f6607d = i2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            com.facebook.imagepipeline.image.d r;
            Bitmap s;
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = (e.c.c.g.a) obj;
            if (aVar != null && aVar.w() && (r = aVar.r()) != null && !r.isClosed() && (r instanceof com.facebook.imagepipeline.image.e) && (s = ((com.facebook.imagepipeline.image.e) r).s()) != null) {
                int height = s.getHeight() * s.getRowBytes();
                if (height >= this.f6606c && height <= this.f6607d) {
                    s.prepareToDraw();
                }
            }
            n().c(aVar, i);
        }
    }

    public C0729i(U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u, int i, int i2, boolean z) {
        e.c.c.d.h.a(i <= i2);
        Objects.requireNonNull(u);
        this.a = u;
        this.b = i;
        this.f6604c = i2;
        this.f6605d = z;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        if (!v.i() || this.f6605d) {
            this.a.b(new a(interfaceC0732l, this.b, this.f6604c), v);
        } else {
            this.a.b(interfaceC0732l, v);
        }
    }
}
