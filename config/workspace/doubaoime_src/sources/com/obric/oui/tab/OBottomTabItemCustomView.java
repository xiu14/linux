package com.obric.oui.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBottomTabItemCustomView extends RelativeLayout {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f8053c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f8054d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f8055e;

    public OBottomTabItemCustomView(Context context) {
        this(context, null);
    }

    public final ImageView a() {
        return this.f8053c;
    }

    public final TextView b() {
        return this.f8054d;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            ColorStateList colorStateList = this.f8055e;
            int colorForState = colorStateList != null ? colorStateList.getColorForState(View.SELECTED_STATE_SET, this.b) : this.b;
            this.f8054d.setTextColor(colorForState);
            if (this.f8053c.getDrawable() != null) {
                ImageView imageView = this.f8053c;
                Drawable wrap = DrawableCompat.wrap(imageView.getDrawable());
                wrap.setTint(colorForState);
                imageView.setImageDrawable(wrap);
                return;
            }
            return;
        }
        ColorStateList colorStateList2 = this.f8055e;
        int defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : this.a;
        this.f8054d.setTextColor(defaultColor);
        if (this.f8053c.getDrawable() != null) {
            ImageView imageView2 = this.f8053c;
            Drawable wrap2 = DrawableCompat.wrap(imageView2.getDrawable());
            wrap2.setTint(defaultColor);
            imageView2.setImageDrawable(wrap2);
        }
    }

    public final void setSelectedBgColor(Integer num) {
        if (num == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDimension(C0838R.dimen.oui_r_m1));
        gradientDrawable.setColor(num.intValue());
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.f8055e = colorStateList;
        if (colorStateList == null) {
            return;
        }
        this.f8054d.setTextColor(colorStateList.getDefaultColor());
        if (this.f8053c.getDrawable() != null) {
            ImageView imageView = this.f8053c;
            Drawable wrap = DrawableCompat.wrap(imageView.getDrawable());
            wrap.setTint(colorStateList.getDefaultColor());
            imageView.setImageDrawable(wrap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomTabItemCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClickable(false);
        setFocusable(false);
        LayoutInflater.from(context).inflate(C0838R.layout.o_tab_bottom_item, (ViewGroup) this, true);
        View findViewById = findViewById(C0838R.id.icon_container);
        l.e(findViewById, "findViewById(R.id.icon_container)");
        View findViewById2 = findViewById(C0838R.id.icon);
        l.e(findViewById2, "findViewById(R.id.icon)");
        this.f8053c = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.title);
        l.e(findViewById3, "findViewById(R.id.title)");
        this.f8054d = (TextView) findViewById3;
        this.a = ContextCompat.getColor(getContext(), C0838R.color.oui_text_3);
        this.b = ContextCompat.getColor(getContext(), C0838R.color.oui_accent_fg);
    }
}
