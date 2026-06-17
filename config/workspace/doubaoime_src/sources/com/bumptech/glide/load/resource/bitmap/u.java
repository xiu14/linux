package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements com.bumptech.glide.load.engine.v<BitmapDrawable>, com.bumptech.glide.load.engine.r {
    private final Resources a;
    private final com.bumptech.glide.load.engine.v<Bitmap> b;

    private u(@NonNull Resources resources, @NonNull com.bumptech.glide.load.engine.v<Bitmap> vVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.a = resources;
        this.b = vVar;
    }

    @Nullable
    public static com.bumptech.glide.load.engine.v<BitmapDrawable> b(@NonNull Resources resources, @Nullable com.bumptech.glide.load.engine.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new u(resources, vVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        com.bumptech.glide.load.engine.v<Bitmap> vVar = this.b;
        if (vVar instanceof com.bumptech.glide.load.engine.r) {
            ((com.bumptech.glide.load.engine.r) vVar).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        this.b.recycle();
    }
}
