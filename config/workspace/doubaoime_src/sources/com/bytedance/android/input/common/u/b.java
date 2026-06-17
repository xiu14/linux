package com.bytedance.android.input.common.u;

import android.animation.Animator;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class b implements Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        l.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
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
