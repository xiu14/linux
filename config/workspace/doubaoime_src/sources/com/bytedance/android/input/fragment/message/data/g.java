package com.bytedance.android.input.fragment.message.data;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class g extends m implements l<com.bytedance.android.input.fragment.message.entity.a, o> {
    final /* synthetic */ com.bytedance.android.input.fragment.message.entity.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(com.bytedance.android.input.fragment.message.entity.a aVar) {
        super(1);
        this.a = aVar;
    }

    @Override // kotlin.s.b.l
    public o invoke(com.bytedance.android.input.fragment.message.entity.a aVar) {
        com.bytedance.android.input.fragment.message.entity.a aVar2 = aVar;
        kotlin.s.c.l.f(aVar2, "netDataResult");
        f.c(f.a, aVar2, this.a);
        return o.a;
    }
}
