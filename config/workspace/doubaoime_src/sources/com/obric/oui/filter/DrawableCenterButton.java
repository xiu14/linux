package com.obric.oui.filter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.GravityCompat;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class DrawableCenterButton extends AppCompatButton {
    public DrawableCenterButton(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        Drawable[] compoundDrawables = getCompoundDrawables();
        l.e(compoundDrawables, "compoundDrawables");
        if (compoundDrawables[2] != null) {
            float measureText = getPaint().measureText(getText().toString()) + r0.getIntrinsicHeight() + getCompoundDrawablePadding() + getPaddingLeft() + getPaddingRight();
            if (measureText <= getMeasuredWidth()) {
                canvas.translate((measureText - getMeasuredWidth()) / 2, 0.0f);
            }
        }
        super.onDraw(canvas);
    }

    public DrawableCenterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableCenterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        setGravity(GravityCompat.END);
    }
}
