package com.bytedance.bdinstall.util;

/* loaded from: classes.dex */
public abstract class f<T> {
    private volatile T a;

    protected abstract T a(Object... objArr);

    public final T b(Object... objArr) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = a(objArr);
                }
            }
        }
        return this.a;
    }
}
