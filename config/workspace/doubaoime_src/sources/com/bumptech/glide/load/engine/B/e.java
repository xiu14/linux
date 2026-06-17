package com.bumptech.glide.load.engine.B;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class e implements d {
    @Override // com.bumptech.glide.load.engine.B.d
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.B.d
    @NonNull
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.B.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.B.d
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.B.d
    public void trimMemory(int i) {
    }
}
