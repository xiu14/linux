package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* loaded from: classes.dex */
public class SquareTextView extends AppCompatTextView {
    public SquareTextView(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), BasicMeasure.EXACTLY));
    }

    public SquareTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
