package com.bytedance.lego.init;

/* loaded from: classes.dex */
final class c extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ com.bytedance.lego.init.model.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.bytedance.lego.init.model.b bVar) {
        super(0);
        this.a = bVar;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        com.bytedance.lego.init.model.b bVar = this.a;
        if (bVar.f5305c) {
            a.h.f().post(new b(this));
        } else {
            a aVar = a.h;
            kotlin.s.c.l.b(bVar, "task");
            a.e(aVar, bVar, false);
        }
        return kotlin.o.a;
    }
}
