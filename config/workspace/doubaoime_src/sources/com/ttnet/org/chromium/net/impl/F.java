package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.z;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class F extends z.a {
    private final AbstractC0763c a;
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private final z.b f8699c;

    /* renamed from: d, reason: collision with root package name */
    private int f8700d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f8701e;

    /* renamed from: f, reason: collision with root package name */
    private int f8702f;

    /* renamed from: g, reason: collision with root package name */
    private int f8703g;
    private int h;

    F(z.b bVar, Executor executor, AbstractC0763c abstractC0763c) {
        this.a = abstractC0763c;
        this.f8699c = bVar;
        this.b = executor;
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public com.ttnet.org.chromium.net.z a() {
        return this.a.U(this.f8699c, this.b, this.f8700d, this.f8701e, this.f8702f, this.f8703g, this.h);
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public z.a b(int i) {
        this.f8703g = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public z.a c(int i) {
        this.f8702f = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public z.a d(int i) {
        this.f8700d = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public z.a e(List<String> list) {
        this.f8701e = list;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.z.a
    public z.a f(int i) {
        this.h = i;
        return this;
    }
}
