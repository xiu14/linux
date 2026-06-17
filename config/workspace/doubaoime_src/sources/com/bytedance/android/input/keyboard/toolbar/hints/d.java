package com.bytedance.android.input.keyboard.toolbar.hints;

import android.animation.Animator;
import com.bytedance.android.input.r.j;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d extends com.bytedance.android.input.common.u.b {
    d() {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z) {
        l.f(animator, "animation");
        super.onAnimationEnd(animator, z);
        j.i("ImeToolBarHintsLayoutImpl", "show onAnimationEnd");
    }
}
