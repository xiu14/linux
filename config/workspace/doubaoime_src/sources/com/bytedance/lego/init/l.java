package com.bytedance.lego.init;

import com.bytedance.lego.init.tasks.IdleTaskProxy;
import java.util.Objects;

/* loaded from: classes.dex */
final class l extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ com.bytedance.lego.init.model.e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(com.bytedance.lego.init.model.e eVar) {
        super(0);
        this.a = eVar;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        Objects.requireNonNull(this.a);
        kotlin.s.c.l.b(null, "task.task");
        Objects.requireNonNull(this.a);
        kotlin.s.c.l.b(null, "task.taskId");
        new IdleTaskProxy(null, null, false, k.a).run();
        return kotlin.o.a;
    }
}
