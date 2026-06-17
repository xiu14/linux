package com.bytedance.feedbackerlib.manager;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;

/* renamed from: com.bytedance.feedbackerlib.manager.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0672b implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f4814c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f4815d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f4816e;

    C0672b(k kVar, int i, int i2, int i3, int i4) {
        this.f4816e = kVar;
        this.a = i;
        this.b = i2;
        this.f4814c = i3;
        this.f4815d = i4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        LinearLayout linearLayout;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        com.bytedance.feedbackerlib.a.K0(this.f4816e.i, this.a + ((int) (this.b * floatValue)));
        linearLayout = this.f4816e.j;
        linearLayout.setTranslationY((this.f4815d * floatValue) + this.f4814c);
    }
}
