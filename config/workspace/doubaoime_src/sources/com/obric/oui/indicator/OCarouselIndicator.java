package com.obric.oui.indicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.indicator.OBaseIndicator;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OCarouselIndicator extends OBaseIndicator {
    private IndicatorGroupLayout u;

    @ColorInt
    private int v;
    private final ArgbEvaluator w;

    static final class a implements View.OnClickListener {
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OBaseIndicator.b v;
            if (OCarouselIndicator.this.l()) {
                int i = this.b;
                OBaseIndicator.b v2 = OCarouselIndicator.this.v();
                if (i >= (v2 != null ? v2.getCount() : 0) || (v = OCarouselIndicator.this.v()) == null) {
                    return;
                }
                v.a(this.b, false);
            }
        }
    }

    public static final class b extends c {
        b() {
        }

        @Override // com.obric.oui.indicator.c
        public boolean a() {
            return true;
        }

        @Override // com.obric.oui.indicator.c
        public int b() {
            return OCarouselIndicator.this.f7831g.size();
        }

        @Override // com.obric.oui.indicator.c
        public void d(int i, int i2, float f2) {
            com.obric.oui.indicator.a aVar = OCarouselIndicator.this.f7831g.get(i);
            l.e(aVar, "dots[selectedPosition]");
            com.obric.oui.indicator.a aVar2 = aVar;
            aVar2.setWidth((int) OCarouselIndicator.this.s());
            ArrayList<com.obric.oui.indicator.a> arrayList = OCarouselIndicator.this.f7831g;
            l.f(arrayList, "$this$isInBounds");
            if (i2 >= 0 && arrayList.size() > i2) {
                com.obric.oui.indicator.a aVar3 = OCarouselIndicator.this.f7831g.get(i2);
                l.e(aVar3, "dots[nextPosition]");
                com.obric.oui.indicator.a aVar4 = aVar3;
                aVar4.setWidth((int) OCarouselIndicator.this.s());
                if (OCarouselIndicator.this.J() != OCarouselIndicator.this.m()) {
                    Object evaluate = OCarouselIndicator.this.w.evaluate(f2, Integer.valueOf(OCarouselIndicator.this.J()), Integer.valueOf(OCarouselIndicator.this.m()));
                    Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) evaluate).intValue();
                    Object evaluate2 = OCarouselIndicator.this.w.evaluate(f2, Integer.valueOf(OCarouselIndicator.this.m()), Integer.valueOf(OCarouselIndicator.this.J()));
                    Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                    aVar4.setDotColor(((Integer) evaluate2).intValue());
                    OBaseIndicator.b v = OCarouselIndicator.this.v();
                    if (v == null || i != v.b()) {
                        aVar2.setDotColor(intValue);
                    } else {
                        aVar2.setDotColor(OCarouselIndicator.this.J());
                    }
                }
            }
            OCarouselIndicator.this.invalidate();
        }

        @Override // com.obric.oui.indicator.c
        public void e(int i) {
            OCarouselIndicator.this.f7831g.get(i).setWidth((int) OCarouselIndicator.this.s());
            OCarouselIndicator.this.z(i);
        }
    }

    public OCarouselIndicator(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public void E() {
        if (!t()) {
            H(true);
            return;
        }
        H(false);
        if (y() == 1) {
            IndicatorGroupLayout indicatorGroupLayout = this.u;
            if (indicatorGroupLayout == null) {
                l.l("linearLayout");
                throw null;
            }
            indicatorGroupLayout.setBgColor(getResources().getColor(C0838R.color.carousel_indicator_bg_color, null));
            IndicatorGroupLayout indicatorGroupLayout2 = this.u;
            if (indicatorGroupLayout2 == null) {
                l.l("linearLayout");
                throw null;
            }
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            indicatorGroupLayout2.setCornerRadius(kotlin.t.a.a(TypedValue.applyDimension(1, 100.0f, system.getDisplayMetrics())));
            IndicatorGroupLayout indicatorGroupLayout3 = this.u;
            if (indicatorGroupLayout3 == null) {
                l.l("linearLayout");
                throw null;
            }
            indicatorGroupLayout3.setDrawBackground(true);
        } else {
            IndicatorGroupLayout indicatorGroupLayout4 = this.u;
            if (indicatorGroupLayout4 == null) {
                l.l("linearLayout");
                throw null;
            }
            Context context = getContext();
            l.e(context, "context");
            indicatorGroupLayout4.setBackgroundColor(context.getResources().getColor(C0838R.color.Transparent));
            IndicatorGroupLayout indicatorGroupLayout5 = this.u;
            if (indicatorGroupLayout5 == null) {
                l.l("linearLayout");
                throw null;
            }
            indicatorGroupLayout5.setDrawBackground(false);
        }
        IndicatorGroupLayout indicatorGroupLayout6 = this.u;
        if (indicatorGroupLayout6 == null) {
            l.l("linearLayout");
            throw null;
        }
        indicatorGroupLayout6.setPadding(x(), 0, x(), 0);
        IndicatorGroupLayout indicatorGroupLayout7 = this.u;
        if (indicatorGroupLayout7 == null) {
            l.l("linearLayout");
            throw null;
        }
        if (indicatorGroupLayout7 == null) {
            l.l("linearLayout");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = indicatorGroupLayout7.getLayoutParams();
        layoutParams.height = (int) u();
        indicatorGroupLayout7.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public void F(int i) {
        IndicatorGroupLayout indicatorGroupLayout = this.u;
        if (indicatorGroupLayout == null) {
            l.l("linearLayout");
            throw null;
        }
        if (indicatorGroupLayout == null) {
            l.l("linearLayout");
            throw null;
        }
        indicatorGroupLayout.removeViewAt(indicatorGroupLayout.getChildCount() - 1);
        this.f7831g.remove(r3.size() - 1);
    }

    public final int J() {
        return this.v;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public void i(int i) {
        Context context = getContext();
        l.e(context, "context");
        IndicatorDotView indicatorDotView = new IndicatorDotView(context, null, 0, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) s(), (int) o());
        layoutParams.setMargins((int) p(), 0, (int) p(), 0);
        indicatorDotView.setLayoutParams(layoutParams);
        indicatorDotView.setCornerRadius(n());
        if (isInEditMode()) {
            indicatorDotView.setDotColor(i == 0 ? this.v : m());
        } else {
            OBaseIndicator.b v = v();
            indicatorDotView.setDotColor((v == null || v.b() != i) ? m() : this.v);
        }
        indicatorDotView.setStrokeWidth(r());
        indicatorDotView.setStrokeColor(q());
        indicatorDotView.setOnClickListener(new a(i));
        this.f7831g.add(indicatorDotView);
        IndicatorGroupLayout indicatorGroupLayout = this.u;
        if (indicatorGroupLayout != null) {
            indicatorGroupLayout.addView(indicatorDotView);
        } else {
            l.l("linearLayout");
            throw null;
        }
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public c j() {
        return new b();
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public OBaseIndicator.a k() {
        float m = e.a.a.a.a.m("Resources.getSystem()", 1, 24);
        float m2 = e.a.a.a.a.m("Resources.getSystem()", 1, 4);
        float m3 = e.a.a.a.a.m("Resources.getSystem()", 1, 3);
        int[] iArr = e.i.a.b.b.i;
        l.e(iArr, "R.styleable.OCarouselIndicator");
        return new OBaseIndicator.a(m, m2, m3, iArr, 11, 9, 7, 3, 4, 1, 2, 0, 5, 6);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setSelectedDotColor(int i) {
        if (y() == 1) {
            this.v = (int) 4076863487L;
            B();
        } else if (this.v != i) {
            this.v = i;
            B();
        }
    }

    @Override // com.obric.oui.indicator.OBaseIndicator
    public void z(int i) {
        com.obric.oui.indicator.a aVar = this.f7831g.get(i);
        l.e(aVar, "dots[index]");
        com.obric.oui.indicator.a aVar2 = aVar;
        OBaseIndicator.b v = v();
        l.c(v);
        if (i == v.b()) {
            aVar2.setDotColor(this.v);
        } else {
            aVar2.setDotColor(m());
        }
        aVar2.setCornerRadius(n());
        aVar2.setStrokeWidth(r());
        aVar2.setStrokeColor(q());
        aVar2.invalidate();
    }

    public OCarouselIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCarouselIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.v = ContextCompat.getColor(context, C0838R.color.oui_text_1);
        this.w = new ArgbEvaluator();
        Context context2 = getContext();
        l.e(context2, "context");
        IndicatorGroupLayout indicatorGroupLayout = new IndicatorGroupLayout(context2, null, 0, 6);
        this.u = indicatorGroupLayout;
        indicatorGroupLayout.setOrientation(0);
        IndicatorGroupLayout indicatorGroupLayout2 = this.u;
        if (indicatorGroupLayout2 != null) {
            indicatorGroupLayout2.setGravity(17);
            if (y() == 1) {
                IndicatorGroupLayout indicatorGroupLayout3 = this.u;
                if (indicatorGroupLayout3 != null) {
                    indicatorGroupLayout3.setBgColor(getResources().getColor(C0838R.color.carousel_indicator_bg_color, null));
                    IndicatorGroupLayout indicatorGroupLayout4 = this.u;
                    if (indicatorGroupLayout4 != null) {
                        Resources system = Resources.getSystem();
                        l.e(system, "Resources.getSystem()");
                        indicatorGroupLayout4.setCornerRadius(kotlin.t.a.a(TypedValue.applyDimension(1, 100.0f, system.getDisplayMetrics())));
                        IndicatorGroupLayout indicatorGroupLayout5 = this.u;
                        if (indicatorGroupLayout5 == null) {
                            l.l("linearLayout");
                            throw null;
                        }
                        indicatorGroupLayout5.setDrawBackground(true);
                    } else {
                        l.l("linearLayout");
                        throw null;
                    }
                } else {
                    l.l("linearLayout");
                    throw null;
                }
            } else {
                IndicatorGroupLayout indicatorGroupLayout6 = this.u;
                if (indicatorGroupLayout6 == null) {
                    l.l("linearLayout");
                    throw null;
                }
                indicatorGroupLayout6.setDrawBackground(false);
            }
            IndicatorGroupLayout indicatorGroupLayout7 = this.u;
            if (indicatorGroupLayout7 != null) {
                indicatorGroupLayout7.setPadding(x(), 0, x(), 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) u());
                IndicatorGroupLayout indicatorGroupLayout8 = this.u;
                if (indicatorGroupLayout8 != null) {
                    addView(indicatorGroupLayout8, layoutParams);
                    if (attributeSet != null) {
                        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k().m());
                        l.e(obtainStyledAttributes, "context.obtainStyledAttr…ttrs, custom.styleableId)");
                        setSelectedDotColor(obtainStyledAttributes.getColor(10, m()));
                        obtainStyledAttributes.recycle();
                    }
                    if (isInEditMode()) {
                        int size = this.f7831g.size();
                        for (int i2 = 0; i2 < 5; i2++) {
                            i(i2 + size);
                        }
                        A();
                    }
                    G();
                    return;
                }
                l.l("linearLayout");
                throw null;
            }
            l.l("linearLayout");
            throw null;
        }
        l.l("linearLayout");
        throw null;
    }
}
