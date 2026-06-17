package com.bytedance.android.input.keyboard.gif.list_layout.models;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlin.s.c.v;

/* loaded from: classes.dex */
final class f extends m implements l<Boolean, o> {
    final /* synthetic */ v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(v vVar) {
        super(1);
        this.a = vVar;
    }

    @Override // kotlin.s.b.l
    public o invoke(Boolean bool) {
        this.a.a = bool.booleanValue();
        return o.a;
    }
}
