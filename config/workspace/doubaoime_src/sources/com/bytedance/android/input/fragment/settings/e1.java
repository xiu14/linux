package com.bytedance.android.input.fragment.settings;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentSettingsMainBinding;
import com.obric.oui.toast.a;

/* loaded from: classes.dex */
final class e1 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ MainFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e1(MainFragment mainFragment) {
        super(1);
        this.a = mainFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        FragmentSettingsMainBinding fragmentSettingsMainBinding;
        FragmentActivity activity;
        kotlin.s.c.l.f(view, "it");
        fragmentSettingsMainBinding = this.a.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        if (!fragmentSettingsMainBinding.b.isEnabled() && (activity = this.a.getActivity()) != null) {
            MainFragment mainFragment = this.a;
            a.C0363a c0363a = com.obric.oui.toast.a.p;
            String string = mainFragment.getString(C0838R.string.toast_tip_enable_ai_assistant);
            kotlin.s.c.l.e(string, "getString(R.string.toast_tip_enable_ai_assistant)");
            c0363a.a(activity, string, 80);
        }
        return kotlin.o.a;
    }
}
