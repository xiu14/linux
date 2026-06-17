package com.bytedance.feedbackerlib.activity;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: com.bytedance.feedbackerlib.activity.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0669n extends ClickableSpan {
    final /* synthetic */ FeedbackActivity a;

    C0669n(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        if (com.bytedance.feedbackerlib.a.b0(this.a.getApplicationContext())) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://applink.feishu.cn/client/bot/open?appId=cli_a0bdad723f38500d")));
        } else {
            FeedbackActivity.b0(this.a, this.a.f4765d.f("sdk_feedback_toast"));
        }
        if (view instanceof TextView) {
            ((TextView) view).setHighlightColor(this.a.getResources().getColor(R.color.transparent));
        }
    }
}
