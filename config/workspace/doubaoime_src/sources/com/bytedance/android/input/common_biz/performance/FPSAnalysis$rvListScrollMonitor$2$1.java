package com.bytedance.android.input.common_biz.performance;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class FPSAnalysis$rvListScrollMonitor$2$1 extends RecyclerView.OnScrollListener {
    private int a;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.s.c.l.f(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        int i2 = this.a;
        this.a = i;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
    }
}
