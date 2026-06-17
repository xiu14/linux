package com.facebook.cache.common;

import java.util.Objects;

/* loaded from: classes2.dex */
public class h implements b {
    final String a;
    final boolean b;

    public h(String str) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = false;
    }

    @Override // com.facebook.cache.common.b
    public boolean a() {
        return this.b;
    }

    @Override // com.facebook.cache.common.b
    public String b() {
        return this.a;
    }

    @Override // com.facebook.cache.common.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.a.equals(((h) obj).a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.b
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.facebook.cache.common.b
    public String toString() {
        return this.a;
    }
}
