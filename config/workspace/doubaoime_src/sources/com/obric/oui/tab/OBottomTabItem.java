package com.obric.oui.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import e.i.a.b.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBottomTabItem extends View {
    private CharSequence a;
    private Drawable b;

    public OBottomTabItem(Context context) {
        this(context, null);
    }

    public final Drawable a() {
        return this.b;
    }

    public final CharSequence b() {
        return this.a;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setIcon(Drawable drawable) {
        this.b = drawable;
    }

    public final void setText(CharSequence charSequence) {
        this.a = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, b.L);
        this.a = obtainStyledAttributes.getText(2);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
}
