package com.obric.oui.titlebar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.obric.oui.titlebar.OUnitedTitleBar;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ OUnitedTitleBar.Behavior a;
    final /* synthetic */ CoordinatorLayout b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OUnitedTitleBar f8133c;

    a(OUnitedTitleBar.Behavior behavior, CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar) {
        this.a = behavior;
        this.b = coordinatorLayout;
        this.f8133c = oUnitedTitleBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l.f(valueAnimator, "animation");
        OUnitedTitleBar.Behavior behavior = this.a;
        CoordinatorLayout coordinatorLayout = this.b;
        OUnitedTitleBar oUnitedTitleBar = this.f8133c;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        behavior.setHeaderTopBottomOffset(coordinatorLayout, oUnitedTitleBar, ((Integer) animatedValue).intValue());
    }
}
