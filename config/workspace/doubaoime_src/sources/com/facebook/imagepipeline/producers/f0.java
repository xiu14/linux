package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f0<T> implements U<T> {
    private final U<T> a;
    private final g0 b;

    class a extends c0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X f6597f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V f6598g;
        final /* synthetic */ InterfaceC0732l h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0732l interfaceC0732l, X x, V v, String str, X x2, V v2, InterfaceC0732l interfaceC0732l2) {
            super(interfaceC0732l, x, v, str);
            this.f6597f = x2;
            this.f6598g = v2;
            this.h = interfaceC0732l2;
        }

        @Override // e.c.c.b.g
        protected void b(T t) {
        }

        @Override // e.c.c.b.g
        protected T c() throws Exception {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.d0, e.c.c.b.g
        protected void f(T t) {
            this.f6597f.j(this.f6598g, "BackgroundThreadHandoffProducer", null);
            f0.this.a.b(this.h, this.f6598g);
        }

        @Override // com.facebook.imagepipeline.producers.d0
        protected Map<String, String> g(Exception exc) {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.d0
        protected Map<String, String> h(T t) {
            return null;
        }
    }

    class b extends C0725e {
        final /* synthetic */ d0 a;

        b(d0 d0Var) {
            this.a = d0Var;
        }

        @Override // com.facebook.imagepipeline.producers.W
        public void a() {
            this.a.a();
            f0.this.b.a(this.a);
        }
    }

    public f0(U<T> u, g0 g0Var) {
        Objects.requireNonNull(u);
        this.a = u;
        this.b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<T> interfaceC0732l, V v) {
        X n = v.n();
        a aVar = new a(interfaceC0732l, n, v, "BackgroundThreadHandoffProducer", n, v, interfaceC0732l);
        v.e(new b(aVar));
        this.b.b(aVar);
    }
}
