package com.obric.oui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;

@Deprecated
/* loaded from: classes2.dex */
public class OTextTitleBar extends OTitleBar implements View.OnClickListener {
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f8123c;

    /* renamed from: d, reason: collision with root package name */
    private com.obric.oui.titlebar.d.a f8124d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f8125e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8126f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8127g;
    private View h;

    public OTextTitleBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextView textView = this.b;
        if (textView != null) {
            com.obric.oui.common.util.b.b(textView, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
        TextView textView2 = this.f8123c;
        if (textView2 != null) {
            com.obric.oui.common.util.b.b(textView2, e.i.a.b.a.c(44), e.i.a.b.a.c(44), false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f8124d != null) {
            if (view.getId() == C0838R.id.back_btn || view.getId() == C0838R.id.text_left) {
                this.f8124d.b(view);
            } else if (view.getId() == C0838R.id.text_right) {
                this.f8124d.a(view);
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a.setMaxWidth(Math.max(((e.i.a.b.a.f(getContext()) / 2) - Math.max(this.b.getMeasuredWidth(), this.f8123c.getMeasuredWidth())) * 2, e.i.a.b.a.c(112)));
    }

    @Override // com.obric.oui.titlebar.OTitleBar
    public void setDividerLineBackground(@ColorInt int i) {
        this.h.setBackgroundColor(i);
    }

    public void setEndText(CharSequence charSequence) {
        this.f8123c.setText(charSequence);
    }

    public void setEndTextColor(@ColorInt int i) {
        this.f8123c.setTextColor(i);
    }

    public void setEndTextSize(float f2) {
        this.f8123c.setTextSize(f2);
    }

    public void setLineBackground(@ColorInt int i) {
        this.h.setBackgroundColor(i);
    }

    public void setOnTitleBarClickListener(com.obric.oui.titlebar.d.a aVar) {
        this.f8124d = aVar;
    }

    public void setStartText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setStartTextColor(@ColorInt int i) {
        this.b.setTextColor(i);
    }

    public void setStartTextSize(float f2) {
        this.b.setTextSize(f2);
    }

    public void setUseBackIcon(boolean z) {
        if (this.f8126f != z) {
            this.f8126f = z;
            this.f8125e.setVisibility(z ? 0 : 8);
            this.f8125e.setImageResource(C0838R.drawable.o_ic_titlebar_back);
            this.b.setVisibility(this.f8126f ? 8 : 0);
            this.f8125e.setContentDescription(getContext().getString(C0838R.string.oui_iv_back_desc));
        }
    }

    public void setUseCloseIcon(boolean z) {
        if (this.f8127g != z) {
            this.f8127g = z;
            this.f8125e.setVisibility(z ? 0 : 8);
            this.f8125e.setImageResource(C0838R.drawable.o_ic_titlebar_close);
            this.b.setVisibility(this.f8127g ? 8 : 0);
            this.f8125e.setContentDescription(getContext().getString(C0838R.string.oui_iv_close_desc));
        }
    }

    public OTextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setEndText(@StringRes int i) {
        this.f8123c.setText(i);
    }

    public void setStartText(@StringRes int i) {
        this.b.setText(i);
    }

    public OTextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(context, C0838R.layout.o_view_text_title_bar, this);
        this.b = (TextView) findViewById(C0838R.id.text_left);
        this.a = (TextView) findViewById(C0838R.id.title);
        this.f8123c = (TextView) findViewById(C0838R.id.text_right);
        this.f8125e = (ImageView) findViewById(C0838R.id.back_btn);
        this.h = findViewById(C0838R.id.line);
        this.f8125e.setOnClickListener(this);
        this.b.setOnClickListener(this);
        this.f8123c.setOnClickListener(this);
        e.i.b.c.c.a aVar = new e.i.b.c.c.a(0.5f, 1.0f);
        this.f8125e.setOnTouchListener(aVar);
        this.b.setOnTouchListener(aVar);
        this.f8123c.setOnTouchListener(aVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.P);
            String string = obtainStyledAttributes.getString(0);
            float dimension = obtainStyledAttributes.getDimension(2, e.i.a.b.a.c(17));
            int color = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, C0838R.color.TextPrimary));
            this.a.setText(string);
            this.a.setTextSize(0, dimension);
            this.a.setTextColor(color);
            this.f8126f = obtainStyledAttributes.getBoolean(13, false);
            boolean z = obtainStyledAttributes.getBoolean(14, false);
            this.f8127g = z;
            if (this.f8126f) {
                this.f8125e.setVisibility(0);
                this.b.setVisibility(8);
                this.f8125e.setContentDescription(context.getString(C0838R.string.oui_iv_back_desc));
            } else if (z) {
                this.f8125e.setVisibility(0);
                this.f8125e.setImageResource(C0838R.drawable.o_ic_titlebar_close);
                this.b.setVisibility(8);
                this.f8125e.setContentDescription(context.getString(C0838R.string.oui_iv_close_desc));
            } else {
                String string2 = obtainStyledAttributes.getString(5);
                float dimension2 = obtainStyledAttributes.getDimension(7, e.i.a.b.a.c(15));
                int color2 = obtainStyledAttributes.getColor(6, ContextCompat.getColor(context, C0838R.color.TextPrimary));
                this.f8125e.setVisibility(8);
                this.b.setVisibility(0);
                this.b.setText(string2);
                this.b.setTextSize(0, dimension2);
                this.b.setTextColor(color2);
            }
            if (obtainStyledAttributes.getInt(9, 1) == 1) {
                this.f8123c.setTextColor(ContextCompat.getColor(context, C0838R.color.Primary));
            } else {
                this.f8123c.setTextColor(ContextCompat.getColor(context, C0838R.color.TextPrimary));
            }
            String string3 = obtainStyledAttributes.getString(8);
            float dimension3 = obtainStyledAttributes.getDimension(11, e.i.a.b.a.c(15));
            int color3 = obtainStyledAttributes.getColor(10, ContextCompat.getColor(context, C0838R.color.TextPrimary));
            int i2 = obtainStyledAttributes.getInt(12, 0);
            this.f8123c.setText(string3);
            this.f8123c.setTextSize(0, dimension3);
            if (obtainStyledAttributes.hasValue(10)) {
                this.f8123c.setTextColor(color3);
            }
            this.f8123c.setVisibility(i2);
            this.h.setVisibility(obtainStyledAttributes.getInt(4, 0));
            this.h.setBackgroundColor(obtainStyledAttributes.getColor(3, ContextCompat.getColor(context, C0838R.color.LinePrimary)));
            obtainStyledAttributes.recycle();
        }
    }
}
