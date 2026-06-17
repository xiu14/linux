package com.bytedance.android.input.keyboard.toolbar.clipboard;

import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class i extends com.bytedance.android.input.keyboard.toolbar.entity.a {
    private final WordSegmentationData a;

    public i(WordSegmentationData wordSegmentationData) {
        l.f(wordSegmentationData, "wordSegmentationData");
        this.a = wordSegmentationData;
    }

    public final WordSegmentationData a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && l.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ToolbarClipboardViewData(wordSegmentationData=");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }
}
