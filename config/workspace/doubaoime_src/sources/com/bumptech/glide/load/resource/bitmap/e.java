package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements com.bumptech.glide.load.engine.v<Bitmap>, com.bumptech.glide.load.engine.r {
    private final Bitmap a;
    private final com.bumptech.glide.load.engine.B.d b;

    public e(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.B.d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.b = dVar;
    }

    @Nullable
    public static e b(@Nullable Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.B.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return com.bumptech.glide.util.j.c(this.a);
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Bitmap get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        this.a.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        this.b.c(this.a);
    }
}
