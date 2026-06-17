package com.bytedance.android.input.keyboard.emoji;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes.dex */
public final class GridDividerDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        kotlin.s.c.l.f(rect, "outRect");
        kotlin.s.c.l.f(view, "view");
        kotlin.s.c.l.f(recyclerView, "parent");
        kotlin.s.c.l.f(state, WsConstants.KEY_CONNECTION_STATE);
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
    }
}
