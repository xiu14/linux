package com.bytedance.android.input.fragment.settings;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;

/* loaded from: classes.dex */
final class I0 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ InputModeFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(InputModeFragment inputModeFragment) {
        super(1);
        this.a = inputModeFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        FragmentActivity activity = this.a.getActivity();
        SettingsActivityNext settingsActivityNext = activity instanceof SettingsActivityNext ? (SettingsActivityNext) activity : null;
        if (settingsActivityNext != null) {
            settingsActivityNext.openWebFragment("https://lf3-cdn-tos.draftstatic.com/obj/ies-hotsoon-draft/wave_ime/ime_privacy_three_part.html", "第三方信息共享清单");
        }
        return kotlin.o.a;
    }
}
