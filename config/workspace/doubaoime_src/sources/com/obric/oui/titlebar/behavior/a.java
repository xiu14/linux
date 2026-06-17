package com.obric.oui.titlebar.behavior;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.obric.oui.titlebar.OUnitedTitleBar;

/* loaded from: classes2.dex */
class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ OUnitedTitleBar b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BaseBehavior f8149c;

    a(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar) {
        this.f8149c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = oUnitedTitleBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f8149c.setHeaderTopBottomOffset(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
