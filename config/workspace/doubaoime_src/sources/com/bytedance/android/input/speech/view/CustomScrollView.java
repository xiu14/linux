package com.bytedance.android.input.speech.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public final class CustomScrollView extends ScrollView {
    private boolean a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomScrollView(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (this.a) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final void setBottomFadingEdgeEnabled(boolean z) {
        this.a = z;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.a = true;
    }
}
