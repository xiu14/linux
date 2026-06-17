package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(api = 28)
/* loaded from: classes.dex */
public final class t implements com.bumptech.glide.load.g<InputStream, Bitmap> {
    private final C0504d a = new C0504d();

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return this.a.b(ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream)), i, i2, fVar);
    }
}
