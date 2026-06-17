package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;

/* loaded from: classes.dex */
final class D0 extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ GuideSettingsStep2Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D0(GuideSettingsStep2Fragment guideSettingsStep2Fragment) {
        super(1);
        this.a = guideSettingsStep2Fragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        int intValue = num.intValue();
        String string = this.a.getString(C0838R.string.key26_number_symbol_key_style);
        kotlin.s.c.l.e(string, "getString(R.string.key26_number_symbol_key_style)");
        KeyboardJni.updateSettingsValue(string, intValue);
        com.bytedance.android.input.r.j.i("BaseSettingsFragment", "Setting '" + string + "' updated to value: " + intValue);
        return kotlin.o.a;
    }
}
