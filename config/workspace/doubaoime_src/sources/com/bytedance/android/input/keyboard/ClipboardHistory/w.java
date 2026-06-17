package com.bytedance.android.input.keyboard.ClipboardHistory;

import com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter;
import com.bytedance.android.input.keyboard.ClipboardHistory.v;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;

/* loaded from: classes.dex */
final class w extends kotlin.s.c.m implements kotlin.s.b.l<WordSegmentationData, kotlin.o> {
    final /* synthetic */ ClipboardHistoryItemAdapter.ItemHolder a;
    final /* synthetic */ v.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ClipboardHistoryItemAdapter.ItemHolder itemHolder, v.b bVar) {
        super(1);
        this.a = itemHolder;
        this.b = bVar;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(WordSegmentationData wordSegmentationData) {
        WordSegmentationData wordSegmentationData2 = wordSegmentationData;
        kotlin.s.c.l.f(wordSegmentationData2, "result");
        v.b bVar = this.a.p;
        if (bVar != null) {
            bVar.c(wordSegmentationData2);
        }
        this.b.c(wordSegmentationData2);
        this.a.v(wordSegmentationData2);
        return kotlin.o.a;
    }
}
