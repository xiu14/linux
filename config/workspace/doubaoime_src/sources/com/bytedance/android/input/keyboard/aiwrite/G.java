package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class G extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ kotlin.s.c.v b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiTextView f2574c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextView f2575d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2576e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2577f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2578g;
    final /* synthetic */ kotlin.s.c.v h;
    final /* synthetic */ kotlin.s.c.v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(DetailView detailView, kotlin.s.c.v vVar, AiTextView aiTextView, TextView textView, kotlin.s.c.v vVar2, kotlin.s.c.v vVar3, kotlin.s.c.x xVar, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(1);
        this.a = detailView;
        this.b = vVar;
        this.f2574c = aiTextView;
        this.f2575d = textView;
        this.f2576e = vVar2;
        this.f2577f = vVar3;
        this.f2578g = xVar;
        this.h = vVar4;
        this.i = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        String str;
        Boolean bool2 = bool;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "[model] DetailViewState.useCache = " + bool2);
        kotlin.s.c.v vVar = this.b;
        kotlin.s.c.l.e(bool2, "isCache");
        vVar.a = bool2.booleanValue();
        U u = U.a;
        Integer value = u.g().getValue();
        if (value == null || value.intValue() != 0) {
            C0601v c0601v = C0601v.a;
            Integer value2 = u.g().getValue();
            kotlin.s.c.l.c(value2);
            if (!c0601v.c(value2.intValue())) {
                if (bool2.booleanValue()) {
                    this.f2574c.l();
                } else {
                    this.f2574c.m();
                }
            }
        }
        DetailView.c(this.f2575d, this.a, this.f2576e, this.f2577f, this.f2578g, this.h, this.i, this.b);
        return kotlin.o.a;
    }
}
