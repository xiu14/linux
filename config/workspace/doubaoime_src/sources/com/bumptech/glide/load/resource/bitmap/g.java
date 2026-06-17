package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public class g implements com.bumptech.glide.load.g<ByteBuffer, Bitmap> {
    private final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return this.a.d(byteBuffer, i, i2, fVar);
    }
}
