package com.obric.oui.popover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.obric.oui.layout.OUIFrameLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class SingleChildFrameLayout extends OUIFrameLayout {
    public SingleChildFrameLayout(Context context) {
        this(context, null);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt != null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight();
            if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(paddingRight, paddingBottom);
                return;
            }
            if (mode == Integer.MIN_VALUE) {
                setMeasuredDimension(paddingRight, size2);
            } else if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(size, paddingBottom);
            } else {
                setMeasuredDimension(size, size2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChildFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null, 12);
        l.f(context, "context");
    }
}
