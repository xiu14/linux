package com.airbnb.lottie;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.ColorInt;

/* loaded from: classes.dex */
public class t extends PorterDuffColorFilter {
    public t(@ColorInt int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
