package com.bytedance.bdinstall.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class h<T> {
    private volatile ConcurrentHashMap<String, T> a;

    protected abstract T a(String str, Object... objArr);

    public final T b(String str, Object... objArr) {
        T t = null;
        T t2 = this.a == null ? null : this.a.get(str);
        if (t2 == null) {
            synchronized (this) {
                if (this.a != null) {
                    t = this.a.get(str);
                }
                if (t == null) {
                    T a = a(str, objArr);
                    if (a != null) {
                        if (this.a == null) {
                            this.a = new ConcurrentHashMap<>(4);
                        }
                        this.a.put(str, a);
                    }
                    t2 = a;
                } else {
                    t2 = t;
                }
            }
        }
        return t2;
    }
}
