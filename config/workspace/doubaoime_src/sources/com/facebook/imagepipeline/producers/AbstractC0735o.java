package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0735o<I, O> extends AbstractC0722b<I> {
    private final InterfaceC0732l<O> b;

    public AbstractC0735o(InterfaceC0732l<O> interfaceC0732l) {
        this.b = interfaceC0732l;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void g() {
        this.b.d();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void h(Throwable th) {
        this.b.a(th);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void j(float f2) {
        this.b.b(f2);
    }

    public InterfaceC0732l<O> n() {
        return this.b;
    }
}
