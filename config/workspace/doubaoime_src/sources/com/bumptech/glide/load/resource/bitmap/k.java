package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class k extends f {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(com.bumptech.glide.load.d.a);

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.f
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        return A.c(dVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return 1101716364;
    }
}
