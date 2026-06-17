package com.obric.oui.tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import e.i.a.b.b;

/* loaded from: classes2.dex */
public final class OTabItem extends View {
    final CharSequence a;
    final Drawable b;

    /* renamed from: c, reason: collision with root package name */
    final int f8056c;

    public OTabItem(Context context) {
        this(context, null);
    }

    @SuppressLint({"RestrictedApi"})
    public OTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, b.L);
        this.a = obtainStyledAttributes.getText(2);
        this.b = obtainStyledAttributes.getDrawable(0);
        this.f8056c = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
