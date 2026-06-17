package com.bytedance.android.input.keyboard.handwriting;

import android.animation.Animator;
import android.view.View;
import com.bytedance.android.doubaoime.KeyboardJni;

/* loaded from: classes.dex */
public final class q implements Animator.AnimatorListener {
    final /* synthetic */ View a;

    q(View view) {
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        kotlin.s.c.l.f(animator, "animation");
        this.a.setVisibility(8);
        KeyboardJni.getKeyboardJni().setToolbarToastMode(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        kotlin.s.c.l.f(animator, "animation");
        this.a.setVisibility(8);
        KeyboardJni.getKeyboardJni().setToolbarToastMode(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.s.c.l.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        kotlin.s.c.l.f(animator, "animation");
    }
}
