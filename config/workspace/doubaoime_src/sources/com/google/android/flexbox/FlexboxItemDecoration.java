package com.google.android.flexbox;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class FlexboxItemDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
    }
}
