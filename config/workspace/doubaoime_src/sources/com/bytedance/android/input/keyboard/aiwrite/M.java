package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.layout.OUIFrameLayout;

/* loaded from: classes.dex */
final class M extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ OUIFrameLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(OUIFrameLayout oUIFrameLayout) {
        super(1);
        this.a = oUIFrameLayout;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        OUIFrameLayout oUIFrameLayout = this.a;
        kotlin.s.c.l.e(bool2, "editor");
        oUIFrameLayout.setVisibility(bool2.booleanValue() ? 0 : 8);
        return kotlin.o.a;
    }
}
