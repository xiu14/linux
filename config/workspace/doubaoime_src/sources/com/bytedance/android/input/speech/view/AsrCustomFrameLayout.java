package com.bytedance.android.input.speech.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AsrCustomFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCustomFrameLayout(Context context) {
        super(context);
        kotlin.s.c.l.c(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setPressed(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCustomFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.c(context);
    }
}
