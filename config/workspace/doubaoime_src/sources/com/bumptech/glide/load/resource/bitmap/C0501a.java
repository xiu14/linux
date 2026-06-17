package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0501a<DataType> implements com.bumptech.glide.load.g<DataType, BitmapDrawable> {
    private final com.bumptech.glide.load.g<DataType, Bitmap> a;
    private final Resources b;

    public C0501a(@NonNull Resources resources, @NonNull com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this.b = resources;
        this.a = gVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull DataType datatype, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return this.a.a(datatype, fVar);
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<BitmapDrawable> b(@NonNull DataType datatype, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return u.b(this.b, this.a.b(datatype, i, i2, fVar));
    }
}
