package com.bytedance.android.input.keyboard.word_segmentation;

/* loaded from: classes.dex */
public final class m implements com.bytedance.android.input.keyboard.word_segmentation.listener.b {
    final /* synthetic */ WordSegmentationLayout a;

    m(WordSegmentationLayout wordSegmentationLayout) {
        this.a = wordSegmentationLayout;
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.listener.b
    public void a(int i, j jVar) {
        kotlin.s.c.l.f(jVar, "itemData");
        WordSegmentationLayout.d(this.a, "onItemClick position = " + i);
        WordSegmentationLayout.a(this.a);
    }
}
