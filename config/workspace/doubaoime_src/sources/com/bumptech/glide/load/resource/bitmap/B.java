package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes.dex */
public final class B implements com.bumptech.glide.load.g<Bitmap, Bitmap> {

    private static final class a implements com.bumptech.glide.load.engine.v<Bitmap> {
        private final Bitmap a;

        a(@NonNull Bitmap bitmap) {
            this.a = bitmap;
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

        @Override // com.bumptech.glide.load.engine.v
        public void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull Bitmap bitmap, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return new a(bitmap);
    }
}
