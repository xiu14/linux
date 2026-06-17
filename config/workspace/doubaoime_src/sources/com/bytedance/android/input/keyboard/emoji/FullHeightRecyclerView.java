package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class FullHeightRecyclerView extends RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullHeightRecyclerView(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullHeightRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullHeightRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
    }
}
