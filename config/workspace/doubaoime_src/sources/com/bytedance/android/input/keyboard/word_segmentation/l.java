package com.bytedance.android.input.keyboard.word_segmentation;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements com.bytedance.android.input.keyboard.word_segmentation.listener.a {
    final /* synthetic */ WordSegmentationLayout a;

    l(WordSegmentationLayout wordSegmentationLayout) {
        this.a = wordSegmentationLayout;
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.listener.a
    public void a(int i, int i2) {
        WordSegmentationAdapter wordSegmentationAdapter;
        ArrayList<j> d2;
        WordSegmentationLayout.d(this.a, "onItemSelect beginPosition = " + i + ", endPosition = " + i2);
        wordSegmentationAdapter = this.a.b;
        if (wordSegmentationAdapter == null || (d2 = wordSegmentationAdapter.d()) == null) {
            return;
        }
        WordSegmentationLayout wordSegmentationLayout = this.a;
        int i3 = 0;
        for (Object obj : d2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            j jVar = (j) obj;
            if (i3 >= i && i3 <= i2) {
                jVar.f(!wordSegmentationLayout.isSelected());
            }
            i3 = i4;
        }
    }

    @Override // com.bytedance.android.input.keyboard.word_segmentation.listener.a
    public void onFinish() {
        WordSegmentationLayout.d(this.a, "onFinish");
        WordSegmentationLayout.a(this.a);
    }
}
