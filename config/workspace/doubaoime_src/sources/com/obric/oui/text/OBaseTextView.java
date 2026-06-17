package com.obric.oui.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.s.c.l;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public final class OBaseTextView extends TextView {
    public OBaseTextView(Context context) {
        this(context, null, 0, 6);
    }

    public OBaseTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ OBaseTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBaseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
