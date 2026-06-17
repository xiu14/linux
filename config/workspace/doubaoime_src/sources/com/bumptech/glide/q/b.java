package com.bumptech.glide.q;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements d {
    private final Object b;

    public b(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(d.a));
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ObjectKey{object=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
