package com.bytedance.android.input.speech.view;

/* loaded from: classes.dex */
final class k extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AsrLongPressView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(AsrLongPressView asrLongPressView) {
        super(1);
        this.a = asrLongPressView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        AsrLongPressView asrLongPressView = this.a;
        kotlin.s.c.l.e(bool2, "it");
        asrLongPressView.setKeepScreenOn(bool2.booleanValue());
        return kotlin.o.a;
    }
}
