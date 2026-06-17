package com.bytedance.android.doubaoime.activity;

import com.obric.oui.segmentedtab.OTabSegmentedLayout;

/* loaded from: classes.dex */
public final class O implements OTabSegmentedLayout.c {
    final /* synthetic */ FeedbackActivity a;

    O(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // com.obric.oui.segmentedtab.OTabSegmentedLayout.c
    public void a(int i) {
    }

    @Override // com.obric.oui.segmentedtab.OTabSegmentedLayout.c
    public void b(int i) {
        e.a.a.a.a.k0("onSelect position = ", i, "FeedbackActivity");
        this.a.v(i);
    }
}
