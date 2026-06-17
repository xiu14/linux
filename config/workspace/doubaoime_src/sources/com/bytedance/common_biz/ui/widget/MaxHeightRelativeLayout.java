package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MaxHeightRelativeLayout extends RelativeLayout {
    private int a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxHeightRelativeLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.a <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, mode != Integer.MIN_VALUE ? mode != 1073741824 ? View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), Integer.MIN_VALUE));
    }

    public final void setMaxHeight(int i) {
        this.a = i;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxHeightRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.m);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr….MaxHeightRelativeLayout)");
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
