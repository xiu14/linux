package com.bytedance.feedbackerlib.activity;

import android.view.View;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes.dex */
class q implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ View.OnClickListener b;

    q(FeedbackActivity feedbackActivity, AlertDialog alertDialog, View.OnClickListener onClickListener) {
        this.a = alertDialog;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.dismiss();
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
