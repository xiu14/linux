package com.bytedance.feedbackerlib.activity;

import android.widget.Toast;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.activity.RequestOverlayWindowPermissionActivity;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;

/* loaded from: classes.dex */
class O implements TranslucentOnePixelActivity.a {
    final /* synthetic */ RequestOverlayWindowPermissionActivity a;

    O(RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity) {
        this.a = requestOverlayWindowPermissionActivity;
    }

    @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.a
    public void a(boolean z) {
        RequestOverlayWindowPermissionActivity.State state;
        RequestOverlayWindowPermissionActivity.State state2;
        com.bytedance.feedbackerlib.manager.F f2;
        if (z) {
            Feedbacker.showFeedbackFloatWindow();
            this.a.finish();
            return;
        }
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
        }
    }
}
