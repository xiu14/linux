package com.bytedance.android.input.basic.image;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImageLoadScrollListener extends RecyclerView.OnScrollListener {
    private boolean a;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        l.f(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.a = false;
            l.f(null, "context");
            l.f(null, "context");
            com.bumptech.glide.c.n(null).t();
            return;
        }
        if ((i == 1 || i == 2) && !this.a) {
            this.a = true;
            l.f(null, "context");
            l.f(null, "context");
            com.bumptech.glide.c.n(null).s();
        }
    }
}
