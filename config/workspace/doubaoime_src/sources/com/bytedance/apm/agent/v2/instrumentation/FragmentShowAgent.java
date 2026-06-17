package com.bytedance.apm.agent.v2.instrumentation;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;

@Keep
/* loaded from: classes.dex */
public class FragmentShowAgent {
    private static final String TAG = "FragmentShowAgent";

    @Keep
    public static void onHiddenChanged(Fragment fragment, boolean z) {
    }

    @Keep
    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint()) {
            fragment.isHidden();
        }
    }

    @Keep
    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint()) {
            fragment.isHidden();
        }
    }

    @Keep
    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed()) {
            fragment.isHidden();
        }
    }
}
