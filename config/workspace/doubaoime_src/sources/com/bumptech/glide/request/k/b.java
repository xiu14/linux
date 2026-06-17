package com.bumptech.glide.request.k;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.k.e
    protected void d(Bitmap bitmap) {
        ((ImageView) this.a).setImageBitmap(bitmap);
    }
}
