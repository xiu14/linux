package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class KeyboardTipView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardTipView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        FrameLayout.inflate(context, C0838R.layout.floating_keyboard_tip_view, this);
    }
}
