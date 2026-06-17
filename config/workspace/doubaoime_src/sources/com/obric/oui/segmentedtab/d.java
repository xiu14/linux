package com.obric.oui.segmentedtab;

import android.animation.ValueAnimator;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class d implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ OTouchAnimView a;

    d(OTouchAnimView oTouchAnimView) {
        this.a = oTouchAnimView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        l.f(valueAnimator, "animator");
        OTouchAnimView oTouchAnimView = this.a;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oTouchAnimView.a = ((Float) animatedValue).floatValue();
        OTouchAnimView oTouchAnimView2 = this.a;
        f2 = oTouchAnimView2.a;
        oTouchAnimView2.f(f2, "release_anim");
    }
}
