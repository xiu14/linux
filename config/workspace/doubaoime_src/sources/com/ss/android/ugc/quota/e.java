package com.ss.android.ugc.quota;

/* loaded from: classes2.dex */
public class e<T> {
    private volatile boolean a = false;
    private T b;

    public T a() {
        T t;
        T t2 = this.b;
        if (t2 != null) {
            return t2;
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
}
