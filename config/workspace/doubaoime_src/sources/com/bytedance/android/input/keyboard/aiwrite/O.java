package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.layout.OUIFrameLayout;

/* loaded from: classes.dex */
final class O extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ OUIFrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OUIFrameLayout f2611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.z<kotlin.s.b.a<kotlin.o>> f2612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(DetailView detailView, OUIFrameLayout oUIFrameLayout, OUIFrameLayout oUIFrameLayout2, kotlin.s.c.z<kotlin.s.b.a<kotlin.o>> zVar) {
        super(1);
        this.a = detailView;
        this.b = oUIFrameLayout;
        this.f2611c = oUIFrameLayout2;
        this.f2612d = zVar;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        String str;
        Integer num2 = num;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "DetailViewModel.resultShowIndex = " + num2);
        OUIFrameLayout oUIFrameLayout = this.b;
        if (oUIFrameLayout != null) {
            kotlin.s.c.l.e(num2, "index");
            oUIFrameLayout.setEnabled(num2.intValue() > 0);
        }
        OUIFrameLayout oUIFrameLayout2 = this.f2611c;
        if (oUIFrameLayout2 != null) {
            kotlin.s.c.l.e(num2, "index");
            int intValue = num2.intValue();
            Integer value = U.a.l().getValue();
            oUIFrameLayout2.setEnabled(intValue < (value != null ? value.intValue() - 1 : 0));
        }
        kotlin.s.b.a<kotlin.o> aVar = this.f2612d.a;
        if (aVar != null) {
            aVar.invoke();
        }
        return kotlin.o.a;
    }
}
