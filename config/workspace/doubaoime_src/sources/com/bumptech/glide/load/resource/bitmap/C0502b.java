package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0502b implements com.bumptech.glide.load.h<BitmapDrawable> {
    private final com.bumptech.glide.load.engine.B.d a;
    private final com.bumptech.glide.load.h<Bitmap> b;

    public C0502b(com.bumptech.glide.load.engine.B.d dVar, com.bumptech.glide.load.h<Bitmap> hVar) {
        this.a = dVar;
        this.b = hVar;
    }

    @Override // com.bumptech.glide.load.a
    public boolean a(@NonNull Object obj, @NonNull File file, @NonNull com.bumptech.glide.load.f fVar) {
        return this.b.a(new e(((BitmapDrawable) ((com.bumptech.glide.load.engine.v) obj).get()).getBitmap(), this.a), file, fVar);
    }

    @Override // com.bumptech.glide.load.h
    @NonNull
    public EncodeStrategy b(@NonNull com.bumptech.glide.load.f fVar) {
        return this.b.b(fVar);
    }
}
