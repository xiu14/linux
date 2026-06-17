package com.obric.oui.slider;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class SeekBarFloatCompat extends SeekBarCompat {
    public SeekBarFloatCompat(Context context) {
        this(context, null, 0);
    }

    private final int p(float f2) {
        return (int) (f2 * 100);
    }

    public final void setMaxValue(float f2) {
        super.setMaxValue(p(f2));
    }

    public final void setMinValue(float f2) {
        super.setMinValue(p(f2));
    }

    public final void setProgress(float f2) {
        super.setProgress(p(f2));
    }

    public SeekBarFloatCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setProgress(float f2, boolean z) {
        super.setProgress(p(f2), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarFloatCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
