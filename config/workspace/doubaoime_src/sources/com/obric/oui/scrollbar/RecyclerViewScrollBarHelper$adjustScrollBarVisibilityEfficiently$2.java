package com.obric.oui.scrollbar;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class RecyclerViewScrollBarHelper$adjustScrollBarVisibilityEfficiently$2 extends RecyclerView.OnScrollListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        l.f(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            throw null;
        }
    }
}
