package com.obric.oui.tab;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ OTabLayoutBase a;

    a(OTabLayoutBase oTabLayoutBase) {
        this.a = oTabLayoutBase;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
