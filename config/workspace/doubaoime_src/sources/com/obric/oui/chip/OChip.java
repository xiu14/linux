package com.obric.oui.chip;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.layout.OUIFrameLayout;
import com.ss.android.message.log.PushLog;
import e.i.a.b.b;
import java.util.Objects;
import kotlin.f;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OChip extends OUIFrameLayout {

    /* renamed from: g, reason: collision with root package name */
    private final View f7698g;
    private final ImageView h;
    private final TextView i;
    private final ImageView j;
    private final boolean k;
    private boolean l;
    private p<? super OChip, ? super Boolean, o> m;

    public enum Style {
        Default,
        Rect
    }

    static final class a extends m implements p<OChip, Boolean, o> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.b = context;
        }

        @Override // kotlin.s.b.p
        public o invoke(OChip oChip, Boolean bool) {
            bool.booleanValue();
            l.f(oChip, "<anonymous parameter 0>");
            if (OChip.this.l) {
                OChip.this.setBackgroundColor(this.b.getColor(C0838R.color.oui_b_blue_bg_light));
                Drawable drawable = OChip.this.k().getDrawable();
                if (drawable != null) {
                    drawable.setTint(this.b.getColor(C0838R.color.oui_b_blue_fg));
                }
                OChip.this.l().setTextColor(this.b.getColor(C0838R.color.oui_b_blue_fg));
            } else {
                OChip.this.setBackgroundColor(this.b.getColor(C0838R.color.oui_fill_element_2));
                Drawable drawable2 = OChip.this.k().getDrawable();
                if (drawable2 != null) {
                    drawable2.setTint(this.b.getColor(C0838R.color.oui_text_3));
                }
                OChip.this.l().setTextColor(this.b.getColor(C0838R.color.oui_text_3));
            }
            return o.a;
        }
    }

    public OChip(Context context) {
        this(context, null, 0);
    }

    public final ImageView k() {
        return this.h;
    }

    public final TextView l() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.k) {
            boolean z = !this.l;
            this.l = z;
            this.m.invoke(this, Boolean.valueOf(z));
        }
        return super.performClick();
    }

    public final void setOnCheckedListener(p<? super OChip, ? super Boolean, o> pVar) {
        l.f(pVar, "l");
        this.m = pVar;
    }

    public final void setOnCloseListener(View.OnClickListener onClickListener) {
        this.j.setOnClickListener(onClickListener);
    }

    public final void setText(CharSequence charSequence) {
        l.f(charSequence, PushLog.KEY_VALUE);
        this.i.setText(charSequence);
    }

    public OChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8);
        int e0;
        Drawable drawable;
        Drawable drawable2;
        l.f(context, "context");
        View inflate = FrameLayout.inflate(context, C0838R.layout.o_chip, this);
        this.f7698g = inflate;
        View findViewById = inflate.findViewById(C0838R.id.chip_icon);
        l.e(findViewById, "parent.findViewById(R.id.chip_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.h = imageView;
        View findViewById2 = inflate.findViewById(C0838R.id.chip_text);
        l.e(findViewById2, "parent.findViewById(R.id.chip_text)");
        TextView textView = (TextView) findViewById2;
        this.i = textView;
        View findViewById3 = inflate.findViewById(C0838R.id.close_icon);
        l.e(findViewById3, "parent.findViewById(R.id.close_icon)");
        ImageView imageView2 = (ImageView) findViewById3;
        this.j = imageView2;
        this.m = new a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.l);
        imageView.setImageDrawable(obtainStyledAttributes.getDrawable(0));
        textView.setText(obtainStyledAttributes.getText(6));
        imageView2.setImageDrawable(obtainStyledAttributes.getDrawable(3));
        int color = obtainStyledAttributes.getColor(1, -1);
        int color2 = obtainStyledAttributes.getColor(4, -1);
        int color3 = obtainStyledAttributes.getColor(7, -1);
        this.k = obtainStyledAttributes.getBoolean(5, false);
        Style style = Style.values()[obtainStyledAttributes.getInt(2, 0)];
        obtainStyledAttributes.recycle();
        if (imageView.getDrawable() != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            marginLayoutParams.setMarginStart(kotlin.t.a.a(TypedValue.applyDimension(1, 4, system.getDisplayMetrics())));
            textView.setLayoutParams(marginLayoutParams);
            imageView.setVisibility(0);
        } else {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            marginLayoutParams2.setMarginStart(kotlin.t.a.a(TypedValue.applyDimension(1, 6, system2.getDisplayMetrics())));
            textView.setLayoutParams(marginLayoutParams2);
            imageView.setVisibility(8);
        }
        if (imageView2.getDrawable() != null) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            Resources system3 = Resources.getSystem();
            l.e(system3, "Resources.getSystem()");
            marginLayoutParams3.setMarginEnd(kotlin.t.a.a(TypedValue.applyDimension(1, 6, system3.getDisplayMetrics())));
            textView.setLayoutParams(marginLayoutParams3);
            imageView2.setVisibility(0);
        } else {
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            Resources system4 = Resources.getSystem();
            l.e(system4, "Resources.getSystem()");
            marginLayoutParams4.setMarginEnd(kotlin.t.a.a(TypedValue.applyDimension(1, 6, system4.getDisplayMetrics())));
            textView.setLayoutParams(marginLayoutParams4);
            imageView2.setVisibility(8);
        }
        if (color != -1 && (drawable2 = imageView.getDrawable()) != null) {
            drawable2.setTint(color);
        }
        if (color2 != -1 && (drawable = imageView2.getDrawable()) != null) {
            drawable.setTint(color2);
        }
        if (color3 != -1) {
            textView.setTextColor(color3);
        }
        int ordinal = style.ordinal();
        if (ordinal == 0) {
            e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 99);
        } else if (ordinal == 1) {
            e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
        } else {
            throw new f();
        }
        setRadius(e0);
    }
}
