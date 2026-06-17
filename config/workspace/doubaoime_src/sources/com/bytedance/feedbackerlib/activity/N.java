package com.bytedance.feedbackerlib.activity;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
class N implements View.OnClickListener {
    final /* synthetic */ RequestOverlayWindowPermissionActivity a;

    N(RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity) {
        this.a = requestOverlayWindowPermissionActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity = this.a;
        int i = RequestOverlayWindowPermissionActivity.i;
        Objects.requireNonNull(requestOverlayWindowPermissionActivity);
        TranslucentOnePixelActivity.j(requestOverlayWindowPermissionActivity, new O(requestOverlayWindowPermissionActivity));
    }
}
