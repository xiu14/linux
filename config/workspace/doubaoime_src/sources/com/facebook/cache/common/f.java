package com.facebook.cache.common;

/* loaded from: classes2.dex */
public class f implements CacheErrorLogger {
    private static f a;

    private f() {
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (a == null) {
                a = new f();
            }
            fVar = a;
        }
        return fVar;
    }
}
