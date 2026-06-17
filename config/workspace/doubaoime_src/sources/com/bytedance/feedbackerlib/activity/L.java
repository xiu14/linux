package com.bytedance.feedbackerlib.activity;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
class L extends ClickableSpan {
    final /* synthetic */ LarkSSOLaunchTransitionActivity a;

    L(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        this.a = larkSSOLaunchTransitionActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        if (com.bytedance.feedbackerlib.a.b0(this.a.getApplicationContext())) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://applink.feishu.cn/client/bot/open?appId=cli_a0bdad723f38500d")));
        } else {
            LarkSSOLaunchTransitionActivity.m(this.a, this.a.a.f("sdk_feedback_toast"));
        }
        if (view instanceof TextView) {
            ((TextView) view).setHighlightColor(this.a.getResources().getColor(R.color.transparent));
        }
    }
}
