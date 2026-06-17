package com.ss.ugc.effectplatform.task.h;

import kotlin.o;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class e extends m implements kotlin.s.b.a<o> {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar) {
        super(0);
        this.a = dVar;
    }

    @Override // kotlin.s.b.a
    public o invoke() {
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("[模型][释放锁][模型队列为空][");
        M.append(this.a.q);
        M.append(']');
        bVar.a("JKL", M.toString());
        return o.a;
    }
}
