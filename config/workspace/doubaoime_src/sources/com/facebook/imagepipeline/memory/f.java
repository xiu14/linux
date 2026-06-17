package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class f extends s<Bitmap> {
    @Override // com.facebook.imagepipeline.memory.s
    public Bitmap a(int i) {
        Bitmap bitmap = (Bitmap) super.a(i);
        if (bitmap == null || !e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.s
    public int b(Bitmap bitmap) {
        return com.facebook.imageutils.b.e(bitmap);
    }

    @Override // com.facebook.imagepipeline.memory.s
    public void d(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (e(bitmap2)) {
            super.d(bitmap2);
        }
    }

    protected boolean e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            e.c.c.e.a.z("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        e.c.c.e.a.z("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }
}
