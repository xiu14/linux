package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class e implements com.bumptech.glide.load.d {
    private final com.bumptech.glide.load.d b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.d f1637c;

    e(com.bumptech.glide.load.d dVar, com.bumptech.glide.load.d dVar2) {
        this.b = dVar;
        this.f1637c = dVar2;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.f1637c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b.equals(eVar.b) && this.f1637c.equals(eVar.f1637c);
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return this.f1637c.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DataCacheKey{sourceKey=");
        M.append(this.b);
        M.append(", signature=");
        M.append(this.f1637c);
        M.append('}');
        return M.toString();
    }
}
