package com.obric.oui.tag;

import android.content.Context;
import android.util.AttributeSet;
import com.obric.oui.button.OButton;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OTagNew extends OButton {
    public OTagNew(Context context) {
        this(context, null, 0, 6);
    }

    public OTagNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ OTagNew(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTagNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, null, 24);
        l.f(context, "context");
    }
}
