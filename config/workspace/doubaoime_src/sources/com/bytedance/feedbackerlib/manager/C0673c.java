package com.bytedance.feedbackerlib.manager;

import android.animation.Animator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* renamed from: com.bytedance.feedbackerlib.manager.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0673c implements Animator.AnimatorListener {
    final /* synthetic */ k a;

    C0673c(k kVar) {
        this.a = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        F f2;
        ImageView imageView;
        this.a.V = 0;
        this.a.S = false;
        this.a.N0();
        textView = this.a.u;
        f2 = this.a.f4821f;
        textView.setText(f2.f("sdk2"));
        imageView = this.a.F;
        imageView.setImageResource(C0838R.drawable.feedbacker_float_window_initial);
        this.a.O0(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
