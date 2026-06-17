package com.bytedance.feedbackerlib.activity;

import android.view.View;

/* renamed from: com.bytedance.feedbackerlib.activity.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnClickListenerC0667l implements View.OnClickListener {
    final /* synthetic */ FeedbackActivity a;

    ViewOnClickListenerC0667l(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.onBackPressed();
    }
}
