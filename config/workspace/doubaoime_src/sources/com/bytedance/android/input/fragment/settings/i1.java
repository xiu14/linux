package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
final class i1 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ MainFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i1(MainFragment mainFragment) {
        super(1);
        this.a = mainFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean z = ((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0;
        if (!aVar.F() || z) {
            FragmentActivity activity = this.a.getActivity();
            SettingsActivityNext settingsActivityNext = activity instanceof SettingsActivityNext ? (SettingsActivityNext) activity : null;
            if (settingsActivityNext != null) {
                String string = this.a.getString(C0838R.string.help_and_tips);
                kotlin.s.c.l.e(string, "getString(R.string.help_and_tips)");
                settingsActivityNext.openWebFragment("https://bytedance.larkoffice.com/wiki/K8hPwODy2iQeEQkr0W9cXVJ0nph", string);
            }
        } else {
            Context context = this.a.getContext();
            if (context != null) {
                com.bytedance.android.input.keyboard.q.c(context, 0, false, 2);
            }
        }
        return kotlin.o.a;
    }
}
