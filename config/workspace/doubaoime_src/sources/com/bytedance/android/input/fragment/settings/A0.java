package com.bytedance.android.input.fragment.settings;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class A0 extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AboutFragment a;
    final /* synthetic */ DialogInterface b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(AboutFragment aboutFragment, DialogInterface dialogInterface) {
        super(1);
        this.a = aboutFragment;
        this.b = dialogInterface;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.a.F(booleanValue);
        if (booleanValue) {
            this.b.dismiss();
        } else {
            this.a.k = this.b;
        }
        return kotlin.o.a;
    }
}
