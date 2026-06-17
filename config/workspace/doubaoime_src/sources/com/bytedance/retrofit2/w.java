package com.bytedance.retrofit2;

/* loaded from: classes2.dex */
final class w extends kotlin.s.c.m implements kotlin.s.b.l<Throwable, kotlin.o> {
    final /* synthetic */ InterfaceC0701e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(InterfaceC0701e interfaceC0701e) {
        super(1);
        this.a = interfaceC0701e;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        this.a.cancel();
        return kotlin.o.a;
    }
}
