package com.facebook.common.util;

/* loaded from: classes2.dex */
public class b<T> {
    private volatile boolean a = false;
    private volatile T b;

    public T a() {
        T t;
        if (this.b != null) {
            return this.b;
        }
        if (this.a) {
            return this.b;
        }
        synchronized (this) {
            if (this.a) {
                t = this.b;
            } else {
                this.b = b();
                this.a = true;
                t = this.b;
            }
        }
        return t;
    }

    protected T b() {
        throw null;
    }

    public void c(T t) {
        this.b = t;
    }
}
