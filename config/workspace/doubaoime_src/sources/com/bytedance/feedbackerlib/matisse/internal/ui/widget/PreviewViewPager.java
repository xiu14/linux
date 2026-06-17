package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class PreviewViewPager extends ViewPager {
    public PreviewViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    protected boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        return super.canScroll(view, z, i, i2, i3);
    }
}
