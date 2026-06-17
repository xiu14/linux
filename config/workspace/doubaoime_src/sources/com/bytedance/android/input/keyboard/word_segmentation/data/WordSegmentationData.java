package com.bytedance.android.input.keyboard.word_segmentation.data;

import java.util.ArrayList;
import kotlin.collections.g;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class WordSegmentationData {
    private final ArrayList<String> preview = new ArrayList<>();
    private final ArrayList<ArrayList<WordSegmentationDetailData>> detail = new ArrayList<>();
    private String originText = "";

    static final class a extends m implements l<ArrayList<WordSegmentationDetailData>, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(ArrayList<WordSegmentationDetailData> arrayList) {
            ArrayList<WordSegmentationDetailData> arrayList2 = arrayList;
            kotlin.s.c.l.f(arrayList2, "row");
            return g.C(arrayList2, null, "[", "]", 0, null, e.a, 25, null);
        }
    }

    public final ArrayList<ArrayList<WordSegmentationDetailData>> getDetail() {
        return this.detail;
    }

    public final String getOriginText() {
        return this.originText;
    }

    public final ArrayList<String> getPreview() {
        return this.preview;
    }

    public final void setOriginText(String str) {
        kotlin.s.c.l.f(str, "<set-?>");
        this.originText = str;
    }

    public String toString() {
        String C = g.C(this.detail, null, "[", "]", 0, null, a.a, 25, null);
        StringBuilder M = e.a.a.a.a.M("WordSegmentationData(originText = ");
        M.append(this.originText);
        M.append(", preview = ");
        M.append(this.preview);
        M.append(", detail = ");
        M.append(C);
        M.append(')');
        return M.toString();
    }
}
