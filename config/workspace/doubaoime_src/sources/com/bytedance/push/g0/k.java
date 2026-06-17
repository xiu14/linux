package com.bytedance.push.g0;

/* loaded from: classes2.dex */
public abstract class k<T> {
    private volatile T a;

    protected abstract T e(Object... objArr);

    public final T f(Object... objArr) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = e(objArr);
                }
            }
        }
        return this.a;
    }
}
