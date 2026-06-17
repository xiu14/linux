package com.bytedance.feedbackerlib.activity;

import android.view.animation.Animation;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
class I implements Animation.AnimationListener {
    final /* synthetic */ LarkSSOLaunchTransitionActivity a;

    I(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        this.a = larkSSOLaunchTransitionActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        RelativeLayout relativeLayout;
        relativeLayout = this.a.k;
        relativeLayout.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
