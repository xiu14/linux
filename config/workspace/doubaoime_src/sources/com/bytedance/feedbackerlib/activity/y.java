package com.bytedance.feedbackerlib.activity;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
class y extends ClickableSpan {
    final /* synthetic */ FeedbackActivity a;

    y(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        if (com.bytedance.feedbackerlib.a.b0(this.a.getApplicationContext())) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://applink.feishu.cn/client/bot/open?appId=cli_a0bdad723f38500d")));
        } else {
            FeedbackActivity.P(this.a, this.a.f4765d.f("sdk_feedback_toast"));
        }
        if (view instanceof TextView) {
            ((TextView) view).setHighlightColor(this.a.getResources().getColor(R.color.transparent));
        }
    }
}
