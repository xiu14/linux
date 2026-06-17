package com.bytedance.android.input.fragment.settings;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;

/* loaded from: classes.dex */
final class G0 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ InputModeFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G0(InputModeFragment inputModeFragment) {
        super(1);
        this.a = inputModeFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        FragmentActivity activity = this.a.getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
        SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.SMART_INPUT, null, 2, null);
        return kotlin.o.a;
    }
}
