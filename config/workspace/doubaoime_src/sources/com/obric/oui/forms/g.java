package com.obric.oui.forms;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.obric.oui.forms.OInputView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class g extends AnimatorListenerAdapter {
    final /* synthetic */ OInputView a;
    final /* synthetic */ TextView b;

    g(OInputView oInputView, TextView textView) {
        this.a = oInputView;
        this.b = textView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        l.f(animator, "animation");
        if (this.a.C().hasFocus()) {
            this.a.K(OInputView.LabelUIState.REAL_LABEL_SHOW, this.b, "LabelShowAnim, onAnimationCancel");
        } else {
            this.a.K(OInputView.LabelUIState.FAKE_LABEL_SHOW, this.b, "LabelShowAnim, onAnimationCancel");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l.f(animator, "animation");
        if (this.a.C().hasFocus()) {
            this.a.K(OInputView.LabelUIState.REAL_LABEL_SHOW, this.b, "LabelShowAnim, onAnimationCancel");
        } else {
            this.a.K(OInputView.LabelUIState.FAKE_LABEL_SHOW, this.b, "LabelShowAnim, onAnimationCancel");
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator, boolean z) {
        l.f(animator, "animation");
        this.a.K(OInputView.LabelUIState.FAKE_LABEL_SHOW, this.b, "LabelShowAnim, onAnimationStart");
    }
}
