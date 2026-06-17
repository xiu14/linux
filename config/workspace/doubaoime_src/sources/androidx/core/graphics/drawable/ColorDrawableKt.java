package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(@ColorInt int i) {
        return new ColorDrawable(i);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorDrawable toDrawable(Color color) {
        l.f(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
