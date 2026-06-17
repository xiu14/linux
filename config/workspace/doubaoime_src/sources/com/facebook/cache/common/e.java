package com.facebook.cache.common;

import java.util.Objects;

/* loaded from: classes2.dex */
public class e implements b {
    @Override // com.facebook.cache.common.b
    public boolean a() {
        return false;
    }

    @Override // com.facebook.cache.common.b
    public String b() {
        throw null;
    }

    @Override // com.facebook.cache.common.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Objects.requireNonNull((e) obj);
        throw null;
    }

    @Override // com.facebook.cache.common.b
    public int hashCode() {
        throw null;
    }

    @Override // com.facebook.cache.common.b
    public String toString() {
        new StringBuilder().append("MultiCacheKey:");
        throw null;
    }
}
