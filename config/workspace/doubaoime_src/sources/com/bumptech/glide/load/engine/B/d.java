package com.bumptech.glide.load.engine.B;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface d {
    void a();

    @NonNull
    Bitmap b(int i, int i2, Bitmap.Config config);

    void c(Bitmap bitmap);

    @NonNull
    Bitmap d(int i, int i2, Bitmap.Config config);

    void trimMemory(int i);
}
