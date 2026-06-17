package com.obric.oui.checkbox;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bytedance.android.doubaoime.C0838R;
import e.i.b.f.c;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OCheckBox extends AppCompatImageView implements Checkable {
    private static final int[] q = {R.attr.state_checked};
    private static final int[] r = {C0838R.attr.oui_state_indeterminate};
    private Drawable a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7691c;

    /* renamed from: d, reason: collision with root package name */
    private int f7692d;

    /* renamed from: e, reason: collision with root package name */
    private int f7693e;

    /* renamed from: f, reason: collision with root package name */
    private int f7694f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7695g;
    private boolean h;
    private ColorFilter i;
    private ColorFilter j;
    private b k;
    private a l;
    private int m;
    private int n;
    private int o;
    private boolean p;

    public interface a {
        void a(OCheckBox oCheckBox, boolean z);
    }

    public interface b {
        void a(OCheckBox oCheckBox, int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCheckBox(Context context) {
        super(context);
        l.f(context, "context");
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = true;
        h(context, null, C0838R.attr.OCheckBoxStyle);
    }

    private final void g() {
        if (this.n != -1) {
            this.i = new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, Color.red(r0), 0.0f, 1.0f, 0.0f, 0.0f, Color.green(r0), 0.0f, 0.0f, 1.0f, 0.0f, Color.blue(r0), 0.0f, 0.0f, 0.0f, (Color.alpha(r0) * 1.0f) / 255, 0.0f});
        }
        if (this.o != -1) {
            this.j = new PorterDuffColorFilter(this.o, PorterDuff.Mode.SRC_IN);
        }
    }

    private final void h(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.k, i, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…heckBox, defStyleAttr, 0)");
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.f7691c = obtainStyledAttributes.getInt(7, 0);
        this.f7692d = obtainStyledAttributes.getInt(4, 0);
        this.p = obtainStyledAttributes.getBoolean(0, true);
        this.m = obtainStyledAttributes.getColor(5, -1);
        this.n = obtainStyledAttributes.getColor(3, -1);
        this.o = obtainStyledAttributes.getColor(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable == null) {
            drawable = null;
        }
        this.a = drawable;
        this.h = obtainStyledAttributes.getBoolean(1, false);
        if (obtainStyledAttributes.hasValue(9)) {
            setCheckedState(obtainStyledAttributes.getInt(9, 0));
        }
        obtainStyledAttributes.recycle();
        g();
        Drawable drawable2 = this.a;
        if (drawable2 == null) {
            setShape(this.b);
        } else {
            setImageDrawable(drawable2);
        }
        setSize(this.f7691c);
        setBackground(null);
        i();
        setClickable(true);
    }

    private final void i() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
        g();
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.setColorFilter(isChecked() ? this.i : this.j);
        }
    }

    private final void j() {
        int i = this.b;
        Drawable drawable = (i == 0 && this.h) ? getResources().getDrawable(C0838R.drawable.o_checkbox_circle_always_light) : (i != 0 || this.h) ? (i == 0 || !this.h) ? (i == 0 || this.h) ? getResources().getDrawable(C0838R.drawable.o_checkbox_circle) : getResources().getDrawable(C0838R.drawable.o_checkbox_square) : getResources().getDrawable(C0838R.drawable.o_checkbox_square_always_light) : this.f7692d != 1 ? getResources().getDrawable(C0838R.drawable.o_checkbox_circle) : getResources().getDrawable(C0838R.drawable.o_checkbox_circle_on_image);
        this.a = drawable;
        int i2 = this.m;
        if (i2 != -1 && (drawable instanceof StateListDrawable) && Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            c.b((StateListDrawable) drawable, "primary_shape", i2);
        }
        setImageDrawable(this.a);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7694f == 1;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.p) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            com.obric.oui.common.util.b.a(this, kotlin.t.a.a(TypedValue.applyDimension(1, 44, system.getDisplayMetrics())));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f7694f == 2) {
            ImageView.mergeDrawableStates(onCreateDrawableState, r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f7693e;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
        }
        int i4 = this.f7693e;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        if (isChecked()) {
            e.i.b.d.a.a(getContext(), 1);
        }
        return performClick;
    }

    public final void setAlwaysLight(boolean z) {
        this.h = z;
        j();
        invalidate();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public final void setCheckedState(int i) {
        a aVar;
        if (this.f7694f != i) {
            this.f7694f = i;
            i();
            refreshDrawableState();
            if (this.f7695g) {
                return;
            }
            this.f7695g = true;
            b bVar = this.k;
            if (bVar != null) {
                bVar.a(this, this.f7694f);
            }
            if (this.f7694f != 2 && (aVar = this.l) != null) {
                aVar.a(this, isChecked());
            }
            this.f7695g = false;
        }
    }

    public final void setOnCheckedChangeListener(a aVar) {
        this.l = aVar;
    }

    public final void setOnCheckedStateChangedListener(b bVar) {
        this.k = bVar;
    }

    public final void setPrimaryColor(@ColorInt int i) {
        this.m = i;
        j();
        invalidate();
    }

    public final void setShape(int i) {
        this.b = i;
        j();
        invalidate();
    }

    public final void setSize(int i) {
        this.f7691c = i;
        this.f7693e = i == 0 ? e.a.a.a.a.e0("Resources.getSystem()", 1, 18) : e.a.a.a.a.e0("Resources.getSystem()", 1, 24);
        requestLayout();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = true;
        h(context, attributeSet, C0838R.attr.OCheckBoxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = true;
        h(context, attributeSet, i);
    }
}
