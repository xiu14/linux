package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.button.OButton;

/* loaded from: classes.dex */
final class D extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ OButton a;
    final /* synthetic */ OButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(OButton oButton, OButton oButton2) {
        super(1);
        this.a = oButton;
        this.b = oButton2;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        U u = U.a;
        Integer value = u.m().getValue();
        boolean z = false;
        if (value == null) {
            value = 0;
        }
        int intValue = value.intValue();
        OButton oButton = this.a;
        if (oButton != null) {
            oButton.setEnabled(!bool2.booleanValue() && intValue > 0);
        }
        OButton oButton2 = this.b;
        if (oButton2 != null) {
            if (!bool2.booleanValue()) {
                Integer value2 = u.l().getValue();
                if (intValue < (value2 != null ? value2.intValue() - 1 : 0)) {
                    z = true;
                }
            }
            oButton2.setEnabled(z);
        }
        return kotlin.o.a;
    }
}
