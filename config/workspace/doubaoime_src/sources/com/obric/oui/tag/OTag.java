package com.obric.oui.tag;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import e.a.a.a.a;
import e.i.a.b.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OTag extends AppCompatTextView {
    private int a;

    @ColorInt
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @ColorInt
    private int f8092c;

    public OTag(Context context) {
        this(context, null, 0);
    }

    public OTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int e0;
        int e02;
        GradientDrawable gradientDrawable;
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.O, 0, 0);
        try {
            this.a = obtainStyledAttributes.getInteger(4, 0);
            obtainStyledAttributes.getBoolean(3, false);
            obtainStyledAttributes.getColor(2, 0);
            this.b = obtainStyledAttributes.getColor(1, 0);
            this.f8092c = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            int i2 = this.a;
            if (i2 == 0) {
                e0 = a.e0("Resources.getSystem()", 1, 3);
                e02 = a.e0("Resources.getSystem()", 1, 1);
            } else if (i2 != 2) {
                e02 = a.e0("Resources.getSystem()", 1, 1);
                e0 = a.e0("Resources.getSystem()", 1, 3);
            } else {
                e02 = a.e0("Resources.getSystem()", 1, 2);
                e0 = a.e0("Resources.getSystem()", 1, 4);
            }
            setPadding(e0, e02, e0, e02);
            if (this.b != 0 && this.f8092c != 0) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{this.b, this.f8092c});
            } else {
                gradientDrawable = new GradientDrawable();
            }
            gradientDrawable.setCornerRadius(a.e0("Resources.getSystem()", 1, 2));
            setBackground(gradientDrawable);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
