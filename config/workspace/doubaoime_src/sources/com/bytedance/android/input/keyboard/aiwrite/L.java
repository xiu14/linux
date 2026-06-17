package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class L extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ kotlin.s.c.v a;
    final /* synthetic */ kotlin.s.c.v b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextView f2599c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ DetailView f2600d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2601e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2602f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2603g;
    final /* synthetic */ kotlin.s.c.v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(kotlin.s.c.v vVar, kotlin.s.c.v vVar2, TextView textView, DetailView detailView, kotlin.s.c.v vVar3, kotlin.s.c.v vVar4, kotlin.s.c.x xVar, kotlin.s.c.v vVar5) {
        super(1);
        this.a = vVar;
        this.b = vVar2;
        this.f2599c = textView;
        this.f2600d = detailView;
        this.f2601e = vVar3;
        this.f2602f = vVar4;
        this.f2603g = xVar;
        this.h = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        kotlin.s.c.v vVar = this.a;
        vVar.a = false;
        kotlin.s.c.v vVar2 = this.b;
        vVar2.a = false;
        DetailView.c(this.f2599c, this.f2600d, this.f2601e, this.f2602f, this.f2603g, this.h, vVar, vVar2);
        return kotlin.o.a;
    }
}
