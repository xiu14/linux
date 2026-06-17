package com.bytedance.android.input.keyboard.emoji;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes.dex */
public final class EmojiGridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final boolean a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2701c;

    public EmojiGridSpacingItemDecoration(int i, boolean z, int i2, int i3) {
        this.a = z;
        this.b = i2;
        this.f2701c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager;
        int spanCount;
        kotlin.k kVar;
        kotlin.s.c.l.f(rect, "outRect");
        kotlin.s.c.l.f(view, "view");
        kotlin.s.c.l.f(recyclerView, "parent");
        kotlin.s.c.l.f(state, WsConstants.KEY_CONNECTION_STATE);
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
        int i = z2 ? this.b : this.f2701c;
        int i2 = z2 ? this.f2701c : this.b;
        if (z) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup = ((GridLayoutManager) layoutManager).getSpanSizeLookup();
            kVar = new kotlin.k(Integer.valueOf(spanSizeLookup.getSpanIndex(childAdapterPosition, spanCount)), Integer.valueOf(spanSizeLookup.getSpanSize(childAdapterPosition)), Integer.valueOf(spanSizeLookup.getSpanGroupIndex(childAdapterPosition, spanCount)));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            kVar = new kotlin.k(Integer.valueOf(((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex()), 1, Integer.valueOf(childAdapterPosition / spanCount));
        } else {
            kVar = new kotlin.k(Integer.valueOf(childAdapterPosition % spanCount), 1, Integer.valueOf(childAdapterPosition / spanCount));
        }
        int intValue = ((Number) kVar.a()).intValue();
        int intValue2 = ((Number) kVar.b()).intValue();
        int intValue3 = ((Number) kVar.c()).intValue();
        boolean z3 = this.a;
        int i3 = z3 ? i - ((intValue * i) / spanCount) : (intValue * i) / spanCount;
        int i4 = z3 ? ((intValue + intValue2) * i) / spanCount : i - (((intValue + intValue2) * i) / spanCount);
        int i5 = (!z3 ? intValue3 == 0 : intValue3 != 0) ? i2 : 0;
        int i6 = z3 ? i2 : 0;
        if (z2) {
            rect.left = i3;
            rect.right = i4;
            rect.top = i5;
            rect.bottom = i6;
            return;
        }
        rect.top = i3;
        rect.bottom = i4;
        rect.left = i5;
        rect.right = i6;
    }
}
