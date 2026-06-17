package com.ss.ugc.effectplatform.task;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.o;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class f extends m implements kotlin.s.b.a<o> {
    final /* synthetic */ e a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, int i) {
        super(0);
        this.a = eVar;
        this.b = i;
    }

    @Override // kotlin.s.b.a
    public o invoke() {
        try {
            this.a.g(this.b, false);
        } catch (Throwable th) {
            r.J(th);
        }
        return o.a;
    }
}
