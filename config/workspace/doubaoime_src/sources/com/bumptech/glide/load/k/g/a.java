package com.bumptech.glide.load.k.g;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    private final int b = 100;

    @Override // com.bumptech.glide.load.k.g.e
    @Nullable
    public v<byte[]> a(@NonNull v<Bitmap> vVar, @NonNull com.bumptech.glide.load.f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.a, this.b, byteArrayOutputStream);
        vVar.recycle();
        return new com.bumptech.glide.load.k.d.b(byteArrayOutputStream.toByteArray());
    }
}
