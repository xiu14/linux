package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class f implements com.bumptech.glide.load.i<Bitmap> {
    @Override // com.bumptech.glide.load.i
    @NonNull
    public final com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.v<Bitmap> vVar, int i, int i2) {
        if (!com.bumptech.glide.util.j.j(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.engine.B.d d2 = com.bumptech.glide.c.b(context).d();
        Bitmap bitmap = vVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c2 = c(d2, bitmap, i, i2);
        return bitmap.equals(c2) ? vVar : e.b(c2, d2);
    }

    protected abstract Bitmap c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2);
}
