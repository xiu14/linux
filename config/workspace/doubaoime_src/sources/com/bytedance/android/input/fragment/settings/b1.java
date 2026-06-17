package com.bytedance.android.input.fragment.settings;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
final class b1 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ MainFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b1(MainFragment mainFragment) {
        super(0);
        this.a = mainFragment;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return kotlin.o.a;
    }
}
