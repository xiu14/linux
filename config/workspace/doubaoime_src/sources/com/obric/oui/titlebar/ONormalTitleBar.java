package com.obric.oui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.android.doubaoime.C0838R;

@Deprecated
/* loaded from: classes2.dex */
public class ONormalTitleBar extends OTitleBar implements View.OnClickListener {
    private ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f8119c;

    /* renamed from: d, reason: collision with root package name */
    private com.obric.oui.titlebar.d.a f8120d;

    /* renamed from: e, reason: collision with root package name */
    private View f8121e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f8122f;

    public ONormalTitleBar(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.b;
        if (imageView != null) {
            com.obric.oui.common.util.b.b(imageView, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
        ImageView imageView2 = this.f8119c;
        if (imageView2 != null) {
            com.obric.oui.common.util.b.b(imageView2, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f8120d != null) {
            if (view.getId() == C0838R.id.back_btn || view.getId() == C0838R.id.text_left) {
                this.f8120d.b(view);
            } else if (view.getId() == C0838R.id.right_btn) {
                this.f8120d.a(view);
            }
        }
    }

    public void setCenterText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setDividerHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f8121e.getLayoutParams();
        layoutParams.height = i;
        this.f8121e.setLayoutParams(layoutParams);
    }

    @Override // com.obric.oui.titlebar.OTitleBar
    public void setDividerLineBackground(@ColorInt int i) {
        this.f8121e.setBackgroundColor(i);
    }

    public void setEndBtnIcon(@DrawableRes int i) {
        this.f8119c.setImageResource(i);
    }

    public void setOnTitleBarClickListener(com.obric.oui.titlebar.d.a aVar) {
        this.f8120d = aVar;
    }

    public void setStartBtnIcon(@DrawableRes int i) {
        this.b.setImageResource(i);
    }

    public void setStartText(String str) {
        this.b.setVisibility(8);
        this.f8122f.setVisibility(0);
        this.f8122f.setText(str);
    }

    public void setStartTextSize(float f2) {
        this.f8122f.setTextSize(0, f2);
    }

    public ONormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ONormalTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(context, C0838R.layout.o_view_normal_title_bar, this);
        this.b = (ImageView) findViewById(C0838R.id.back_btn);
        this.a = (TextView) findViewById(C0838R.id.title);
        this.f8119c = (ImageView) findViewById(C0838R.id.right_btn);
        this.f8121e = findViewById(C0838R.id.line);
        this.f8122f = (TextView) findViewById(C0838R.id.text_left);
        this.b.setOnClickListener(this);
        this.f8119c.setOnClickListener(this);
        this.f8122f.setOnClickListener(this);
        e.i.b.c.c.a aVar = new e.i.b.c.c.a(0.5f, 1.0f);
        this.b.setOnTouchListener(aVar);
        this.f8119c.setOnTouchListener(aVar);
        this.f8122f.setOnTouchListener(aVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.x);
            String string = obtainStyledAttributes.getString(0);
            float dimension = obtainStyledAttributes.getDimension(2, e.i.a.b.a.c(17));
            int color = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0838R.color.TextPrimary));
            this.a.setText(string);
            this.a.setTextSize(0, dimension);
            this.a.setTextColor(color);
            Drawable drawable = obtainStyledAttributes.getDrawable(5);
            if (obtainStyledAttributes.hasValue(6) && drawable != null) {
                int color2 = obtainStyledAttributes.getColor(6, 0);
                drawable = drawable.mutate();
                DrawableCompat.setTint(drawable, color2);
            }
            if (drawable != null) {
                this.f8119c.setImageDrawable(drawable);
            }
            this.f8121e.setVisibility(obtainStyledAttributes.getBoolean(4, true) ? 0 : 8);
            this.f8121e.setBackgroundColor(obtainStyledAttributes.getColor(3, ContextCompat.getColor(context, C0838R.color.LinePrimary)));
            obtainStyledAttributes.recycle();
        }
    }
}
