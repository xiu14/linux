package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class I extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ AiTextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2584c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2585d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextView f2586e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2587f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2588g;
    final /* synthetic */ kotlin.s.c.v h;
    final /* synthetic */ kotlin.s.c.v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(DetailView detailView, AiTextView aiTextView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, TextView textView, kotlin.s.c.v vVar3, kotlin.s.c.x xVar, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(1);
        this.a = detailView;
        this.b = aiTextView;
        this.f2584c = vVar;
        this.f2585d = vVar2;
        this.f2586e = textView;
        this.f2587f = vVar3;
        this.f2588g = xVar;
        this.h = vVar4;
        this.i = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(String str) {
        String str2;
        String str3 = str;
        if (com.obric.oui.common.util.b.e(this.a)) {
            U u = U.a;
            Integer value = u.g().getValue();
            if (value == null || value.intValue() != 0) {
                C0601v c0601v = C0601v.a;
                Integer value2 = u.g().getValue();
                kotlin.s.c.l.c(value2);
                if (!c0601v.c(value2.intValue())) {
                    str2 = this.a.a;
                    StringBuilder U = e.a.a.a.a.U("[model] DetailViewState.textDetail = ", str3, ", to set show ");
                    U.append(u.h().getValue());
                    com.bytedance.android.input.r.j.i(str2, U.toString());
                    AiTextView aiTextView = this.b;
                    kotlin.s.c.l.e(str3, "textShow");
                    aiTextView.setShowText(str3);
                }
            }
        }
        kotlin.s.c.v vVar = this.f2584c;
        kotlin.s.c.l.e(str3, "textShow");
        vVar.a = !kotlin.text.a.s(str3);
        kotlin.s.c.v vVar2 = this.f2585d;
        vVar2.a = false;
        DetailView.c(this.f2586e, this.a, this.f2587f, this.f2584c, this.f2588g, this.h, vVar2, this.i);
        return kotlin.o.a;
    }
}
