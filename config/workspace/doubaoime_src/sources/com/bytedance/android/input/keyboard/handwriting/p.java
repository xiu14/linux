package com.bytedance.android.input.keyboard.handwriting;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
final class p extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ ToolBarTipsLayout a;
    final /* synthetic */ AppCompatTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ToolBarTipsLayout toolBarTipsLayout, AppCompatTextView appCompatTextView) {
        super(1);
        this.a = toolBarTipsLayout;
        this.b = appCompatTextView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        final int intValue = num.intValue();
        this.a.e("show tips viewWidth = " + intValue);
        ToolBarTipsLayout.c(this.a, this.b, intValue);
        final AppCompatTextView appCompatTextView = this.b;
        final ToolBarTipsLayout toolBarTipsLayout = this.a;
        appCompatTextView.postDelayed(new Runnable() { // from class: com.bytedance.android.input.keyboard.handwriting.m
            @Override // java.lang.Runnable
            public final void run() {
                ToolBarTipsLayout toolBarTipsLayout2 = ToolBarTipsLayout.this;
                int i = intValue;
                AppCompatTextView appCompatTextView2 = appCompatTextView;
                kotlin.s.c.l.f(toolBarTipsLayout2, "$this_runCatching");
                kotlin.s.c.l.f(appCompatTextView2, "$toolbarView");
                toolBarTipsLayout2.e("prepare hide tips, wait time = 5000 viewWidth = " + i);
                ToolBarTipsLayout.a(toolBarTipsLayout2, appCompatTextView2, i);
            }
        }, com.heytap.mcssdk.constant.a.r);
        return kotlin.o.a;
    }
}
