package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class F extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ kotlin.s.c.v a;
    final /* synthetic */ TextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DetailView f2569c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2570d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2571e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2572f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2573g;
    final /* synthetic */ kotlin.s.c.v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(kotlin.s.c.v vVar, TextView textView, DetailView detailView, kotlin.s.c.v vVar2, kotlin.s.c.v vVar3, kotlin.s.c.x xVar, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(0);
        this.a = vVar;
        this.b = textView;
        this.f2569c = detailView;
        this.f2570d = vVar2;
        this.f2571e = vVar3;
        this.f2572f = xVar;
        this.f2573g = vVar4;
        this.h = vVar5;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        kotlin.s.c.v vVar = this.a;
        vVar.a = true;
        DetailView.c(this.b, this.f2569c, this.f2570d, this.f2571e, this.f2572f, this.f2573g, vVar, this.h);
        return kotlin.o.a;
    }
}
