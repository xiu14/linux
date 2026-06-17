package com.bytedance.applog.w;

/* loaded from: classes.dex */
public abstract class a<T> {
    private volatile T a;

    public final T a(Object... objArr) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = (T) new d();
                }
            }
        }
        return this.a;
    }
}
