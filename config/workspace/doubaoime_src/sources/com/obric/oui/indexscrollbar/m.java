package com.obric.oui.indexscrollbar;

import android.animation.Animator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m implements Animator.AnimatorListener {
    final /* synthetic */ OIndexScrollbar a;

    m(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        kotlin.s.c.l.f(animator, "arg0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        kotlin.s.c.l.f(animator, "arg0");
        OIndexScrollbar oIndexScrollbar = this.a;
        int i = OIndexScrollbar.j0;
        Objects.requireNonNull(oIndexScrollbar);
        OIndexScrollbar.t(this.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.s.c.l.f(animator, "arg0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        kotlin.s.c.l.f(animator, "arg0");
        OIndexScrollbar oIndexScrollbar = this.a;
        int i = OIndexScrollbar.j0;
        Objects.requireNonNull(oIndexScrollbar);
        this.a.J(true);
    }
}
