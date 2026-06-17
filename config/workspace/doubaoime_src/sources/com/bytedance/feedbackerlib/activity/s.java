package com.bytedance.feedbackerlib.activity;

import android.view.animation.Animation;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
class s implements Animation.AnimationListener {
    final /* synthetic */ FeedbackActivity a;

    s(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        RelativeLayout relativeLayout;
        relativeLayout = this.a.y;
        relativeLayout.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
