package com.bytedance.feedbackerlib.activity;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
class A extends RecyclerView.ItemDecoration {
    final /* synthetic */ FeedbackActivity a;

    A(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        Resources resources = this.a.getResources();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % 3;
        if (childAdapterPosition == 0) {
            rect.right = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
        } else if (childAdapterPosition == 1) {
            rect.left = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
            rect.right = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
        } else {
            rect.left = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
        }
        rect.top = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
        rect.bottom = resources.getDimensionPixelSize(C0838R.dimen.dp_5);
    }
}
