package com.bytedance.android.input.keyboard.word_segmentation.data;

import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class e extends m implements l<WordSegmentationDetailData, CharSequence> {
    public static final e a = new e();

    e() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public CharSequence invoke(WordSegmentationDetailData wordSegmentationDetailData) {
        WordSegmentationDetailData wordSegmentationDetailData2 = wordSegmentationDetailData;
        kotlin.s.c.l.f(wordSegmentationDetailData2, "item");
        return "WordSegmentationDetailData(token=" + wordSegmentationDetailData2.getToken() + ", index=" + wordSegmentationDetailData2.getIndex() + ')';
    }
}
