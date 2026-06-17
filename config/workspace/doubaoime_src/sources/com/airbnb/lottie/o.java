package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o<V> {

    @Nullable
    private final V a;

    @Nullable
    private final Throwable b;

    public o(V v) {
        this.a = v;
        this.b = null;
    }

    @Nullable
    public Throwable a() {
        return this.b;
    }

    @Nullable
    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        V v = this.a;
        if (v != null && v.equals(oVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || oVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public o(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
