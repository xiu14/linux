package com.obric.oui.dialog.alert;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ImageStyleController$FixRatioLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStyleController$FixRatioLayout(Context context) {
        super(context);
        l.f(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) / 2, BasicMeasure.EXACTLY));
    }
}
