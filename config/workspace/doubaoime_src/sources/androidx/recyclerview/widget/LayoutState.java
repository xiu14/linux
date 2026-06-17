package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.a;

/* loaded from: classes.dex */
class LayoutState {
    static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    int mAvailable;
    int mCurrentPosition;
    boolean mInfinite;
    int mItemDirection;
    int mLayoutDirection;
    boolean mStopInFocusable;
    boolean mRecycle = true;
    int mStartLine = 0;
    int mEndLine = 0;

    LayoutState() {
    }

    boolean hasMore(RecyclerView.State state) {
        int i = this.mCurrentPosition;
        return i >= 0 && i < state.getItemCount();
    }

    View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder M = a.M("LayoutState{mAvailable=");
        M.append(this.mAvailable);
        M.append(", mCurrentPosition=");
        M.append(this.mCurrentPosition);
        M.append(", mItemDirection=");
        M.append(this.mItemDirection);
        M.append(", mLayoutDirection=");
        M.append(this.mLayoutDirection);
        M.append(", mStartLine=");
        M.append(this.mStartLine);
        M.append(", mEndLine=");
        return a.C(M, this.mEndLine, '}');
    }
}
