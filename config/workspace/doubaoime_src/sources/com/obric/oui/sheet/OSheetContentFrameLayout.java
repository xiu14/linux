package com.obric.oui.sheet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSheetContentFrameLayout extends FrameLayout {
    public OSheetContentFrameLayout(Context context) {
        this(context, null, 0);
    }

    public OSheetContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSheetContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
