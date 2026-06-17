package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
class p<Z> implements v<Z> {
    private final boolean a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final v<Z> f1670c;

    /* renamed from: d, reason: collision with root package name */
    private final a f1671d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.d f1672e;

    /* renamed from: f, reason: collision with root package name */
    private int f1673f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1674g;

    interface a {
        void a(com.bumptech.glide.load.d dVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z, boolean z2, com.bumptech.glide.load.d dVar, a aVar) {
        Objects.requireNonNull(vVar, "Argument must not be null");
        this.f1670c = vVar;
        this.a = z;
        this.b = z2;
        this.f1672e = dVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f1671d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return this.f1670c.a();
    }

    synchronized void b() {
        if (this.f1674g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f1673f++;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Z> c() {
        return this.f1670c.c();
    }

    v<Z> d() {
        return this.f1670c;
    }

    boolean e() {
        return this.a;
    }

    void f() {
        boolean z;
        synchronized (this) {
            int i = this.f1673f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f1673f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f1671d.a(this.f1672e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Z get() {
        return this.f1670c.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void recycle() {
        if (this.f1673f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f1674g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f1674g = true;
        if (this.b) {
            this.f1670c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f1671d + ", key=" + this.f1672e + ", acquired=" + this.f1673f + ", isRecycled=" + this.f1674g + ", resource=" + this.f1670c + '}';
    }
}
