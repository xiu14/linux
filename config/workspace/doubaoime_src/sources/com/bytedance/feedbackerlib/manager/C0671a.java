package com.bytedance.feedbackerlib.manager;

import android.animation.Animator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* renamed from: com.bytedance.feedbackerlib.manager.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0671a implements Animator.AnimatorListener {
    final /* synthetic */ int a;
    final /* synthetic */ k b;

    C0671a(k kVar, int i) {
        this.b = kVar;
        this.a = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        F f2;
        ImageView imageView;
        ImageView imageView2;
        this.b.V = 1;
        this.b.S = false;
        this.b.N0();
        textView = this.b.u;
        f2 = this.b.f4821f;
        textView.setText(f2.f("packUp"));
        if (this.a == 0) {
            imageView2 = this.b.F;
            imageView2.setImageResource(C0838R.drawable.feedbacker_float_window_down_hide);
        } else {
            imageView = this.b.F;
            imageView.setImageResource(C0838R.drawable.feedback_float_window_up_hide);
        }
        this.b.O0(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
