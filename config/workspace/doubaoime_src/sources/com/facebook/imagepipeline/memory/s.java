package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.imagepipeline.memory.s<T>] */
/* loaded from: classes2.dex */
public abstract class s<T> {
    private final Set<T> a = new HashSet();
    private final h<T> b = new h<>();

    public T a(int i) {
        T a = this.b.a(i);
        if (a != null) {
            synchronized (this) {
                this.a.remove(a);
            }
        }
        return a;
    }

    public abstract int b(T t);

    public T c() {
        T e2 = this.b.e();
        if (e2 != null) {
            synchronized (this) {
                this.a.remove(e2);
            }
        }
        return e2;
    }

    public void d(T t) {
        boolean add;
        synchronized (this) {
            add = this.a.add(t);
        }
        if (add) {
            this.b.d(b(t), t);
        }
    }
}
