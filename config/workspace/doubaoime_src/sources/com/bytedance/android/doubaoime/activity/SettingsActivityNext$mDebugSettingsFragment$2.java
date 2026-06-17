package com.bytedance.android.doubaoime.activity;

import androidx.fragment.app.Fragment;
import com.bytedance.android.input.environment.api.IProjectMode;

/* loaded from: classes.dex */
final class SettingsActivityNext$mDebugSettingsFragment$2 extends kotlin.s.c.m implements kotlin.s.b.a<Fragment> {
    public static final SettingsActivityNext$mDebugSettingsFragment$2 INSTANCE = new SettingsActivityNext$mDebugSettingsFragment$2();

    SettingsActivityNext$mDebugSettingsFragment$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.s.b.a
    public final Fragment invoke() {
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.feedbackerlib.a.S(kotlin.s.c.A.b(IProjectMode.class));
        if (iProjectMode != null) {
            return iProjectMode.createFragment();
        }
        return null;
    }
}
