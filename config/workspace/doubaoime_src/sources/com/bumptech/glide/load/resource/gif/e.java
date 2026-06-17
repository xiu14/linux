package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements com.bumptech.glide.load.i<GifDrawable> {
    private final com.bumptech.glide.load.i<Bitmap> b;

    public e(com.bumptech.glide.load.i<Bitmap> iVar) {
        Objects.requireNonNull(iVar, "Argument must not be null");
        this.b = iVar;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.i
    @NonNull
    public v<GifDrawable> b(@NonNull Context context, @NonNull v<GifDrawable> vVar, int i, int i2) {
        GifDrawable gifDrawable = vVar.get();
        v<Bitmap> eVar = new com.bumptech.glide.load.resource.bitmap.e(gifDrawable.c(), com.bumptech.glide.c.b(context).d());
        v<Bitmap> b = this.b.b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.recycle();
        }
        gifDrawable.g(this.b, b.get());
        return vVar;
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.b.equals(((e) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return this.b.hashCode();
    }
}
