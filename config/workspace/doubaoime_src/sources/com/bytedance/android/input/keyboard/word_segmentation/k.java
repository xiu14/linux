package com.bytedance.android.input.keyboard.word_segmentation;

import java.util.Objects;
import kotlin.o;

/* loaded from: classes.dex */
final class k extends kotlin.s.c.m implements kotlin.s.b.l<String, o> {
    final /* synthetic */ WordSegmentationLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(WordSegmentationLayout wordSegmentationLayout) {
        super(1);
        this.a = wordSegmentationLayout;
    }

    @Override // kotlin.s.b.l
    public o invoke(String str) {
        com.bytedance.android.input.keyboard.word_segmentation.o.a aVar;
        String str2 = str;
        kotlin.s.c.l.f(str2, "str");
        WordSegmentationLayout.d(this.a, "commitText = " + str2);
        Objects.requireNonNull(this.a);
        aVar = this.a.f2812c;
        aVar.a(str2);
        return o.a;
    }
}
