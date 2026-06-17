package com.bytedance.feedbackerlib.activity;

import android.view.View;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes.dex */
class t implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;

    t(FeedbackActivity feedbackActivity, AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.dismiss();
    }
}
