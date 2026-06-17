package com.bytedance.android.input.keyboard.word_segmentation;

import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ItemDragSelectImpl f2829c;

    i(RecyclerView recyclerView, int i, ItemDragSelectImpl itemDragSelectImpl) {
        this.a = recyclerView;
        this.b = i;
        this.f2829c = itemDragSelectImpl;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer choreographer;
        this.a.scrollBy(0, this.b);
        choreographer = this.f2829c.f2807d;
        choreographer.postFrameCallback(this);
    }
}
