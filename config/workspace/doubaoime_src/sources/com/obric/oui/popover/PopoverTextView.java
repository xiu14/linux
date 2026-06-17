package com.obric.oui.popover;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class PopoverTextView extends AppCompatTextView {
    public PopoverTextView(Context context) {
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
    public PopoverTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }
}
