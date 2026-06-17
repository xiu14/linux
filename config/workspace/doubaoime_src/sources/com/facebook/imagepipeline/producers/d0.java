package com.facebook.imagepipeline.producers;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d0<T> extends e.c.c.b.g<T> {
    private final InterfaceC0732l<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final X f6594c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6595d;

    /* renamed from: e, reason: collision with root package name */
    private final V f6596e;

    public d0(InterfaceC0732l<T> interfaceC0732l, X x, V v, String str) {
        this.b = interfaceC0732l;
        this.f6594c = x;
        this.f6595d = str;
        this.f6596e = v;
        x.e(v, str);
    }

    @Override // e.c.c.b.g
    protected void d() {
        X x = this.f6594c;
        V v = this.f6596e;
        String str = this.f6595d;
        x.g(v, str);
        x.d(v, str, null);
        this.b.d();
    }

    @Override // e.c.c.b.g
    protected void e(Exception exc) {
        X x = this.f6594c;
        V v = this.f6596e;
        String str = this.f6595d;
        x.k(v, str, exc, x.g(v, str) ? g(exc) : null);
        this.b.a(exc);
    }

    @Override // e.c.c.b.g
    protected void f(T t) {
        X x = this.f6594c;
        V v = this.f6596e;
        String str = this.f6595d;
        x.j(v, str, x.g(v, str) ? h(t) : null);
        this.b.c(t, 1);
    }

    protected Map<String, String> g(Exception exc) {
        return null;
    }

    protected Map<String, String> h(T t) {
        return null;
    }
}
