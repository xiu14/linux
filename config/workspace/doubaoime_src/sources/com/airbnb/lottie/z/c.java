package com.airbnb.lottie.z;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class c<T> {
    private final b<T> a = new b<>();

    @Nullable
    protected T b;

    public c(@Nullable T t) {
        this.b = null;
        this.b = t;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T a(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        this.a.a(f2, f3, t, t2, f4, f5, f6);
        return this.b;
    }
}
