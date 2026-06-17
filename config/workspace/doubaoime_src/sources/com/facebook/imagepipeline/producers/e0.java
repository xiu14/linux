package com.facebook.imagepipeline.producers;

/* loaded from: classes2.dex */
public class e0<T> implements U<Void> {
    private final U<T> a;

    class a extends AbstractC0735o<T, Void> {
        a(e0 e0Var, InterfaceC0732l interfaceC0732l) {
            super(interfaceC0732l);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(T t, int i) {
            if (AbstractC0722b.e(i)) {
                n().c(null, i);
            }
        }
    }

    public e0(U<T> u) {
        this.a = u;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<Void> interfaceC0732l, V v) {
        this.a.b(new a(this, interfaceC0732l), v);
    }
}
