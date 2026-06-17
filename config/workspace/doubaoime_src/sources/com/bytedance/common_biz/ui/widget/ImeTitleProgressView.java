package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.List;
import kotlin.o;
import kotlin.s.b.q;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeTitleProgressView extends LinearLayout {
    private TextView a;
    private SwitchCompat b;

    /* renamed from: c, reason: collision with root package name */
    private ImeStepSlider f4379c;

    /* renamed from: d, reason: collision with root package name */
    private ImeStepSlider f4380d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f4381e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleProgressView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public static /* synthetic */ void setCurrentStep$default(ImeTitleProgressView imeTitleProgressView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        imeTitleProgressView.setCurrentStep(i, z);
    }

    public final ImeStepSlider a() {
        return this.f4380d;
    }

    public final ImeStepSlider b() {
        return this.f4379c;
    }

    public final SwitchCompat c() {
        return this.b;
    }

    public final void setCurrentStep(int i, boolean z) {
        ImeStepSlider.e(this.f4379c, i, z, false, 4);
    }

    public final void setOnStepChangedListener(q<? super Integer, ? super String, ? super Boolean, o> qVar) {
        l.f(qVar, "listener");
        this.f4379c.setOnStepChangedListener(qVar);
    }

    public final void setStepShow(boolean z) {
        if (z) {
            e.b.d.a.a.e.h(this.f4379c);
        } else {
            e.b.d.a.a.e.e(this.f4379c);
        }
    }

    public final void setStepsList(List<String> list) {
        l.f(list, "steps");
        this.f4379c.setSteps(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeTitleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        setOrientation(1);
        LayoutInflater.from(context).inflate(C0838R.layout.ime_title_progress_view, (ViewGroup) this, true);
        View findViewById = findViewById(C0838R.id.progress_item_title);
        l.e(findViewById, "findViewById(R.id.progress_item_title)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.progress_item_switch);
        l.e(findViewById2, "findViewById(R.id.progress_item_switch)");
        this.b = (SwitchCompat) findViewById2;
        View findViewById3 = findViewById(C0838R.id.progress_item_step);
        l.e(findViewById3, "findViewById(R.id.progress_item_step)");
        this.f4379c = (ImeStepSlider) findViewById3;
        View findViewById4 = findViewById(C0838R.id.progress_item_bar);
        l.e(findViewById4, "findViewById(R.id.progress_item_bar)");
        this.f4380d = (ImeStepSlider) findViewById4;
        View findViewById5 = findViewById(C0838R.id.progress_root);
        l.e(findViewById5, "findViewById(R.id.progress_root)");
        this.f4381e = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(C0838R.id.progress_item_top_container);
        l.e(findViewById6, "findViewById(R.id.progress_item_top_container)");
        this.b.setHapticFeedbackEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.l);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…ble.ImeTitleProgressView)");
        this.a.setText(obtainStyledAttributes.getString(2));
        int i2 = obtainStyledAttributes.getInt(0, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_13);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_16);
        getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_21_5);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_20);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_22);
        if (i2 == 0) {
            this.b.setVisibility(8);
            this.f4381e.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
        } else {
            this.b.setVisibility(0);
            this.f4381e.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize4);
            if (i3 == 0) {
                ViewGroup.LayoutParams layoutParams = this.f4379c.getLayoutParams();
                l.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize2;
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f4380d.getLayoutParams();
                l.d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize2;
            }
            this.b.setChecked(obtainStyledAttributes.getBoolean(1, false));
        }
        if (i3 == 0) {
            this.f4379c.setVisibility(0);
            this.f4380d.setVisibility(8);
        } else {
            this.f4379c.setVisibility(8);
            this.f4380d.setVisibility(0);
        }
        obtainStyledAttributes.recycle();
    }
}
