package com.bumptech.glide.load.k.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.bitmap.u;

/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {
    private final Resources a;

    public b(@NonNull Resources resources) {
        this.a = resources;
    }

    @Override // com.bumptech.glide.load.k.g.e
    @Nullable
    public v<BitmapDrawable> a(@NonNull v<Bitmap> vVar, @NonNull com.bumptech.glide.load.f fVar) {
        return u.b(this.a, vVar);
    }
}
