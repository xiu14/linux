package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.input.common_biz.ui.databinding.ImeImageTextComponentBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeImageTextComponent extends LinearLayout {
    private final ImeImageTextComponentBinding a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeImageTextComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public final void setIcon(int i) {
        this.a.b.setImageResource(i);
        ImageView imageView = this.a.b;
        l.e(imageView, "binding.ivIcon");
        e.b.d.a.a.e.h(imageView);
    }

    public final void setText(CharSequence charSequence) {
        l.f(charSequence, "text");
        this.a.f2271c.setText(charSequence);
    }

    public final void setTextBold(boolean z) {
        TextView textView = this.a.f2271c;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public final void setTextStyle(int i) {
        this.a.f2271c.setTextAppearance(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeImageTextComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeImageTextComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        ImeImageTextComponentBinding a = ImeImageTextComponentBinding.a(LayoutInflater.from(context), this, true);
        l.e(a, "inflate(LayoutInflater.from(context), this, true)");
        this.a = a;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.f2457e, 0, 0);
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…ImageTextComponent, 0, 0)");
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            String string = obtainStyledAttributes.getString(1);
            int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (resourceId != 0) {
                a.b.setBackgroundResource(resourceId);
                ImageView imageView = a.b;
                l.e(imageView, "binding.ivIcon");
                e.b.d.a.a.e.h(imageView);
            } else {
                ImageView imageView2 = a.b;
                l.e(imageView2, "binding.ivIcon");
                e.b.d.a.a.e.e(imageView2);
            }
            a.f2271c.setText(string);
            if (resourceId2 != 0) {
                a.f2271c.setTextAppearance(resourceId2);
            }
            setTextBold(z);
            obtainStyledAttributes.recycle();
        }
    }
}
