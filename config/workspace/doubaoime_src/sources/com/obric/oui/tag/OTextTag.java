package com.obric.oui.tag;

import android.content.Context;
import android.util.AttributeSet;
import com.obric.oui.text.OTextView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OTextTag extends OTextView {
    public OTextTag(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.text.OTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.text.OTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public OTextTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTextTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8);
        l.f(context, "context");
    }
}
