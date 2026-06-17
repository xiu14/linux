package com.obric.oui.dialog.alert;

import android.animation.Animator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d implements Animator.AnimatorListener {
    final /* synthetic */ b a;

    d(b bVar) {
        this.a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        l.f(animator, "animation");
        this.a.t();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
        this.a.t();
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
