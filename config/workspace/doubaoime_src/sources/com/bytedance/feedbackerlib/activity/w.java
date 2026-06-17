package com.bytedance.feedbackerlib.activity;

import android.view.View;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes.dex */
class w implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ FeedbackActivity b;

    w(FeedbackActivity feedbackActivity, AlertDialog alertDialog) {
        this.b = feedbackActivity;
        this.a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.dismiss();
        FeedbackActivity.G(this.b);
        FeedbackActivity.R(this.b);
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }
}
