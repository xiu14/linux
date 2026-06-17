package com.bumptech.glide.load.k;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c<T> implements i<T> {
    private static final i<?> b = new c();

    private c() {
    }

    @NonNull
    public static <T> c<T> c() {
        return (c) b;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.i
    @NonNull
    public v<T> b(@NonNull Context context, @NonNull v<T> vVar, int i, int i2) {
        return vVar;
    }
}
