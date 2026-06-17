package com.obric.oui.sheet;

import android.animation.Animator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b implements Animator.AnimatorListener {
    final /* synthetic */ OInsetSheet a;

    b(OInsetSheet oInsetSheet) {
        this.a = oInsetSheet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        l.f(animator, "animation");
        this.a.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
        this.a.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        l.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        l.f(animator, "animation");
    }
}
