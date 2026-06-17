package com.bumptech.glide.request.k;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.k.e
    protected void d(@Nullable Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
