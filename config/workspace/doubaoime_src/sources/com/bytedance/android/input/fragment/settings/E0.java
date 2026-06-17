package com.bytedance.android.input.fragment.settings;

import android.view.View;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;

/* loaded from: classes.dex */
final class E0 extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ ImeCheckBox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E0(View.OnClickListener onClickListener, ImeCheckBox imeCheckBox) {
        super(1);
        this.a = onClickListener;
        this.b = imeCheckBox;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        this.a.onClick(this.b);
        return kotlin.o.a;
    }
}
