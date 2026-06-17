package com.bumptech.glide.request;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class h extends a<h> {

    @Nullable
    private static h A;

    @Nullable
    private static h B;

    @NonNull
    @CheckResult
    public static h c0(boolean z) {
        if (z) {
            if (A == null) {
                A = new h().W(true).b();
            }
            return A;
        }
        if (B == null) {
            B = new h().W(false).b();
        }
        return B;
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }
}
