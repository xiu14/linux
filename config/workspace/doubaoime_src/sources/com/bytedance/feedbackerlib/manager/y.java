package com.bytedance.feedbackerlib.manager;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
class y implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f4846c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f4847d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f4848e;

    y(k kVar, int i, int i2, int i3, int i4) {
        this.f4848e = kVar;
        this.a = i;
        this.b = i2;
        this.f4846c = i3;
        this.f4847d = i4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        LinearLayout linearLayout;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        com.bytedance.feedbackerlib.a.K0(this.f4848e.i, this.a + ((int) (this.b * floatValue)));
        linearLayout = this.f4848e.j;
        linearLayout.setTranslationY((this.f4847d * floatValue) + this.f4846c);
    }
}
