package com.obric.oui.slider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.slider.TickMarkSeekBar;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public class OSlider extends ConstraintLayout {
    public static final /* synthetic */ int p = 0;
    private final SeekBarFloatCompat a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f8023c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f8024d;

    /* renamed from: e, reason: collision with root package name */
    private float f8025e;

    /* renamed from: f, reason: collision with root package name */
    private float f8026f;

    /* renamed from: g, reason: collision with root package name */
    private TickMarkSeekBar.a f8027g;
    private int h;
    private SliderSize i;
    private Drawable j;
    private int k;
    private int l;
    private Drawable m;
    private boolean n;
    private int o;

    public enum SliderSize {
        SMALL,
        MEDIUM,
        LARGE;

        public static final a Companion = new a(null);

        public static final class a {
            public a(g gVar) {
            }
        }
    }

    public OSlider(Context context) {
        this(context, null, 0, 0, 14);
    }

    public OSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public OSlider(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OSlider(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.slider.OSlider.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    public static final void g(OSlider oSlider, float f2) {
        oSlider.b.setText(String.valueOf((int) oSlider.k(f2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float k(float f2) {
        float f3 = this.f8025e;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(e.a.a.a.a.a(this.f8026f, f3, (f2 - 0.0f) / 100.0f, f3))}, 1));
        l.e(format, "format(this, *args)");
        return Float.parseFloat(format);
    }

    public static /* synthetic */ void setSeekBarHeight$default(OSlider oSlider, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSeekBarHeight");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        oSlider.setSeekBarHeight(i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            TypedValue.applyDimension(1, 5, system.getDisplayMetrics());
        }
    }

    public final void setAdsorptionPercent(float f2) {
    }

    public final void setAutoAdjustSeekbarMargin(boolean z) {
        this.n = z;
    }

    public final void setDefaultMargin(int i) {
        this.a.setDefaultMargin(i);
    }

    public final void setDefaultTickMarkCount(int i) {
        this.a.setDefaultTickMarkCount(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.f8023c.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        this.a.setHapticFeedbackEnabled(z);
    }

    public final void setIsAlwaysLight(boolean z) {
        if (z) {
            this.b.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.TextReverse));
        } else {
            this.b.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.TextPrimary));
        }
        this.a.setIsAlwaysLight(z);
    }

    public final void setIsAlwaysNight(boolean z) {
        if (z) {
            this.b.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.ConstTextInverse));
        } else {
            this.b.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.TextPrimary));
        }
        this.a.setIsAlwaysNight(z);
    }

    public final void setIsSegmented(boolean z) {
        setIsSegmented(z, 0, 0);
    }

    public final void setLeftIcon(Drawable drawable) {
        l.f(drawable, "drawable");
        this.f8023c.setImageDrawable(drawable);
    }

    public final void setLeftImage(Drawable drawable) {
        this.j = drawable;
    }

    public final void setLeftImageMargin(int i) {
        this.k = i;
    }

    public final void setMaxValue(float f2) {
        Log.d("OSlider", "setMaxValue >>> " + f2);
        this.f8026f = f2;
        this.a.setMinValue(0.0f);
        this.a.setMaxValue(100.0f);
    }

    public final void setMinValue(float f2) {
        Log.d("OSlider", "setMinValue >>> " + f2);
        this.f8025e = f2;
        this.a.setMinValue(0.0f);
        this.a.setMaxValue(100.0f);
    }

    public final void setOnSeekBarChangeListenerExt(TickMarkSeekBar.a aVar) {
        this.f8027g = aVar;
    }

    public final void setProcessColor(int i, int i2) {
        this.a.setProcessColor(i, i2);
    }

    public final void setProcessImageIcon(Drawable drawable) {
        l.f(drawable, "imageicon");
        this.a.setImageIcon(drawable);
    }

    public final void setProcessImageIconVisibility(boolean z) {
        this.a.setProcessImageIconVisibility(z);
    }

    public final void setProgress(float f2) {
        SeekBarFloatCompat seekBarFloatCompat = this.a;
        float f3 = this.f8025e;
        seekBarFloatCompat.setProgress((((f2 - f3) / (this.f8026f - f3)) * 100.0f) + 0.0f);
    }

    public final void setRightIcon(Drawable drawable) {
        l.f(drawable, "drawable");
        this.f8024d.setImageDrawable(drawable);
    }

    public final void setRightImage(Drawable drawable) {
        this.m = drawable;
    }

    public final void setRightImageMargin(int i) {
        this.l = i;
    }

    public final void setSeekBarHeight(int i, int i2) {
        this.a.setDefaultBackgroudHeight(i, i2);
    }

    public final void setSeekBarMargin(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(i);
        layoutParams2.setMarginEnd(i2);
        this.a.setLayoutParams(layoutParams2);
    }

    public final void setThumbColor(int i) {
        this.a.setThumbColor(i);
    }

    public final void setThumbDefaultHeight(int i, int i2) {
        Drawable thumb = this.a.getThumb();
        Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
        ((f) thumb).a(i, i2);
    }

    public final void setThumbDefaultWidth(int i) {
        Drawable thumb = this.a.getThumb();
        Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
        ((f) thumb).b(i);
    }

    public final void setIsSegmented(boolean z, int i, int i2) {
        this.a.setIsSegmented(z, i, i2);
        if (z) {
            return;
        }
        float f2 = 100;
        String format = String.format(Locale.CHINA, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.a.getProgress() / f2)}, 1));
        l.e(format, "format(locale, this, *args)");
        this.a.getProgressDrawable().setLevel((int) (Float.parseFloat(format) * f2));
    }

    public final void setProgress(float f2, boolean z) {
        SeekBarFloatCompat seekBarFloatCompat = this.a;
        float f3 = this.f8025e;
        seekBarFloatCompat.setProgress((((f2 - f3) / (this.f8026f - f3)) * 100.0f) + 0.0f, z);
    }
}
