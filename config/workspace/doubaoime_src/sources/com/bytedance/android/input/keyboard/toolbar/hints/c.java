package com.bytedance.android.input.keyboard.toolbar.hints;

import android.animation.Animator;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c extends com.bytedance.android.input.common.u.b {
    c() {
    }

    @Override // com.bytedance.android.input.common.u.b, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        l.f(animator, "animation");
        l.f(animator, "animation");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.HINTS, null, 2, null);
        }
    }

    @Override // com.bytedance.android.input.common.u.b, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
        l.f(animator, "animation");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.HINTS, null, 2, null);
        }
    }
}
