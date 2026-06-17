package com.bumptech.glide.load.k.e;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;

/* loaded from: classes.dex */
final class d extends c<Drawable> {
    private d(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    static v<Drawable> b(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return Math.max(1, this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Drawable> c() {
        return this.a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
