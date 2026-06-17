package com.obric.oui.sectiontitlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.badge.OBadgeView;
import e.i.a.b.b;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class OSectionTitleBar extends LinearLayout {
    private TextView a;
    private ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private OBadgeView f7971c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f7972d;

    public OSectionTitleBar(Context context) {
        this(context, null, 0);
    }

    public final ImageView a() {
        return this.b;
    }

    public final TextView b() {
        return this.f7972d;
    }

    public final TextView c() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setIconImageView(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.b = imageView;
    }

    public final void setIconResource(int i) {
        this.b.setImageResource(i);
    }

    public final void setNumberBadgeViewText(String str) {
        l.f(str, "text");
        this.f7971c.setText(str);
    }

    public final void setNumberTextViewText(String str) {
        l.f(str, "text");
        this.f7972d.setText(str);
    }

    public final void setTitleText(String str) {
        l.f(str, "text");
        this.a.setText(str);
    }

    public final void setTitleTextSize(float f2) {
        this.a.setTextSize(f2);
    }

    public OSectionTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSectionTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0838R.layout.o_section_title_bar, (ViewGroup) this, true);
        View findViewById = findViewById(C0838R.id.titleTextView);
        l.e(findViewById, "findViewById(R.id.titleTextView)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.iconImageView);
        l.e(findViewById2, "findViewById(R.id.iconImageView)");
        this.b = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.numberBadgeView);
        l.e(findViewById3, "findViewById(R.id.numberBadgeView)");
        this.f7971c = (OBadgeView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.numberTextView);
        l.e(findViewById4, "findViewById(R.id.numberTextView)");
        this.f7972d = (TextView) findViewById4;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.X, 0, 0);
        l.e(obtainStyledAttributes, "context.theme.obtainStyl…           0, 0\n        )");
        try {
            String string = obtainStyledAttributes.getString(2);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(3, C0838R.style.Label_M);
            int i2 = obtainStyledAttributes.getInt(1, -1);
            boolean z = obtainStyledAttributes.getBoolean(4, true);
            this.a.setText(string);
            this.a.setTextAppearance(resourceId2);
            if (i2 != -1) {
                if (z) {
                    this.f7971c.setVisibility(0);
                    this.f7972d.setVisibility(4);
                    this.f7971c.setText(String.valueOf(i2));
                } else {
                    this.f7971c.setVisibility(4);
                    this.f7972d.setVisibility(0);
                    this.f7972d.setTextAppearance(resourceId2);
                    this.f7972d.setText(String.valueOf(i2));
                }
                this.b.setVisibility(4);
            } else {
                this.f7971c.setVisibility(4);
                this.f7972d.setVisibility(4);
                this.b.setVisibility(0);
                if (resourceId != -1) {
                    this.b.setImageResource(resourceId);
                }
            }
            int textSize = (int) this.a.getTextSize();
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            if (textSize == a.a(TypedValue.applyDimension(2, 12, system.getDisplayMetrics()))) {
                int paddingLeft = getPaddingLeft();
                Resources system2 = Resources.getSystem();
                l.e(system2, "Resources.getSystem()");
                setPadding(paddingLeft, a.a(TypedValue.applyDimension(1, 4, system2.getDisplayMetrics())), getPaddingRight(), getPaddingBottom());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
