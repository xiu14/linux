package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeIconTextView extends LinearLayout {
    private final ImageView a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final View f4354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeIconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        LayoutInflater.from(context).inflate(C0838R.layout.layout_icon_text_view, (ViewGroup) this, true);
        setOrientation(1);
        View findViewById = findViewById(C0838R.id.itv_icon);
        l.e(findViewById, "findViewById(R.id.itv_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.a = imageView;
        View findViewById2 = findViewById(C0838R.id.itv_text);
        l.e(findViewById2, "findViewById(R.id.itv_text)");
        TextView textView = (TextView) findViewById2;
        this.b = textView;
        View findViewById3 = findViewById(C0838R.id.distance_icon_text);
        l.e(findViewById3, "findViewById(R.id.distance_icon_text)");
        this.f4354c = findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.a);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.IconTextView)");
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            imageView.setBackgroundResource(resourceId);
        }
        imageView.setPadding(0, 0, 0, obtainStyledAttributes.getDimensionPixelSize(1, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (dimensionPixelSize != 0) {
            layoutParams.width = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != 0) {
            layoutParams.height = dimensionPixelSize2;
        }
        imageView.setLayoutParams(layoutParams);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
        layoutParams2.height = dimensionPixelSize3;
        findViewById3.setLayoutParams(layoutParams2);
        textView.setText(obtainStyledAttributes.getString(5));
        int color = obtainStyledAttributes.getColor(6, 0);
        if (color != 0) {
            textView.setTextColor(color);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            textView.setTypeface(getResources().getFont(resourceId2));
        }
        obtainStyledAttributes.recycle();
    }

    public final void setFont(int i) {
        if (i != 0) {
            this.b.setTypeface(getResources().getFont(i));
        } else {
            this.b.setTypeface(null);
        }
    }

    public final void setIcon(int i) {
        this.a.setBackgroundResource(i);
    }

    public final void setIconSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.a.setLayoutParams(layoutParams);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
