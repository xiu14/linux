package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.button.OButton;

/* loaded from: classes.dex */
final class C extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ OButton a;
    final /* synthetic */ OButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(OButton oButton, OButton oButton2) {
        super(1);
        this.a = oButton;
        this.b = oButton2;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        Integer num2 = num;
        OButton oButton = this.a;
        if (oButton != null) {
            kotlin.s.c.l.e(num2, "index");
            oButton.setEnabled(num2.intValue() > 0);
        }
        OButton oButton2 = this.b;
        if (oButton2 != null) {
            kotlin.s.c.l.e(num2, "index");
            int intValue = num2.intValue();
            Integer value = U.a.l().getValue();
            oButton2.setEnabled(intValue < (value != null ? value.intValue() - 1 : 0));
        }
        return kotlin.o.a;
    }
}
