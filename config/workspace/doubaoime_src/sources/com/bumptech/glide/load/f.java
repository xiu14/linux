package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements d {
    private final ArrayMap<e<?>, Object> b = new CachedHashCodeArrayMap();

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.keyAt(i).e(this.b.valueAt(i), messageDigest);
        }
    }

    @Nullable
    public <T> T c(@NonNull e<T> eVar) {
        return this.b.containsKey(eVar) ? (T) this.b.get(eVar) : eVar.b();
    }

    public void d(@NonNull f fVar) {
        this.b.putAll((SimpleArrayMap<? extends e<?>, ? extends Object>) fVar.b);
    }

    @NonNull
    public <T> f e(@NonNull e<T> eVar, @NonNull T t) {
        this.b.put(eVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Options{values=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
