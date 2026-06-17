package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.checkbox.OCheckBox;

/* loaded from: classes.dex */
final class A extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ OCheckBox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(DetailView detailView, OCheckBox oCheckBox) {
        super(1);
        this.a = detailView;
        this.b = oCheckBox;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        String str;
        Integer num2 = num;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "[model] DetailViewState.currentView = " + num2 + ", to clear origin status");
        if (num2 != null && num2.intValue() == 1) {
            this.b.setChecked(false);
        }
        return kotlin.o.a;
    }
}
