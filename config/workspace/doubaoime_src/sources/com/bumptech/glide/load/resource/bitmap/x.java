package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class x implements com.bumptech.glide.load.g<Uri, Bitmap> {
    private final com.bumptech.glide.load.k.e.e a;
    private final com.bumptech.glide.load.engine.B.d b;

    public x(com.bumptech.glide.load.k.e.e eVar, com.bumptech.glide.load.engine.B.d dVar) {
        this.a = eVar;
        this.b = dVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull Uri uri, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.g
    @Nullable
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        com.bumptech.glide.load.engine.v c2 = this.a.c(uri, fVar);
        if (c2 == null) {
            return null;
        }
        return n.a(this.b, (Drawable) ((com.bumptech.glide.load.k.e.c) c2).get(), i, i2);
    }
}
