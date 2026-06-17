package com.bytedance.android.input.fragment.message;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    h(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
        this.a.animate().setListener(null);
    }
}
