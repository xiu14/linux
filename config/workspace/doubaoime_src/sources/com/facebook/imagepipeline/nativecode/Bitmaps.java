package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import e.c.c.d.h;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class Bitmaps {
    static {
        int i = a.a;
        com.facebook.soloader.r.a.c("imagepipeline");
    }

    @e.c.c.d.c
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        h.a(bitmap2.getConfig() == bitmap.getConfig());
        h.a(bitmap.isMutable());
        h.a(bitmap.getWidth() == bitmap2.getWidth());
        h.a(bitmap.getHeight() == bitmap2.getHeight());
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @e.c.c.d.c
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
