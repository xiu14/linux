package com.bytedance.apm.launch;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.core.ActivityLifeObserver;

/* loaded from: classes.dex */
public class d {

    static class a implements com.bytedance.services.apm.api.d {
        a() {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityCreated(Activity activity, Bundle bundle) {
            System.currentTimeMillis();
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityPause(Activity activity) {
            activity.getComponentName().getClassName();
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityResume(Activity activity) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityStarted(Activity activity) {
            System.currentTimeMillis();
        }

        @Override // com.bytedance.services.apm.api.d
        public void onBackground(Activity activity) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onChange(Activity activity, Fragment fragment) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onFront(Activity activity) {
            activity.getComponentName().getClassName();
        }
    }

    public static void a() {
        e.c();
        ActivityLifeObserver.getInstance().register(new a());
    }
}
