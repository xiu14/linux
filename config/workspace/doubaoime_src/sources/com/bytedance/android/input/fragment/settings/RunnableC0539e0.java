package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.databinding.FragmentSettingsMainBinding;

/* renamed from: com.bytedance.android.input.fragment.settings.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0539e0 implements Runnable {
    public final /* synthetic */ MainFragment a;

    public /* synthetic */ RunnableC0539e0(MainFragment mainFragment) {
        this.a = mainFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentSettingsMainBinding fragmentSettingsMainBinding;
        MainFragment mainFragment = this.a;
        kotlin.s.c.l.f(mainFragment, "this$0");
        fragmentSettingsMainBinding = mainFragment.b;
        if (fragmentSettingsMainBinding != null) {
            fragmentSettingsMainBinding.j.c(com.bytedance.android.input.fragment.message.data.f.a.r());
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }
}
