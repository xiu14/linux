package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class GenericDraweeView extends DraweeView<com.facebook.drawee.generic.a> {
    public GenericDraweeView(Context context) {
        super(context);
        n(context, null);
    }

    protected void n(Context context, AttributeSet attributeSet) {
        e.c.h.m.b.b();
        com.facebook.drawee.generic.b d2 = com.facebook.drawee.generic.c.d(context, attributeSet);
        setAspectRatio(d2.e());
        setHierarchy(d2.a());
        e.c.h.m.b.b();
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n(context, attributeSet);
    }
}
