package com.bytedance.android.input.keyboard.aiwrite;

import android.widget.LinearLayout;
import com.obric.oui.layout.OUIFrameLayout;

/* loaded from: classes.dex */
final class P extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ OUIFrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LinearLayout f2613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(DetailView detailView, OUIFrameLayout oUIFrameLayout, LinearLayout linearLayout) {
        super(1);
        this.a = detailView;
        this.b = oUIFrameLayout;
        this.f2613c = linearLayout;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        String str;
        Integer num2 = num;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "[model] loading DetailViewModel.resultListNum = " + num2);
        OUIFrameLayout oUIFrameLayout = this.b;
        if (oUIFrameLayout != null) {
            kotlin.s.c.l.e(num2, "number");
            oUIFrameLayout.setVisibility(num2.intValue() > 1 ? 8 : 0);
        }
        LinearLayout linearLayout = this.f2613c;
        if (linearLayout != null) {
            kotlin.s.c.l.e(num2, "number");
            linearLayout.setVisibility(num2.intValue() > 1 ? 0 : 8);
        }
        return kotlin.o.a;
    }
}
