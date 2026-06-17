package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.LinearLayout;
import com.obric.oui.lisitem.OListItemGeneral;

/* loaded from: classes.dex */
final class B extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ OListItemGeneral b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LinearLayout f2555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(DetailView detailView, OListItemGeneral oListItemGeneral, LinearLayout linearLayout) {
        super(1);
        this.a = detailView;
        this.b = oListItemGeneral;
        this.f2555c = linearLayout;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        String str;
        Integer num2 = num;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "[model] DetailViewModel.resultListNum = " + num2);
        OListItemGeneral oListItemGeneral = this.b;
        if (oListItemGeneral != null) {
            kotlin.s.c.l.e(num2, "number");
            oListItemGeneral.setVisibility(num2.intValue() > 1 ? 8 : 0);
        }
        LinearLayout linearLayout = this.f2555c;
        if (linearLayout != null) {
            kotlin.s.c.l.e(num2, "number");
            linearLayout.setVisibility(num2.intValue() > 1 ? 0 : 8);
        }
        return kotlin.o.a;
    }
}
