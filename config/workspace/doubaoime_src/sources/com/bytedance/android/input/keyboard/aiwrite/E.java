package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class E extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ TextView a;
    final /* synthetic */ DetailView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2564c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2565d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2566e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2567f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2568g;
    final /* synthetic */ kotlin.s.c.v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(TextView textView, DetailView detailView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, kotlin.s.c.x xVar, kotlin.s.c.v vVar3, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(0);
        this.a = textView;
        this.b = detailView;
        this.f2564c = vVar;
        this.f2565d = vVar2;
        this.f2566e = xVar;
        this.f2567f = vVar3;
        this.f2568g = vVar4;
        this.h = vVar5;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        DetailView.c(this.a, this.b, this.f2564c, this.f2565d, this.f2566e, this.f2567f, this.f2568g, this.h);
        return kotlin.o.a;
    }
}
