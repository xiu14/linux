package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;

/* loaded from: classes.dex */
final class U0 extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ KbdLayoutFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U0(KbdLayoutFragment kbdLayoutFragment) {
        super(1);
        this.a = kbdLayoutFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        int intValue = num.intValue();
        if (intValue == 0) {
            com.bytedance.android.input.fragment.custom_symbol.o.a.h();
            bundle = this.a.f2378c;
            bundle.putInt("LAUNCH_TYPE", 1);
            FragmentActivity activity = this.a.getActivity();
            kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
            SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.CUSTOM_SYMBOL;
            bundle2 = this.a.f2378c;
            ((SettingsActivityNext) activity).switchFragment(fragmentType, bundle2);
        } else if (intValue == 1) {
            com.bytedance.android.input.fragment.custom_symbol.o.a.g();
            bundle3 = this.a.f2378c;
            bundle3.putInt("LAUNCH_TYPE", 2);
            FragmentActivity activity2 = this.a.getActivity();
            kotlin.s.c.l.d(activity2, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
            SettingsActivityNext.FragmentType fragmentType2 = SettingsActivityNext.FragmentType.CUSTOM_SYMBOL;
            bundle4 = this.a.f2378c;
            ((SettingsActivityNext) activity2).switchFragment(fragmentType2, bundle4);
        }
        return kotlin.o.a;
    }
}
