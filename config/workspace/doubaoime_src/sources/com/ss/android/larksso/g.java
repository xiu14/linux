package com.ss.android.larksso;

import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class g {
    public static int a(@ColorInt int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        float f2 = 1.0f - (i2 / 255.0f);
        return ((int) (((i & 255) * f2) + 0.5d)) | (((int) ((((i >> 16) & 255) * f2) + 0.5d)) << 16) | ViewCompat.MEASURED_STATE_MASK | (((int) ((((i >> 8) & 255) * f2) + 0.5d)) << 8);
    }
}
