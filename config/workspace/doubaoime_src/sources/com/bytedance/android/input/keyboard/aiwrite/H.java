package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class H extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ AiTextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2579c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2580d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextView f2581e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2582f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2583g;
    final /* synthetic */ kotlin.s.c.x h;
    final /* synthetic */ kotlin.s.c.v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(DetailView detailView, AiTextView aiTextView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, TextView textView, kotlin.s.c.v vVar3, kotlin.s.c.v vVar4, kotlin.s.c.x xVar, kotlin.s.c.v vVar5) {
        super(1);
        this.a = detailView;
        this.b = aiTextView;
        this.f2579c = vVar;
        this.f2580d = vVar2;
        this.f2581e = textView;
        this.f2582f = vVar3;
        this.f2583g = vVar4;
        this.h = xVar;
        this.i = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        String str;
        Boolean bool2 = bool;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "[model] DetailViewState.streamEnd = " + bool2 + ", -to setDetailBottomBtn enable");
        U u = U.a;
        Integer value = u.g().getValue();
        if (value == null || value.intValue() != 0) {
            C0601v c0601v = C0601v.a;
            Integer value2 = u.g().getValue();
            kotlin.s.c.l.c(value2);
            if (!c0601v.c(value2.intValue())) {
                kotlin.s.c.l.e(bool2, "end");
                if (bool2.booleanValue()) {
                    this.b.n();
                } else {
                    this.b.u();
                }
            }
        }
        kotlin.s.c.v vVar = this.f2579c;
        kotlin.s.c.l.e(bool2, "end");
        vVar.a = bool2.booleanValue();
        if (!bool2.booleanValue()) {
            this.f2580d.a = false;
        }
        DetailView.c(this.f2581e, this.a, this.f2582f, this.f2583g, this.h, this.f2579c, this.f2580d, this.i);
        return kotlin.o.a;
    }
}
