package com.bytedance.android.input.keyboard.word_segmentation.listener;

import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Choreographer.FrameCallback {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ItemDragSelectImplBackup f2838c;

    c(RecyclerView recyclerView, int i, ItemDragSelectImplBackup itemDragSelectImplBackup) {
        this.a = recyclerView;
        this.b = i;
        this.f2838c = itemDragSelectImplBackup;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.a.scrollBy(0, this.b);
        ItemDragSelectImplBackup itemDragSelectImplBackup = this.f2838c;
        int i = ItemDragSelectImplBackup.h;
        Objects.requireNonNull(itemDragSelectImplBackup);
        throw null;
    }
}
