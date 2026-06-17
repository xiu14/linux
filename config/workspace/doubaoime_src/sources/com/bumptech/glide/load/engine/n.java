package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class n implements com.bumptech.glide.load.d {
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1665c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1666d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f1667e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f1668f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.d f1669g;
    private final Map<Class<?>, com.bumptech.glide.load.i<?>> h;
    private final com.bumptech.glide.load.f i;
    private int j;

    n(Object obj, com.bumptech.glide.load.d dVar, int i, int i2, Map<Class<?>, com.bumptech.glide.load.i<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.f fVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
        Objects.requireNonNull(dVar, "Signature must not be null");
        this.f1669g = dVar;
        this.f1665c = i;
        this.f1666d = i2;
        Objects.requireNonNull(map, "Argument must not be null");
        this.h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f1667e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f1668f = cls2;
        Objects.requireNonNull(fVar, "Argument must not be null");
        this.i = fVar;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b.equals(nVar.b) && this.f1669g.equals(nVar.f1669g) && this.f1666d == nVar.f1666d && this.f1665c == nVar.f1665c && this.h.equals(nVar.h) && this.f1667e.equals(nVar.f1667e) && this.f1668f.equals(nVar.f1668f) && this.i.equals(nVar.i);
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = this.f1669g.hashCode() + (hashCode * 31);
            this.j = hashCode2;
            int i = (hashCode2 * 31) + this.f1665c;
            this.j = i;
            int i2 = (i * 31) + this.f1666d;
            this.j = i2;
            int hashCode3 = this.h.hashCode() + (i2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.f1667e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f1668f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EngineKey{model=");
        M.append(this.b);
        M.append(", width=");
        M.append(this.f1665c);
        M.append(", height=");
        M.append(this.f1666d);
        M.append(", resourceClass=");
        M.append(this.f1667e);
        M.append(", transcodeClass=");
        M.append(this.f1668f);
        M.append(", signature=");
        M.append(this.f1669g);
        M.append(", hashCode=");
        M.append(this.j);
        M.append(", transformations=");
        M.append(this.h);
        M.append(", options=");
        M.append(this.i);
        M.append('}');
        return M.toString();
    }
}
