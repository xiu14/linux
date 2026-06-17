package com.bytedance.feedbackerlib.activity;

import android.view.View;
import android.widget.Toast;
import com.bytedance.feedbackerlib.activity.RequestOverlayWindowPermissionActivity;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;

/* loaded from: classes.dex */
class M implements View.OnClickListener {
    final /* synthetic */ RequestOverlayWindowPermissionActivity a;

    M(RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity) {
        this.a = requestOverlayWindowPermissionActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RequestOverlayWindowPermissionActivity.State state;
        RequestOverlayWindowPermissionActivity.State state2;
        com.bytedance.feedbackerlib.manager.F f2;
        state = this.a.a;
        if (state == RequestOverlayWindowPermissionActivity.State.ASK) {
            RequestOverlayWindowPermissionActivity.c(this.a);
            return;
        }
        state2 = this.a.a;
        if (state2 == RequestOverlayWindowPermissionActivity.State.CONFIRM) {
            RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity = this.a;
            f2 = requestOverlayWindowPermissionActivity.f4784f;
            Toast.makeText(requestOverlayWindowPermissionActivity, f2.f("sdk34"), 0).show();
            this.a.finish();
            SharedPreferencesUtils.BOOLEAN_CACHE.HAS_DENIED_OVERLAY_PERMISSION.put(true);
            int i = RequestOverlayWindowPermissionActivity.i;
            com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "HAS_DENIED_OVERLAY_PERMISSION set true");
        }
    }
}
