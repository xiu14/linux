package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0722b<T> implements InterfaceC0732l<T> {
    private boolean a = false;

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    public static boolean f(int i) {
        return !e(i);
    }

    public static boolean l(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean m(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0732l
    public synchronized void a(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            h(th);
        } catch (Exception e2) {
            k(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0732l
    public synchronized void b(float f2) {
        if (this.a) {
            return;
        }
        try {
            j(f2);
        } catch (Exception e2) {
            k(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0732l
    public synchronized void c(T t, int i) {
        if (this.a) {
            return;
        }
        this.a = e(i);
        try {
            i(t, i);
        } catch (Exception e2) {
            k(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0732l
    public synchronized void d() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            g();
        } catch (Exception e2) {
            k(e2);
        }
    }

    protected abstract void g();

    protected abstract void h(Throwable th);

    protected abstract void i(T t, int i);

    protected abstract void j(float f2);

    protected void k(Exception exc) {
        Class<?> cls = getClass();
        int i = e.c.c.e.a.a;
        e.c.c.e.b bVar = e.c.c.e.b.b;
        if (bVar.e(6)) {
            bVar.m(cls.getSimpleName(), "unhandled exception", exc);
        }
    }
}
