package com.bytedance.feedbackerlib.activity;

import android.view.animation.Animation;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
class v implements Animation.AnimationListener {
    final /* synthetic */ FeedbackActivity a;

    v(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        RelativeLayout relativeLayout;
        relativeLayout = this.a.B;
        relativeLayout.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
