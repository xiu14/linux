package com.bytedance.android.doubaoime.activity;

/* loaded from: classes.dex */
final class b0 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ WebviewActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(WebviewActivity webviewActivity) {
        super(0);
        this.a = webviewActivity;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        this.a.onBackPressed();
        return kotlin.o.a;
    }
}
