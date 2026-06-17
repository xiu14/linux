package com.bytedance.android.input.fragment.settings;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
final class K0 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ InputModeFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K0(InputModeFragment inputModeFragment) {
        super(1);
        this.a = inputModeFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        SettingsActivityNext settingsActivityNext;
        kotlin.s.c.l.f(view, "it");
        if (IAppGlobals.a.F()) {
            FragmentActivity activity = this.a.getActivity();
            settingsActivityNext = activity instanceof SettingsActivityNext ? (SettingsActivityNext) activity : null;
            if (settingsActivityNext != null) {
                String string = this.a.getString(C0838R.string.privacy_policy_url_pacific);
                kotlin.s.c.l.e(string, "getString(R.string.privacy_policy_url_pacific)");
                settingsActivityNext.openWebFragment(string, "隐私政策");
            }
        } else {
            FragmentActivity activity2 = this.a.getActivity();
            settingsActivityNext = activity2 instanceof SettingsActivityNext ? (SettingsActivityNext) activity2 : null;
            if (settingsActivityNext != null) {
                settingsActivityNext.openWebFragment("https://lf3-cdn-tos.draftstatic.com/obj/ies-hotsoon-draft/wave_ime/ime_privacy_policy.html", "隐私政策");
            }
        }
        return kotlin.o.a;
    }
}
