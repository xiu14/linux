package com.obric.oui.stepper;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.layout.OUIConstraintLayout;
import com.obric.oui.stepper.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSteppers extends OUIConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    private a f8043g;
    private final OButton h;
    private final OButton i;
    private final EditText j;
    private final ViewGroup k;
    private final ViewGroup l;
    private int m;
    private int n;
    private int o;
    private int p;

    public interface a {
        void a(int i);

        void b();

        void c();

        void d(int i, int i2);

        void e();
    }

    static final class b implements b.a {
        b() {
        }

        @Override // com.obric.oui.stepper.b.a
        public final void a(int i) {
            a p = OSteppers.this.p();
            if (p != null) {
                p.a(i);
            }
        }
    }

    public OSteppers(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.h.setEnabled(this.m < this.o);
        this.h.setClickable(this.m < this.o);
        this.i.setEnabled(this.m > this.n);
        this.i.setClickable(this.m > this.n);
    }

    private final void q() {
        this.j.setText(String.valueOf(this.m), TextView.BufferType.EDITABLE);
        o();
    }

    private final void r() {
        this.j.setFilters(new com.obric.oui.stepper.b[]{new com.obric.oui.stepper.b(this.n, this.o, new b())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        a aVar = this.f8043g;
        if (aVar != null) {
            aVar.d(i, i);
        }
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        this.j.clearFocus();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.layout.OUIConstraintLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final a p() {
        return this.f8043g;
    }

    public final void setMaxValue(int i) {
        this.o = i;
        r();
        q();
        s(Math.min(i, this.m));
    }

    public final void setMinValue(int i) {
        this.n = i;
        r();
        q();
        s(Math.max(i, this.m));
    }

    public final void setOnValueChangeListener(a aVar) {
        this.f8043g = aVar;
    }

    public final void setStepValue(int i) {
        if (this.p <= 0) {
            throw new IllegalArgumentException("step value should be a positive integer");
        }
        this.p = i;
        q();
    }

    public final void setValue(int i) {
        if (i >= this.n && i <= this.o) {
            s(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in [");
        sb.append(this.n);
        sb.append(", ");
        throw new IllegalArgumentException(e.a.a.a.a.D(sb, this.o, "]."));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSteppers(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null, 12);
        l.f(context, "context");
        this.o = 100;
        this.p = 1;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(C0838R.layout.o_widget_steppers, this);
        View findViewById = findViewById(C0838R.id.tv_add);
        l.e(findViewById, "findViewById(R.id.tv_add)");
        OButton oButton = (OButton) findViewById;
        this.h = oButton;
        View findViewById2 = findViewById(C0838R.id.tv_dec);
        l.e(findViewById2, "findViewById(R.id.tv_dec)");
        OButton oButton2 = (OButton) findViewById2;
        this.i = oButton2;
        View findViewById3 = findViewById(C0838R.id.et_counter);
        l.e(findViewById3, "findViewById(R.id.et_counter)");
        EditText editText = (EditText) findViewById3;
        this.j = editText;
        View findViewById4 = findViewById(C0838R.id.increase_container);
        l.e(findViewById4, "findViewById(R.id.increase_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById4;
        this.k = viewGroup;
        View findViewById5 = findViewById(C0838R.id.decrease_container);
        l.e(findViewById5, "findViewById(R.id.decrease_container)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById5;
        this.l = viewGroup2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.H, 0, 0);
        s(obtainStyledAttributes.getInt(3, 0));
        this.n = obtainStyledAttributes.getInt(1, Integer.MIN_VALUE);
        r();
        q();
        this.o = obtainStyledAttributes.getInt(0, Integer.MAX_VALUE);
        r();
        q();
        this.p = obtainStyledAttributes.getInt(2, 1);
        q();
        obtainStyledAttributes.recycle();
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int a2 = kotlin.t.a.a(TypedValue.applyDimension(1, 4, system.getDisplayMetrics()));
        setPadding(a2, a2, a2, a2);
        setRadius(context.getResources().getDimensionPixelSize(C0838R.dimen.oui_r_m2_rect));
        setBackgroundResource(C0838R.color.oui_fill_sunken_variable);
        oButton.setOnClickListener(new com.obric.oui.stepper.a(0, this));
        oButton2.setOnClickListener(new com.obric.oui.stepper.a(1, this));
        viewGroup.setOnClickListener(new com.obric.oui.stepper.a(2, this));
        viewGroup2.setOnClickListener(new com.obric.oui.stepper.a(3, this));
        editText.addTextChangedListener(new c(this));
        q();
    }
}
