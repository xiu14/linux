package com.bytedance.android.input.fragment.settings;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentInputRecommendBinding;
import com.bytedance.android.input.common.SettingsConfigNext;

/* loaded from: classes.dex */
final class N0 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ FragmentInputRecommendBinding a;
    final /* synthetic */ InputRecommendFragment b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SwitchCompat f2408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(FragmentInputRecommendBinding fragmentInputRecommendBinding, InputRecommendFragment inputRecommendFragment, SwitchCompat switchCompat) {
        super(0);
        this.a = fragmentInputRecommendBinding;
        this.b = inputRecommendFragment;
        this.f2408c = switchCompat;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        Object J2;
        com.bytedance.android.input.r.j.i("InputRecommendFragment", "[ASSOCIATE] leftClickListener.");
        InputRecommendFragment inputRecommendFragment = this.b;
        SwitchCompat switchCompat = this.f2408c;
        try {
            InputRecommendFragment.s(inputRecommendFragment, false);
            FragmentActivity activity = inputRecommendFragment.getActivity();
            if (activity != null) {
                com.bytedance.android.input.r.j.m("InputRecommendFragment", "[ASSOCIATE] 点击了取消, targetState: true");
                switchCompat.setChecked(true);
                String string = activity.getString(C0838R.string.typing_associate_enabled);
                kotlin.s.c.l.e(string, "act.getString(R.string.typing_associate_enabled)");
                SettingsConfigNext.l(string, Boolean.TRUE);
                J2 = kotlin.o.a;
            } else {
                J2 = null;
            }
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("[ASSOCIATE] leftClickListener error --", b, "InputRecommendFragment");
        }
        return kotlin.o.a;
    }
}
