package com.bytedance.android.input.speech.view;

/* loaded from: classes.dex */
final class m extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AsrWaveView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(AsrWaveView asrWaveView) {
        super(1);
        this.a = asrWaveView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        AsrWaveView asrWaveView = this.a;
        kotlin.s.c.l.e(bool2, "it");
        asrWaveView.setKeepScreenOn(bool2.booleanValue());
        return kotlin.o.a;
    }
}
