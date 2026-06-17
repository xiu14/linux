package com.obric.oui.popover;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class PopoverLinearLayout extends LinearLayout {
    public PopoverLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (z) {
            setAlpha(0.66f);
        } else {
            setAlpha(1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopoverLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }
}
