package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements com.bumptech.glide.load.g<com.bumptech.glide.n.a, Bitmap> {
    private final com.bumptech.glide.load.engine.B.d a;

    public g(com.bumptech.glide.load.engine.B.d dVar) {
        this.a = dVar;
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@NonNull com.bumptech.glide.n.a aVar, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public v<Bitmap> b(@NonNull com.bumptech.glide.n.a aVar, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return com.bumptech.glide.load.resource.bitmap.e.b(aVar.b(), this.a);
    }
}
