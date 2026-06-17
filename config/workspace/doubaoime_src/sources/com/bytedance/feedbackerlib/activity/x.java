package com.bytedance.feedbackerlib.activity;

import android.view.View;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes.dex */
class x implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;

    x(FeedbackActivity feedbackActivity, AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.dismiss();
    }
}
