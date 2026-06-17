package com.bytedance.android.input.keyboard.gif.list_layout.models;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.wschannel.WsConstants;
import kotlin.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int a;
    private final boolean b;

    public GridSpacingItemDecoration(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager;
        int spanCount;
        k kVar;
        int i;
        int i2;
        int i3;
        l.f(rect, "outRect");
        l.f(view, "view");
        l.f(recyclerView, "parent");
        l.f(state, WsConstants.KEY_CONNECTION_STATE);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        boolean z = layoutManager instanceof GridLayoutManager;
        if (z) {
            spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        } else {
            spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        boolean z2 = !z ? !(!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1) : ((GridLayoutManager) layoutManager).getOrientation() != 1;
        if (z) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup = ((GridLayoutManager) layoutManager).getSpanSizeLookup();
            kVar = new k(Integer.valueOf(spanSizeLookup.getSpanIndex(childAdapterPosition, spanCount)), Integer.valueOf(spanSizeLookup.getSpanSize(childAdapterPosition)), Integer.valueOf(spanSizeLookup.getSpanGroupIndex(childAdapterPosition, spanCount)));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            l.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            kVar = new k(Integer.valueOf(((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex()), 1, Integer.valueOf(childAdapterPosition / spanCount));
        } else {
            kVar = new k(Integer.valueOf(childAdapterPosition % spanCount), 1, Integer.valueOf(childAdapterPosition / spanCount));
        }
        int intValue = ((Number) kVar.a()).intValue();
        int intValue2 = ((Number) kVar.b()).intValue();
        int intValue3 = ((Number) kVar.c()).intValue();
        boolean z3 = this.b;
        if (z3) {
            int i4 = this.a;
            i = i4 - ((intValue * i4) / spanCount);
        } else {
            i = (this.a * intValue) / spanCount;
        }
        if (z3) {
            i2 = ((intValue + intValue2) * this.a) / spanCount;
        } else {
            int i5 = this.a;
            i2 = i5 - (((intValue + intValue2) * i5) / spanCount);
        }
        if (z3) {
            if (intValue3 == 0) {
                i3 = this.a;
            }
            i3 = 0;
        } else {
            if (intValue3 != 0) {
                i3 = this.a;
            }
            i3 = 0;
        }
        int i6 = z3 ? this.a : 0;
        if (z2) {
            rect.left = i;
            rect.right = i2;
            rect.top = i3;
            rect.bottom = i6;
            return;
        }
        rect.top = i;
        rect.bottom = i2;
        rect.left = i3;
        rect.right = i6;
    }
}
