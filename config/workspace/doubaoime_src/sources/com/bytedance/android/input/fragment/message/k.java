package com.bytedance.android.input.fragment.message;

import kotlin.o;
import kotlin.s.b.q;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class k extends m implements q<Integer, com.bytedance.android.input.fragment.message.entity.c, Integer, o> {
    final /* synthetic */ MessageCenterFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(MessageCenterFragment messageCenterFragment) {
        super(3);
        this.a = messageCenterFragment;
    }

    @Override // kotlin.s.b.q
    public o d(Integer num, com.bytedance.android.input.fragment.message.entity.c cVar, Integer num2) {
        num.intValue();
        com.bytedance.android.input.fragment.message.entity.c cVar2 = cVar;
        int intValue = num2.intValue();
        l.f(cVar2, "item");
        com.bytedance.android.input.fragment.message.data.f fVar = com.bytedance.android.input.fragment.message.data.f.a;
        final String d2 = cVar2.d();
        l.f(d2, "messageId");
        com.bytedance.android.input.basic.thread.a.a().execute(new Runnable() { // from class: com.bytedance.android.input.fragment.message.data.a
            @Override // java.lang.Runnable
            public final void run() {
                f.j(d2);
            }
        });
        if (intValue <= 0) {
            MessageCenterFragment.s(this.a);
        }
        return o.a;
    }
}
