package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.util.k.a;
import java.util.Objects;

/* loaded from: classes.dex */
final class u<Z> implements v<Z>, a.d {

    /* renamed from: e, reason: collision with root package name */
    private static final Pools.Pool<u<?>> f1680e = com.bumptech.glide.util.k.a.a(20, new a());
    private final com.bumptech.glide.util.k.d a = com.bumptech.glide.util.k.d.a();
    private v<Z> b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1681c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1682d;

    class a implements a.b<u<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.k.a.b
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    @NonNull
    static <Z> u<Z> d(v<Z> vVar) {
        u<Z> uVar = (u) f1680e.acquire();
        Objects.requireNonNull(uVar, "Argument must not be null");
        ((u) uVar).f1682d = false;
        ((u) uVar).f1681c = true;
        ((u) uVar).b = vVar;
        return uVar;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.util.k.a.d
    @NonNull
    public com.bumptech.glide.util.k.d b() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Z> c() {
        return this.b.c();
    }

    synchronized void e() {
        this.a.c();
        if (!this.f1681c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f1681c = false;
        if (this.f1682d) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Z get() {
        return this.b.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void recycle() {
        this.a.c();
        this.f1682d = true;
        if (!this.f1681c) {
            this.b.recycle();
            this.b = null;
            f1680e.release(this);
        }
    }
}
