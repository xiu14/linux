package com.bytedance.feedbackerlib.activity;

/* renamed from: com.bytedance.feedbackerlib.activity.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC0670o implements Runnable {
    final /* synthetic */ FeedbackActivity a;

    RunnableC0670o(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b = true;
    }
}
