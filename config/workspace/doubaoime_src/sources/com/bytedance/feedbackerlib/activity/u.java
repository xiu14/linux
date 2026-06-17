package com.bytedance.feedbackerlib.activity;

import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;

/* loaded from: classes.dex */
class u implements Animation.AnimationListener {
    final /* synthetic */ long a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FeedbackActivity f4794c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVar = u.this;
            FeedbackActivity.N(uVar.f4794c, uVar.a);
        }
    }

    u(FeedbackActivity feedbackActivity, long j, long j2) {
        this.f4794c = feedbackActivity;
        this.a = j;
        this.b = j2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        handler = FeedbackActivity.S;
        handler.removeMessages(1024);
        handler2 = FeedbackActivity.S;
        Message obtain = Message.obtain(handler2, new a());
        obtain.what = 1024;
        handler3 = FeedbackActivity.S;
        handler3.sendMessageDelayed(obtain, this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
