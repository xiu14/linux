package com.bytedance.android.input.fragment.settings;

import android.content.Context;

/* loaded from: classes.dex */
final class S0 extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ KbdLayoutFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(KbdLayoutFragment kbdLayoutFragment) {
        super(1);
        this.a = kbdLayoutFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        int intValue = num.intValue();
        com.bytedance.android.input.common.h hVar = com.bytedance.android.input.common.h.a;
        Context requireContext = this.a.requireContext();
        kotlin.s.c.l.e(requireContext, "requireContext()");
        com.bytedance.android.input.common.h.i(hVar, requireContext, intValue, false, 4);
        return kotlin.o.a;
    }
}
