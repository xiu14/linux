package com.bytedance.android.input.q;

import java.util.List;

/* loaded from: classes.dex */
final class y extends kotlin.s.c.m implements kotlin.s.b.l<List<? extends String>, kotlin.o> {
    final /* synthetic */ com.bytedance.android.input.basic.recognition.api.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(com.bytedance.android.input.basic.recognition.api.a aVar) {
        super(1);
        this.a = aVar;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        kotlin.s.c.l.f(list2, "it");
        v.h.put(this.a.c(), list2);
        if (list2.isEmpty()) {
            com.bytedance.android.input.r.j.j("QuickReply", "request response list is empty");
            v.i(v.a);
        } else {
            com.bytedance.android.input.r.j.m("QuickReply", "new request. tryShowReply");
            v.h(v.a, this.a.c(), list2);
        }
        return kotlin.o.a;
    }
}
