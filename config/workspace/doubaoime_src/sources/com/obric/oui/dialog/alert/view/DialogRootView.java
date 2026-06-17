package com.obric.oui.dialog.alert.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import e.i.a.b.a;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class DialogRootView extends RadiusLayout {
    public DialogRootView(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.dialog.alert.view.RadiusLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        l.e(getContext(), "context");
        int e2 = (int) (a.e(r0) * 0.9d);
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int makeMeasureSpec = mode != Integer.MIN_VALUE ? mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(size, e2), BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(e2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(size, e2), Integer.MIN_VALUE);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            Context context = getContext();
            l.e(context, "context");
            i = View.MeasureSpec.makeMeasureSpec(a.f(context), BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    public DialogRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
