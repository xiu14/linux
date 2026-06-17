package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class i0<T> implements U<T> {
    private final U<T> a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<InterfaceC0732l<T>, V>> f6608c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f6609d;

    private class b extends AbstractC0735o<T, T> {

        class a implements Runnable {
            final /* synthetic */ Pair a;

            a(Pair pair) {
                this.a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                i0 i0Var = i0.this;
                Pair pair = this.a;
                i0Var.f((InterfaceC0732l) pair.first, (V) pair.second);
            }
        }

        b(InterfaceC0732l interfaceC0732l, a aVar) {
            super(interfaceC0732l);
        }

        private void o() {
            Pair pair;
            synchronized (i0.this) {
                pair = (Pair) i0.this.f6608c.poll();
                if (pair == null) {
                    i0.d(i0.this);
                }
            }
            if (pair != null) {
                i0.this.f6609d.execute(new a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void g() {
            n().d();
            o();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void h(Throwable th) {
            n().a(th);
            o();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(T t, int i) {
            n().c(t, i);
            if (AbstractC0722b.e(i)) {
                o();
            }
        }
    }

    public i0(int i, Executor executor, U<T> u) {
        Objects.requireNonNull(executor);
        this.f6609d = executor;
        Objects.requireNonNull(u);
        this.a = u;
        this.f6608c = new ConcurrentLinkedQueue<>();
        this.b = 0;
    }

    static /* synthetic */ int d(i0 i0Var) {
        int i = i0Var.b;
        i0Var.b = i - 1;
        return i;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<T> interfaceC0732l, V v) {
        boolean z;
        v.n().e(v, "ThrottlingProducer");
        synchronized (this) {
            int i = this.b;
            z = true;
            if (i >= 5) {
                this.f6608c.add(Pair.create(interfaceC0732l, v));
            } else {
                this.b = i + 1;
                z = false;
            }
        }
        if (z) {
            return;
        }
        v.n().j(v, "ThrottlingProducer", null);
        this.a.b(new b(interfaceC0732l, null), v);
    }

    void f(InterfaceC0732l<T> interfaceC0732l, V v) {
        v.n().j(v, "ThrottlingProducer", null);
        this.a.b(new b(interfaceC0732l, null), v);
    }
}
