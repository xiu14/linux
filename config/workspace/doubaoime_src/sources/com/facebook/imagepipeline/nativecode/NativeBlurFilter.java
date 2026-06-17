package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeBlurFilter {
    static {
        com.facebook.soloader.r.a.c("native-filters");
    }

    @e.c.c.d.c
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
