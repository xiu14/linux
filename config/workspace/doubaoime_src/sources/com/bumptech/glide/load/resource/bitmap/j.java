package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class j extends f {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.bumptech.glide.load.d.a);

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.f
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        int i3 = A.f1736f;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return A.d(dVar, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return -670243078;
    }
}
