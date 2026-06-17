package com.bytedance.android.input.fragment.custom_symbol;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SwipeAndDragCallback extends ItemTouchHelper.Callback {
    private KeyCustomSymbolAdapter a;
    private boolean b = true;

    public final void a(KeyCustomSymbolAdapter keyCustomSymbolAdapter) {
        this.a = keyCustomSymbolAdapter;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.f(recyclerView, "recyclerView");
        l.f(viewHolder, "viewHolder");
        return ItemTouchHelper.Callback.makeMovementFlags(3, 4);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.f(recyclerView, "recyclerView");
        l.f(viewHolder, "viewHolder");
        l.f(viewHolder2, TypedValues.AttributesType.S_TARGET);
        KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.a;
        return keyCustomSymbolAdapter != null && keyCustomSymbolAdapter.j(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        l.f(viewHolder, "viewHolder");
        if (this.a != null) {
            viewHolder.getAdapterPosition();
        }
    }
}
