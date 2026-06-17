package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class K extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ kotlin.s.c.x a;
    final /* synthetic */ TextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DetailView f2594c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2595d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2596e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2597f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2598g;
    final /* synthetic */ kotlin.s.c.v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(kotlin.s.c.x xVar, TextView textView, DetailView detailView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, kotlin.s.c.v vVar3, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(1);
        this.a = xVar;
        this.b = textView;
        this.f2594c = detailView;
        this.f2595d = vVar;
        this.f2596e = vVar2;
        this.f2597f = vVar3;
        this.f2598g = vVar4;
        this.h = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        Integer num2 = num;
        kotlin.s.c.x xVar = this.a;
        kotlin.s.c.l.e(num2, "view");
        xVar.a = num2.intValue();
        DetailView.c(this.b, this.f2594c, this.f2595d, this.f2596e, this.a, this.f2597f, this.f2598g, this.h);
        return kotlin.o.a;
    }
}
