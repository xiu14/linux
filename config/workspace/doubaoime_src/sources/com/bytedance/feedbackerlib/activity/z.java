package com.bytedance.feedbackerlib.activity;

import android.view.View;

/* loaded from: classes.dex */
class z implements View.OnClickListener {
    final /* synthetic */ FeedbackActivity a;

    z(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        FeedbackActivity.R(this.a);
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }
}
