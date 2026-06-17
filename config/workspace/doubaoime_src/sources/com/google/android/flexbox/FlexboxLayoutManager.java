package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements com.google.android.flexbox.a, RecyclerView.SmoothScroller.ScrollVectorProvider {
    private static final Rect z = new Rect();
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f6737c;

    /* renamed from: d, reason: collision with root package name */
    private int f6738d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6740f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6741g;
    private RecyclerView.Recycler j;
    private RecyclerView.State k;
    private c l;
    private OrientationHelper n;
    private OrientationHelper o;
    private SavedState p;
    private final Context v;
    private View w;

    /* renamed from: e, reason: collision with root package name */
    private int f6739e = -1;
    private List<com.google.android.flexbox.b> h = new ArrayList();
    private final com.google.android.flexbox.c i = new com.google.android.flexbox.c(this);
    private b m = new b(null);
    private int q = -1;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private int t = Integer.MIN_VALUE;
    private SparseArray<View> u = new SparseArray<>();
    private int x = -1;
    private c.b y = new c.b();

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private int a;
        private int b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (a) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        static void f(SavedState savedState) {
            savedState.a = -1;
        }

        static boolean g(SavedState savedState, int i) {
            int i2 = savedState.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SavedState{mAnchorPosition=");
            M.append(this.a);
            M.append(", mAnchorOffset=");
            return e.a.a.a.a.C(M, this.b, '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        SavedState(Parcel parcel, a aVar) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        SavedState(SavedState savedState, a aVar) {
            this.a = savedState.a;
            this.b = savedState.b;
        }
    }

    private class b {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f6747c;

        /* renamed from: d, reason: collision with root package name */
        private int f6748d = 0;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6749e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6750f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6751g;

        b(a aVar) {
        }

        static void e(b bVar) {
            if (FlexboxLayoutManager.this.r() || !FlexboxLayoutManager.this.f6740f) {
                bVar.f6747c = bVar.f6749e ? FlexboxLayoutManager.this.n.getEndAfterPadding() : FlexboxLayoutManager.this.n.getStartAfterPadding();
            } else {
                bVar.f6747c = bVar.f6749e ? FlexboxLayoutManager.this.n.getEndAfterPadding() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.n.getStartAfterPadding();
            }
        }

        static void i(b bVar, View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.b == 0 ? FlexboxLayoutManager.this.o : FlexboxLayoutManager.this.n;
            if (FlexboxLayoutManager.this.r() || !FlexboxLayoutManager.this.f6740f) {
                if (bVar.f6749e) {
                    bVar.f6747c = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedEnd(view);
                } else {
                    bVar.f6747c = orientationHelper.getDecoratedStart(view);
                }
            } else if (bVar.f6749e) {
                bVar.f6747c = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedStart(view);
            } else {
                bVar.f6747c = orientationHelper.getDecoratedEnd(view);
            }
            bVar.a = FlexboxLayoutManager.this.getPosition(view);
            bVar.f6751g = false;
            int[] iArr = FlexboxLayoutManager.this.i.f6762c;
            int i = bVar.a;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            bVar.b = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.h.size() > bVar.b) {
                bVar.a = ((com.google.android.flexbox.b) FlexboxLayoutManager.this.h.get(bVar.b)).o;
            }
        }

        static /* synthetic */ int l(b bVar, int i) {
            int i2 = bVar.f6748d + i;
            bVar.f6748d = i2;
            return i2;
        }

        static void o(b bVar) {
            bVar.a = -1;
            bVar.b = -1;
            bVar.f6747c = Integer.MIN_VALUE;
            bVar.f6750f = false;
            bVar.f6751g = false;
            if (FlexboxLayoutManager.this.r()) {
                if (FlexboxLayoutManager.this.b == 0) {
                    bVar.f6749e = FlexboxLayoutManager.this.a == 1;
                    return;
                } else {
                    bVar.f6749e = FlexboxLayoutManager.this.b == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.b == 0) {
                bVar.f6749e = FlexboxLayoutManager.this.a == 3;
            } else {
                bVar.f6749e = FlexboxLayoutManager.this.b == 2;
            }
        }

        @NonNull
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AnchorInfo{mPosition=");
            M.append(this.a);
            M.append(", mFlexLinePosition=");
            M.append(this.b);
            M.append(", mCoordinate=");
            M.append(this.f6747c);
            M.append(", mPerpendicularCoordinate=");
            M.append(this.f6748d);
            M.append(", mLayoutFromEnd=");
            M.append(this.f6749e);
            M.append(", mValid=");
            M.append(this.f6750f);
            M.append(", mAssignedFromSavedState=");
            return e.a.a.a.a.L(M, this.f6751g, '}');
        }
    }

    private static class c {
        private int a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private int f6752c;

        /* renamed from: d, reason: collision with root package name */
        private int f6753d;

        /* renamed from: e, reason: collision with root package name */
        private int f6754e;

        /* renamed from: f, reason: collision with root package name */
        private int f6755f;

        /* renamed from: g, reason: collision with root package name */
        private int f6756g;
        private int h = 1;
        private int i = 1;
        private boolean j;

        c(a aVar) {
        }

        static /* synthetic */ int c(c cVar, int i) {
            int i2 = cVar.f6754e + i;
            cVar.f6754e = i2;
            return i2;
        }

        static /* synthetic */ int d(c cVar, int i) {
            int i2 = cVar.f6754e - i;
            cVar.f6754e = i2;
            return i2;
        }

        static /* synthetic */ int i(c cVar, int i) {
            int i2 = cVar.a - i;
            cVar.a = i2;
            return i2;
        }

        static /* synthetic */ int l(c cVar) {
            int i = cVar.f6752c;
            cVar.f6752c = i + 1;
            return i;
        }

        static /* synthetic */ int m(c cVar) {
            int i = cVar.f6752c;
            cVar.f6752c = i - 1;
            return i;
        }

        static /* synthetic */ int n(c cVar, int i) {
            int i2 = cVar.f6752c + i;
            cVar.f6752c = i2;
            return i2;
        }

        static /* synthetic */ int q(c cVar, int i) {
            int i2 = cVar.f6755f + i;
            cVar.f6755f = i2;
            return i2;
        }

        static boolean r(c cVar, RecyclerView.State state, List list) {
            int i;
            int i2 = cVar.f6753d;
            return i2 >= 0 && i2 < state.getItemCount() && (i = cVar.f6752c) >= 0 && i < list.size();
        }

        static /* synthetic */ int u(c cVar, int i) {
            int i2 = cVar.f6753d + i;
            cVar.f6753d = i2;
            return i2;
        }

        static /* synthetic */ int v(c cVar, int i) {
            int i2 = cVar.f6753d - i;
            cVar.f6753d = i2;
            return i2;
        }

        @NonNull
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LayoutState{mAvailable=");
            M.append(this.a);
            M.append(", mFlexLinePosition=");
            M.append(this.f6752c);
            M.append(", mPosition=");
            M.append(this.f6753d);
            M.append(", mOffset=");
            M.append(this.f6754e);
            M.append(", mScrollingOffset=");
            M.append(this.f6755f);
            M.append(", mLastScrollDelta=");
            M.append(this.f6756g);
            M.append(", mItemDirection=");
            M.append(this.h);
            M.append(", mLayoutDirection=");
            return e.a.a.a.a.C(M, this.i, '}');
        }
    }

    public FlexboxLayoutManager(Context context) {
        O(0);
        P(1);
        N(4);
        this.v = context;
    }

    private void A() {
        this.h.clear();
        b.o(this.m);
        this.m.f6748d = 0;
    }

    private void B() {
        if (this.n != null) {
            return;
        }
        if (r()) {
            if (this.b == 0) {
                this.n = OrientationHelper.createHorizontalHelper(this);
                this.o = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.n = OrientationHelper.createVerticalHelper(this);
                this.o = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.b == 0) {
            this.n = OrientationHelper.createVerticalHelper(this);
            this.o = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.n = OrientationHelper.createHorizontalHelper(this);
            this.o = OrientationHelper.createVerticalHelper(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0454, code lost:
    
        r17 = r3;
        com.google.android.flexbox.FlexboxLayoutManager.c.i(r33, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x045f, code lost:
    
        if (r33.f6755f == Integer.MIN_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0461, code lost:
    
        com.google.android.flexbox.FlexboxLayoutManager.c.q(r33, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0468, code lost:
    
        if (r33.a >= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x046a, code lost:
    
        com.google.android.flexbox.FlexboxLayoutManager.c.q(r33, r33.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0471, code lost:
    
        L(r31, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x047a, code lost:
    
        return r17 - r33.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int C(androidx.recyclerview.widget.RecyclerView.Recycler r31, androidx.recyclerview.widget.RecyclerView.State r32, com.google.android.flexbox.FlexboxLayoutManager.c r33) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.C(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private View D(int i) {
        View I = I(0, getChildCount(), i);
        if (I == null) {
            return null;
        }
        int i2 = this.i.f6762c[getPosition(I)];
        if (i2 == -1) {
            return null;
        }
        return E(I, this.h.get(i2));
    }

    private View E(View view, com.google.android.flexbox.b bVar) {
        boolean r = r();
        int i = bVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f6740f || r) {
                    if (this.n.getDecoratedStart(view) <= this.n.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.n.getDecoratedEnd(view) >= this.n.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View F(int i) {
        View I = I(getChildCount() - 1, -1, i);
        if (I == null) {
            return null;
        }
        return G(I, this.h.get(this.i.f6762c[getPosition(I)]));
    }

    private View G(View view, com.google.android.flexbox.b bVar) {
        boolean r = r();
        int childCount = (getChildCount() - bVar.h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f6740f || r) {
                    if (this.n.getDecoratedEnd(view) >= this.n.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.n.getDecoratedStart(view) <= this.n.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View H(int i, int i2, boolean z2) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z3 = false;
            boolean z4 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z5 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z6 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z7 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (!z2 ? !(!z5 || !z7) : !(!z4 || !z6)) {
                z3 = true;
            }
            if (z3) {
                return childAt;
            }
            i3 += i4;
        }
        return null;
    }

    private View I(int i, int i2, int i3) {
        int position;
        B();
        View view = null;
        if (this.l == null) {
            this.l = new c(null);
        }
        int startAfterPadding = this.n.getStartAfterPadding();
        int endAfterPadding = this.n.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.n.getDecoratedStart(childAt) >= startAfterPadding && this.n.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int J(int r19, androidx.recyclerview.widget.RecyclerView.Recycler r20, androidx.recyclerview.widget.RecyclerView.State r21) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.J(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    private int K(int i) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        B();
        boolean r = r();
        View view = this.w;
        int width = r ? view.getWidth() : view.getHeight();
        int width2 = r ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((width2 + this.m.f6748d) - width, abs);
            } else {
                if (this.m.f6748d + i <= 0) {
                    return i;
                }
                i2 = this.m.f6748d;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.m.f6748d) - width, i);
            }
            if (this.m.f6748d + i >= 0) {
                return i;
            }
            i2 = this.m.f6748d;
        }
        return -i2;
    }

    private void L(RecyclerView.Recycler recycler, c cVar) {
        int childCount;
        View childAt;
        int i;
        int childCount2;
        int i2;
        View childAt2;
        int i3;
        if (cVar.j) {
            int i4 = -1;
            if (cVar.i == -1) {
                if (cVar.f6755f < 0 || (childCount2 = getChildCount()) == 0 || (childAt2 = getChildAt(childCount2 - 1)) == null || (i3 = this.i.f6762c[getPosition(childAt2)]) == -1) {
                    return;
                }
                com.google.android.flexbox.b bVar = this.h.get(i3);
                int i5 = i2;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View childAt3 = getChildAt(i5);
                    if (childAt3 != null) {
                        int i6 = cVar.f6755f;
                        if (!(r() || !this.f6740f ? this.n.getDecoratedStart(childAt3) >= this.n.getEnd() - i6 : this.n.getDecoratedEnd(childAt3) <= i6)) {
                            break;
                        }
                        if (bVar.o != getPosition(childAt3)) {
                            continue;
                        } else if (i3 <= 0) {
                            childCount2 = i5;
                            break;
                        } else {
                            i3 += cVar.i;
                            bVar = this.h.get(i3);
                            childCount2 = i5;
                        }
                    }
                    i5--;
                }
                while (i2 >= childCount2) {
                    removeAndRecycleViewAt(i2, recycler);
                    i2--;
                }
                return;
            }
            if (cVar.f6755f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null || (i = this.i.f6762c[getPosition(childAt)]) == -1) {
                return;
            }
            com.google.android.flexbox.b bVar2 = this.h.get(i);
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt4 = getChildAt(i7);
                if (childAt4 != null) {
                    int i8 = cVar.f6755f;
                    if (!(r() || !this.f6740f ? this.n.getDecoratedEnd(childAt4) <= i8 : this.n.getEnd() - this.n.getDecoratedStart(childAt4) <= i8)) {
                        break;
                    }
                    if (bVar2.p != getPosition(childAt4)) {
                        continue;
                    } else if (i >= this.h.size() - 1) {
                        i4 = i7;
                        break;
                    } else {
                        i += cVar.i;
                        bVar2 = this.h.get(i);
                        i4 = i7;
                    }
                }
                i7++;
            }
            while (i4 >= 0) {
                removeAndRecycleViewAt(i4, recycler);
                i4--;
            }
        }
    }

    private void M() {
        int heightMode = r() ? getHeightMode() : getWidthMode();
        this.l.b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void R(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.i.l(childCount);
        this.i.m(childCount);
        this.i.k(childCount);
        if (i >= this.i.f6762c.length) {
            return;
        }
        this.x = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.q = getPosition(childAt);
        if (r() || !this.f6740f) {
            this.r = this.n.getDecoratedStart(childAt) - this.n.getStartAfterPadding();
        } else {
            this.r = this.n.getEndPadding() + this.n.getDecoratedEnd(childAt);
        }
    }

    private void S(b bVar, boolean z2, boolean z3) {
        if (z3) {
            M();
        } else {
            this.l.b = false;
        }
        if (r() || !this.f6740f) {
            this.l.a = this.n.getEndAfterPadding() - bVar.f6747c;
        } else {
            this.l.a = bVar.f6747c - getPaddingRight();
        }
        this.l.f6753d = bVar.a;
        this.l.h = 1;
        this.l.i = 1;
        this.l.f6754e = bVar.f6747c;
        this.l.f6755f = Integer.MIN_VALUE;
        this.l.f6752c = bVar.b;
        if (!z2 || this.h.size() <= 1 || bVar.b < 0 || bVar.b >= this.h.size() - 1) {
            return;
        }
        com.google.android.flexbox.b bVar2 = this.h.get(bVar.b);
        c.l(this.l);
        c.u(this.l, bVar2.h);
    }

    private void T(b bVar, boolean z2, boolean z3) {
        if (z3) {
            M();
        } else {
            this.l.b = false;
        }
        if (r() || !this.f6740f) {
            this.l.a = bVar.f6747c - this.n.getStartAfterPadding();
        } else {
            this.l.a = (this.w.getWidth() - bVar.f6747c) - this.n.getStartAfterPadding();
        }
        this.l.f6753d = bVar.a;
        this.l.h = 1;
        this.l.i = -1;
        this.l.f6754e = bVar.f6747c;
        this.l.f6755f = Integer.MIN_VALUE;
        this.l.f6752c = bVar.b;
        if (!z2 || bVar.b <= 0 || this.h.size() <= bVar.b) {
            return;
        }
        com.google.android.flexbox.b bVar2 = this.h.get(bVar.b);
        c.m(this.l);
        c.v(this.l, bVar2.h);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        B();
        View D = D(itemCount);
        View F = F(itemCount);
        if (state.getItemCount() == 0 || D == null || F == null) {
            return 0;
        }
        return Math.min(this.n.getTotalSpace(), this.n.getDecoratedEnd(F) - this.n.getDecoratedStart(D));
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View D = D(itemCount);
        View F = F(itemCount);
        if (state.getItemCount() != 0 && D != null && F != null) {
            int position = getPosition(D);
            int position2 = getPosition(F);
            int abs = Math.abs(this.n.getDecoratedEnd(F) - this.n.getDecoratedStart(D));
            int i = this.i.f6762c[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((r4[position2] - i) + 1))) + (this.n.getStartAfterPadding() - this.n.getDecoratedStart(D)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View D = D(itemCount);
        View F = F(itemCount);
        if (state.getItemCount() == 0 || D == null || F == null) {
            return 0;
        }
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.n.getDecoratedEnd(F) - this.n.getDecoratedStart(D)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1)) * state.getItemCount());
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int i2;
        int endAfterPadding;
        if (!r() && this.f6740f) {
            int startAfterPadding = i - this.n.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            i2 = J(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.n.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -J(-endAfterPadding2, recycler, state);
        }
        int i3 = i + i2;
        if (!z2 || (endAfterPadding = this.n.getEndAfterPadding() - i3) <= 0) {
            return i2;
        }
        this.n.offsetChildren(endAfterPadding);
        return endAfterPadding + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int i2;
        int startAfterPadding;
        if (r() || !this.f6740f) {
            int startAfterPadding2 = i - this.n.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -J(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.n.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            i2 = J(-endAfterPadding, recycler, state);
        }
        int i3 = i + i2;
        if (!z2 || (startAfterPadding = i3 - this.n.getStartAfterPadding()) <= 0) {
            return i2;
        }
        this.n.offsetChildren(-startAfterPadding);
        return i2 - startAfterPadding;
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public void N(int i) {
        int i2 = this.f6738d;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                A();
            }
            this.f6738d = i;
            requestLayout();
        }
    }

    public void O(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.n = null;
            this.o = null;
            A();
            requestLayout();
        }
    }

    public void P(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.b;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                removeAllViews();
                A();
            }
            this.b = i;
            this.n = null;
            this.o = null;
            requestLayout();
        }
    }

    public void Q(int i) {
        if (this.f6737c != i) {
            this.f6737c = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public int a() {
        return this.k.getItemCount();
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i, int i2, com.google.android.flexbox.b bVar) {
        calculateItemDecorationsForChild(view, z);
        if (r()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            bVar.f6759e += rightDecorationWidth;
            bVar.f6760f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        bVar.f6759e += bottomDecorationHeight;
        bVar.f6760f += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.a
    public int c() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.b == 0) {
            return r();
        }
        if (r()) {
            int width = getWidth();
            View view = this.w;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.b == 0) {
            return !r();
        }
        if (r()) {
            return true;
        }
        int height = getHeight();
        View view = this.w;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return r() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // com.google.android.flexbox.a
    public int d() {
        return this.f6739e;
    }

    @Override // com.google.android.flexbox.a
    public int e() {
        if (this.h.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.h.get(i2).f6759e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int f() {
        return this.b;
    }

    public int findFirstVisibleItemPosition() {
        View H = H(0, getChildCount(), false);
        if (H == null) {
            return -1;
        }
        return getPosition(H);
    }

    public int findLastVisibleItemPosition() {
        View H = H(getChildCount() - 1, -1, false);
        if (H == null) {
            return -1;
        }
        return getPosition(H);
    }

    @Override // com.google.android.flexbox.a
    public void g(com.google.android.flexbox.b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public View h(int i) {
        return m(i);
    }

    @Override // com.google.android.flexbox.a
    public int i(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.flexbox.a
    public int j() {
        return this.f6738d;
    }

    @Override // com.google.android.flexbox.a
    public void k(int i, View view) {
        this.u.put(i, view);
    }

    @Override // com.google.android.flexbox.a
    public int l() {
        int size = this.h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.h.get(i2).f6761g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public View m(int i) {
        View view = this.u.get(i);
        return view != null ? view : this.j.getViewForPosition(i);
    }

    @Override // com.google.android.flexbox.a
    public int n(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (r()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.b> o() {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.w = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        R(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        R(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        R(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        R(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023d  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.x = -1;
        b.o(this.m);
        this.u.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.p;
        if (savedState != null) {
            return new SavedState(savedState, (a) null);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.a = getPosition(childAt);
            savedState2.b = this.n.getDecoratedStart(childAt) - this.n.getStartAfterPadding();
        } else {
            SavedState.f(savedState2);
        }
        return savedState2;
    }

    @Override // com.google.android.flexbox.a
    public int p(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // com.google.android.flexbox.a
    public int q() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public boolean r() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.a
    public int s(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (r()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!r() || this.b == 0) {
            int J2 = J(i, recycler, state);
            this.u.clear();
            return J2;
        }
        int K = K(i);
        b.l(this.m, K);
        this.o.offsetChildren(-K);
        return K;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            SavedState.f(savedState);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (r() || (this.b == 0 && !r())) {
            int J2 = J(i, recycler, state);
            this.u.clear();
            return J2;
        }
        int K = K(i);
        b.l(this.m, K);
        this.o.offsetChildren(-K);
        return K;
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.b> list) {
        this.h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        R(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private float a;
        private float b;

        /* renamed from: c, reason: collision with root package name */
        private int f6742c;

        /* renamed from: d, reason: collision with root package name */
        private float f6743d;

        /* renamed from: e, reason: collision with root package name */
        private int f6744e;

        /* renamed from: f, reason: collision with root package name */
        private int f6745f;

        /* renamed from: g, reason: collision with root package name */
        private int f6746g;
        private int h;
        private boolean i;

        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            this.b = 1.0f;
            this.f6742c = -1;
            this.f6743d = -1.0f;
            this.f6746g = ViewCompat.MEASURED_SIZE_MASK;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void G(int i) {
            this.f6744e = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int H() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int M() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Q(int i) {
            this.f6745f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float S() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float U() {
            return this.f6743d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        public void a(boolean z) {
            this.i = z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int a0() {
            return this.f6745f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean c0() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f0() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int l0() {
            return this.f6746g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int s() {
            return this.f6742c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float w() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.f6742c);
            parcel.writeFloat(this.f6743d);
            parcel.writeInt(this.f6744e);
            parcel.writeInt(this.f6745f);
            parcel.writeInt(this.f6746g);
            parcel.writeInt(this.h);
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int z() {
            return this.f6744e;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.f6742c = -1;
            this.f6743d = -1.0f;
            this.f6746g = ViewCompat.MEASURED_SIZE_MASK;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.f6742c = -1;
            this.f6743d = -1.0f;
            this.f6746g = ViewCompat.MEASURED_SIZE_MASK;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.f6742c = parcel.readInt();
            this.f6743d = parcel.readFloat();
            this.f6744e = parcel.readInt();
            this.f6745f = parcel.readInt();
            this.f6746g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.reverseLayout) {
                    O(3);
                } else {
                    O(2);
                }
            }
        } else if (properties.reverseLayout) {
            O(1);
        } else {
            O(0);
        }
        P(1);
        N(4);
        this.v = context;
    }
}
