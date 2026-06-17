package com.obric.oui.lisitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class SettingsTrailingView extends LinearLayout {
    private TextView a;
    private ImageView b;

    public SettingsTrailingView(Context context) {
        this(context, null, 0, 6);
    }

    public SettingsTrailingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ SettingsTrailingView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final TextView a() {
        return this.a;
    }

    public final void setIconImageView(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.b = imageView;
    }

    public final void setTextView(TextView textView) {
        l.f(textView, "<set-?>");
        this.a = textView;
    }

    public final void setTrailingImage(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.b.setImageDrawable(drawable);
    }

    public final void setTrailingText(String str) {
        l.f(str, "text");
        this.a.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsTrailingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0838R.layout.o_settings_trailing_view_2, (ViewGroup) this, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388629;
        addView(inflate, layoutParams);
        View findViewById = findViewById(C0838R.id.trailingText);
        l.e(findViewById, "findViewById(R.id.trailingText)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.trailingImage);
        l.e(findViewById2, "findViewById(R.id.trailingImage)");
        ImageView imageView = (ImageView) findViewById2;
        this.b = imageView;
        imageView.setImageDrawable(context.getDrawable(C0838R.drawable.ic_arrow_forward_list_item));
    }
}
