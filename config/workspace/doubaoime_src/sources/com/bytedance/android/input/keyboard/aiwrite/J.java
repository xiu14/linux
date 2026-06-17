package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.TextView;

/* loaded from: classes.dex */
final class J extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ AiTextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2589c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2590d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextView f2591e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.v f2592f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.x f2593g;
    final /* synthetic */ kotlin.s.c.v h;
    final /* synthetic */ kotlin.s.c.v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(DetailView detailView, AiTextView aiTextView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, TextView textView, kotlin.s.c.v vVar3, kotlin.s.c.x xVar, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        super(1);
        this.a = detailView;
        this.b = aiTextView;
        this.f2589c = vVar;
        this.f2590d = vVar2;
        this.f2591e = textView;
        this.f2592f = vVar3;
        this.f2593g = xVar;
        this.h = vVar4;
        this.i = vVar5;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(String str) {
        String str2;
        String str3 = str;
        if (com.obric.oui.common.util.b.e(this.a)) {
            kotlin.s.c.l.e(str3, "textShow");
            if (!kotlin.text.a.s(str3)) {
                U u = U.a;
                Integer value = u.g().getValue();
                if (value == null || value.intValue() != 0) {
                    C0601v c0601v = C0601v.a;
                    Integer value2 = u.g().getValue();
                    kotlin.s.c.l.c(value2);
                    if (!c0601v.c(value2.intValue())) {
                        str2 = this.a.a;
                        com.bytedance.android.input.r.j.i(str2, "[model] DetailViewState.textHtmlFormat = " + str3 + ", to set show");
                        this.b.setFormatText(str3);
                    }
                }
            }
        }
        kotlin.s.c.v vVar = this.f2589c;
        kotlin.s.c.l.e(str3, "textShow");
        vVar.a = !kotlin.text.a.s(str3);
        kotlin.s.c.v vVar2 = this.f2590d;
        vVar2.a = false;
        DetailView.c(this.f2591e, this.a, this.f2589c, this.f2592f, this.f2593g, this.h, vVar2, this.i);
        return kotlin.o.a;
    }
}
