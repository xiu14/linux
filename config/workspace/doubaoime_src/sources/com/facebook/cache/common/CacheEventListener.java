package com.facebook.cache.common;

/* loaded from: classes2.dex */
public interface CacheEventListener {

    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    void a(a aVar);

    void b(a aVar);

    void c();

    void d(a aVar);

    void e(a aVar);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar);
}
