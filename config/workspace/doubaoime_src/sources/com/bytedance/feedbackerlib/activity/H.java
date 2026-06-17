package com.bytedance.feedbackerlib.activity;

import android.os.Message;
import android.view.animation.Animation;

/* loaded from: classes.dex */
class H implements Animation.AnimationListener {
    final /* synthetic */ long a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LarkSSOLaunchTransitionActivity f4774c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            H h = H.this;
            LarkSSOLaunchTransitionActivity.s(h.f4774c, h.a);
        }
    }

    H(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, long j, long j2) {
        this.f4774c = larkSSOLaunchTransitionActivity;
        this.a = j;
        this.b = j2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        LarkSSOLaunchTransitionActivity.o.removeMessages(1024);
        Message obtain = Message.obtain(LarkSSOLaunchTransitionActivity.o, new a());
        obtain.what = 1024;
        LarkSSOLaunchTransitionActivity.o.sendMessageDelayed(obtain, this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
