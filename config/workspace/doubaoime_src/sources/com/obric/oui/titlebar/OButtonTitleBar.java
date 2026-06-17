package com.obric.oui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;

@Deprecated
/* loaded from: classes2.dex */
public class OButtonTitleBar extends OTitleBar implements View.OnClickListener {
    private ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f8102c;

    /* renamed from: d, reason: collision with root package name */
    private com.obric.oui.titlebar.d.a f8103d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f8104e;

    /* renamed from: f, reason: collision with root package name */
    private View f8105f;

    /* renamed from: g, reason: collision with root package name */
    @ColorInt
    private int f8106g;

    public OButtonTitleBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.b;
        if (imageView != null) {
            com.obric.oui.common.util.b.b(imageView, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
        TextView textView = this.f8102c;
        if (textView != null) {
            com.obric.oui.common.util.b.b(textView, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f8103d != null) {
            if (view.getId() == C0838R.id.back_btn) {
                this.f8103d.b(view);
            } else if (view.getId() == C0838R.id.right_btn) {
                this.f8103d.a(view);
            }
        }
    }

    @Override // com.obric.oui.titlebar.OTitleBar
    public void setDividerLineBackground(@ColorInt int i) {
        this.f8105f.setBackgroundColor(i);
    }

    public void setOnTitleBarClickListener(com.obric.oui.titlebar.d.a aVar) {
        this.f8103d = aVar;
    }

    public OButtonTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OButtonTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(context, C0838R.layout.o_view_button_title_bar, this);
        this.b = (ImageView) findViewById(C0838R.id.back_btn);
        this.a = (TextView) findViewById(C0838R.id.title);
        this.f8102c = (TextView) findViewById(C0838R.id.right_btn);
        this.f8105f = findViewById(C0838R.id.line);
        this.b.setOnClickListener(this);
        this.f8102c.setOnClickListener(this);
        e.i.b.c.c.a aVar = new e.i.b.c.c.a(0.5f, 1.0f);
        this.b.setOnTouchListener(aVar);
        this.f8102c.setOnTouchListener(aVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.f9968g);
            String string = obtainStyledAttributes.getString(0);
            float dimension = obtainStyledAttributes.getDimension(2, e.i.a.b.a.c(17));
            int color = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0838R.color.TextPrimary));
            this.a.setText(string);
            this.a.setTextSize(0, dimension);
            this.a.setTextColor(color);
            String string2 = obtainStyledAttributes.getString(5);
            int i2 = obtainStyledAttributes.getInt(9, 1);
            float dimension2 = obtainStyledAttributes.getDimension(8, e.i.a.b.a.b(17.0f));
            int color2 = obtainStyledAttributes.getColor(7, 0);
            this.f8104e = obtainStyledAttributes.getDrawable(6);
            int i3 = obtainStyledAttributes.getInt(10, 0);
            this.f8102c.setText(string2);
            if (i2 == 1) {
                this.f8102c.setTypeface(Typeface.defaultFromStyle(1));
                this.f8102c.setTextColor(ContextCompat.getColor(context, C0838R.color.Primary));
            } else {
                this.f8102c.setTypeface(Typeface.defaultFromStyle(0));
                this.f8102c.setTextColor(ContextCompat.getColor(context, C0838R.color.TextPrimary));
            }
            this.f8102c.setTextSize(0, dimension2);
            if (color2 != 0) {
                this.f8102c.setTextColor(color2);
            }
            Drawable drawable = this.f8104e;
            if (drawable != null) {
                this.f8102c.setBackground(drawable);
            }
            this.f8102c.setVisibility(i3);
            this.f8105f.setVisibility(obtainStyledAttributes.getBoolean(4, false) ? 0 : 4);
            int color3 = obtainStyledAttributes.getColor(3, ContextCompat.getColor(context, C0838R.color.LinePrimary));
            this.f8106g = color3;
            this.f8105f.setBackgroundColor(color3);
            obtainStyledAttributes.recycle();
        }
    }
}
