package com.bytedance.bdinstall.util;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class p<T> {
    private volatile T a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    protected abstract T a(Object... objArr);

    public final T b(Object... objArr) {
        if (!this.b.get() && this.a == null) {
            synchronized (this) {
                if (!this.b.get() && this.a == null) {
                    this.a = a(objArr);
                    this.b.set(true);
                }
            }
        }
        return this.a;
    }
}
