package com.bytedance.feedbackerlib.activity;

import android.view.View;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;

/* renamed from: com.bytedance.feedbackerlib.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnClickListenerC0657b implements View.OnClickListener {
    final /* synthetic */ DialogActivity a;

    ViewOnClickListenerC0657b(DialogActivity dialogActivity) {
        this.a = dialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SharedPreferencesUtils.BOOLEAN_CACHE.HIDE_FLOAT_WINDOW.put(true);
        FloatWindowService.o(this.a.getApplicationContext());
        this.a.finish();
    }
}
