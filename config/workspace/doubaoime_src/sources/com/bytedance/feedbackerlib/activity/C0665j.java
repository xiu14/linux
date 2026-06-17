package com.bytedance.feedbackerlib.activity;

import android.text.TextUtils;
import com.bytedance.feedbackerlib.activity.FeedbackActivity;

/* renamed from: com.bytedance.feedbackerlib.activity.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0665j implements FeedbackActivity.f.a {
    final /* synthetic */ FeedbackActivity a;

    C0665j(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // com.bytedance.feedbackerlib.activity.FeedbackActivity.f.a
    public void a(String str, boolean z) {
        this.a.n0();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.l0();
    }
}
