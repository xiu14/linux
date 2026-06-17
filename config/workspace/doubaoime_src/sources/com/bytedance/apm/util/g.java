package com.bytedance.apm.util;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
final class g implements com.bytedance.services.apm.api.d {
    g() {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        h.a(activity);
    }
}
