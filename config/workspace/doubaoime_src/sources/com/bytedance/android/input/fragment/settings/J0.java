package com.bytedance.android.input.fragment.settings;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
final class J0 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ InputModeFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J0(InputModeFragment inputModeFragment) {
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
                String string = this.a.getString(C0838R.string.user_terms_url_pacific);
                kotlin.s.c.l.e(string, "getString(R.string.user_terms_url_pacific)");
                settingsActivityNext.openWebFragment(string, "用户协议");
            }
        } else {
            FragmentActivity activity2 = this.a.getActivity();
            settingsActivityNext = activity2 instanceof SettingsActivityNext ? (SettingsActivityNext) activity2 : null;
            if (settingsActivityNext != null) {
                settingsActivityNext.openWebFragment("https://lf3-cdn-tos.draftstatic.com/obj/ies-hotsoon-draft/wave_ime/ime_privacy_user_agreement.html", "用户协议");
            }
        }
        return kotlin.o.a;
    }
}
