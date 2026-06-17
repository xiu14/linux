package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeButton extends AppCompatTextView {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f4339c;

    /* renamed from: d, reason: collision with root package name */
    private float f4340d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final void a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f4340d);
        int i = this.a;
        if (i == 0) {
            gradientDrawable.setColor(getResources().getColor(C0838R.color.ime_button_bg_style_1, null));
            setTextColor(getResources().getColor(C0838R.color.ime_button_text_style_1, null));
        } else if (i == 1) {
            gradientDrawable.setColor(getResources().getColor(C0838R.color.ime_button_bg_style_2, null));
            setTextColor(getResources().getColor(C0838R.color.ime_button_text_style_2, null));
        } else if (i == 2) {
            gradientDrawable.setColor(getResources().getColor(C0838R.color.ime_button_bg_style_1, null));
            setTextColor(getResources().getColor(C0838R.color.ime_button_text_style_1, null));
        } else if (i == 3) {
            gradientDrawable.setColor(this.b);
            setTextColor(this.f4339c);
        }
        setBackground(gradientDrawable);
    }

    public final void setButtonStyle(int i) {
        this.a = i;
        a();
    }

    public final void setCustomBackgroundColor(int i) {
        this.b = i;
        if (this.a == 3) {
            a();
        }
    }

    public final void setCustomTextColor(int i) {
        this.f4339c = i;
        if (this.a == 3) {
            a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.b, 0, 0);
        try {
            this.a = obtainStyledAttributes.getInt(2, 0);
            this.b = obtainStyledAttributes.getColor(0, 0);
            this.f4339c = obtainStyledAttributes.getColor(3, ViewCompat.MEASURED_STATE_MASK);
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            this.f4340d = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 30, system.getDisplayMetrics()));
            obtainStyledAttributes.recycle();
            a();
            setGravity(17);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
