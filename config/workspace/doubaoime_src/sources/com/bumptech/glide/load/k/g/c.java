package com.bumptech.glide.load.k.g;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {
    private final com.bumptech.glide.load.engine.B.d a;
    private final e<Bitmap, byte[]> b;

    /* renamed from: c, reason: collision with root package name */
    private final e<GifDrawable, byte[]> f1731c;

    public c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull e<Bitmap, byte[]> eVar, @NonNull e<GifDrawable, byte[]> eVar2) {
        this.a = dVar;
        this.b = eVar;
        this.f1731c = eVar2;
    }

    @Override // com.bumptech.glide.load.k.g.e
    @Nullable
    public v<byte[]> a(@NonNull v<Drawable> vVar, @NonNull com.bumptech.glide.load.f fVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(com.bumptech.glide.load.resource.bitmap.e.b(((BitmapDrawable) drawable).getBitmap(), this.a), fVar);
        }
        if (drawable instanceof GifDrawable) {
            return this.f1731c.a(vVar, fVar);
        }
        return null;
    }
}
