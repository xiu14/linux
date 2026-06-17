package com.obric.appstore.autoupdate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public class MaxScrollView extends ScrollView {
    private int a;

    public MaxScrollView(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.a;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.a = i;
        requestLayout();
    }

    public MaxScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    public MaxScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
    }
}
