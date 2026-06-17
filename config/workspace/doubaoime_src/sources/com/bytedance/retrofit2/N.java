package com.bytedance.retrofit2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N<T> {
    private final com.bytedance.retrofit2.client.c a;
    private final T b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.retrofit2.mime.h f5986c;

    /* renamed from: d, reason: collision with root package name */
    private RetrofitMetrics f5987d;

    private N(com.bytedance.retrofit2.client.c cVar, T t, com.bytedance.retrofit2.mime.h hVar) {
        this.a = cVar;
        this.b = t;
        this.f5986c = hVar;
    }

    public static <T> N<T> c(com.bytedance.retrofit2.mime.h hVar, com.bytedance.retrofit2.client.c cVar) {
        Objects.requireNonNull(hVar, "body == null");
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (cVar.j()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new N<>(cVar, null, hVar);
    }

    public static <T> N<T> j(T t, com.bytedance.retrofit2.client.c cVar) {
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (cVar.j()) {
            return new N<>(cVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.f();
    }

    public RetrofitMetrics d() {
        return this.f5987d;
    }

    public List<com.bytedance.retrofit2.client.b> e() {
        return this.a.d();
    }

    public boolean f() {
        return this.a.j();
    }

    public String g() {
        Objects.requireNonNull(this.a);
        return null;
    }

    public com.bytedance.retrofit2.client.c h() {
        return this.a;
    }

    public void i(RetrofitMetrics retrofitMetrics) {
        this.f5987d = retrofitMetrics;
    }
}
