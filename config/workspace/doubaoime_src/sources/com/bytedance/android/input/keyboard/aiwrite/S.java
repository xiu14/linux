package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.text.OTextView;

/* loaded from: classes.dex */
final class S extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ OTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(DetailView detailView, OTextView oTextView) {
        super(1);
        this.a = detailView;
        this.b = oTextView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(String str) {
        String str2;
        String str3 = str;
        str2 = this.a.a;
        com.bytedance.android.input.r.j.i(str2, "[model] DetailViewState.titleName = " + str3 + ", to set title");
        this.b.setText(str3);
        return kotlin.o.a;
    }
}
