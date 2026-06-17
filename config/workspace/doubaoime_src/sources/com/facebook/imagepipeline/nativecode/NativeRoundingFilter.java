package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import java.util.Objects;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeRoundingFilter {
    static {
        com.facebook.soloader.r.a.c("native-filters");
    }

    @e.c.c.d.c
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @e.c.c.d.c
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @e.c.c.d.c
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @e.c.c.d.c
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @e.c.c.d.c
    public static void toCircle(Bitmap bitmap, boolean z) {
        Objects.requireNonNull(bitmap);
        nativeToCircleFilter(bitmap, z);
    }

    @e.c.c.d.c
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        Objects.requireNonNull(bitmap);
        nativeToCircleFastFilter(bitmap, z);
    }
}
