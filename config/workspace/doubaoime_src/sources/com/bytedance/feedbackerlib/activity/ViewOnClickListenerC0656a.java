package com.bytedance.feedbackerlib.activity;

import android.view.View;

/* renamed from: com.bytedance.feedbackerlib.activity.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnClickListenerC0656a implements View.OnClickListener {
    final /* synthetic */ DialogActivity a;

    ViewOnClickListenerC0656a(DialogActivity dialogActivity) {
        this.a = dialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.finish();
    }
}
