package com.bytedance.android.input.keyboard.word_segmentation;

import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.input.basic.IAppGlobals;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes.dex */
public final class ItemDragSelectImpl implements RecyclerView.OnItemTouchListener {

    @Deprecated
    private static final int i = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 30);
    private final com.bytedance.android.input.keyboard.word_segmentation.listener.a a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f2806c;

    /* renamed from: d, reason: collision with root package name */
    private final Choreographer f2807d;

    /* renamed from: e, reason: collision with root package name */
    private Choreographer.FrameCallback f2808e;

    /* renamed from: f, reason: collision with root package name */
    private float f2809f;

    /* renamed from: g, reason: collision with root package name */
    private float f2810g;
    private boolean h;

    public ItemDragSelectImpl(com.bytedance.android.input.keyboard.word_segmentation.listener.a aVar) {
        kotlin.s.c.l.f(aVar, "wordSeqItemSelectListener");
        this.a = aVar;
        this.b = -1;
        this.f2806c = -1;
        Choreographer choreographer = Choreographer.getInstance();
        kotlin.s.c.l.e(choreographer, "getInstance()");
        this.f2807d = choreographer;
    }

    private final int b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int height;
        int f2;
        kotlin.g gVar = new kotlin.g(Float.valueOf(kotlin.w.h.e(motionEvent.getX(), 0.0f, recyclerView.getWidth())), Float.valueOf(kotlin.w.h.e(motionEvent.getY(), 0.0f, recyclerView.getHeight())));
        float floatValue = ((Number) gVar.a()).floatValue();
        float floatValue2 = ((Number) gVar.b()).floatValue();
        View findChildViewUnder = recyclerView.findChildViewUnder(floatValue, floatValue2);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (findChildViewUnder != null) {
            f2 = recyclerView.getChildLayoutPosition(findChildViewUnder);
        } else {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.s.c.l.d(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
            float computeVerticalScrollOffset = floatValue2 + recyclerView.computeVerticalScrollOffset();
            int childCount = flexboxLayoutManager.getChildCount();
            if (childCount > 0) {
                View childAt = flexboxLayoutManager.getChildAt(0);
                View childAt2 = flexboxLayoutManager.getChildAt(childCount - 1);
                height = (childAt2 != null ? childAt2.getBottom() : recyclerView.getHeight()) - (childAt != null ? childAt.getTop() : 0);
            } else {
                height = recyclerView.getHeight();
            }
            float f3 = height;
            if (childCount < 1) {
                childCount = 1;
            }
            f2 = kotlin.w.h.f((int) (computeVerticalScrollOffset / (f3 / childCount)), 0, itemCount - 1);
        }
        if (f2 >= itemCount) {
            return -1;
        }
        return f2;
    }

    private final void c(String str) {
        IAppGlobals.a.j("ItemDragSelectListener", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "rv"
            kotlin.s.c.l.f(r6, r0)
            java.lang.String r0 = "e"
            kotlin.s.c.l.f(r7, r0)
            int r0 = r7.getActionMasked()
            r1 = 0
            if (r0 == 0) goto Lb4
            r2 = -1
            r3 = 1
            if (r0 == r3) goto La8
            r4 = 2
            if (r0 == r4) goto L1d
            r6 = 3
            if (r0 == r6) goto La8
            goto Ld2
        L1d:
            java.lang.String r0 = "onInterceptTouchEvent ACTION_MOVE scrollState = "
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            int r4 = r6.getScrollState()
            r0.append(r4)
            java.lang.String r4 = "--e.x = "
            r0.append(r4)
            float r4 = r7.getX()
            r0.append(r4)
            java.lang.String r4 = "---e.y = "
            r0.append(r4)
            float r4 = r7.getY()
            r0.append(r4)
            java.lang.String r4 = "---recyclerView Height = "
            r0.append(r4)
            int r4 = r6.getHeight()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.c(r0)
            int r0 = r6.getScrollState()
            if (r0 != 0) goto Ld2
            float r0 = r7.getX()
            float r1 = r5.f2809f
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r7.getY()
            float r4 = r5.f2810g
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L83
            boolean r4 = r5.h
            if (r4 != 0) goto L83
            int r6 = r5.b(r6, r7)
            if (r6 == r2) goto L81
            r5.b = r6
        L81:
            r5.h = r3
        L83:
            java.lang.String r6 = "onInterceptTouchEvent isSelecting = "
            java.lang.StringBuilder r6 = e.a.a.a.a.M(r6)
            boolean r7 = r5.h
            r6.append(r7)
            java.lang.String r7 = "---dx = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = "--- dy = "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.c(r6)
            boolean r6 = r5.h
            return r6
        La8:
            java.lang.String r6 = "onInterceptTouchEvent ACTION_UP or ACTION_CANCEL"
            r5.c(r6)
            r5.h = r1
            r5.b = r2
            r5.f2806c = r2
            goto Ld2
        Lb4:
            java.lang.String r6 = "onInterceptTouchEvent ACTION_DOWN---isSelecting = "
            java.lang.StringBuilder r6 = e.a.a.a.a.M(r6)
            boolean r0 = r5.h
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.c(r6)
            float r6 = r7.getX()
            r5.f2809f = r6
            float r6 = r7.getY()
            r5.f2810g = r6
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.word_segmentation.ItemDragSelectImpl.onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        kotlin.s.c.l.f(recyclerView, "rv");
        kotlin.s.c.l.f(motionEvent, "e");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                StringBuilder M = e.a.a.a.a.M("onTouchEvent ACTION_MOVE RecyclerView Height = ");
                M.append(recyclerView.getHeight());
                c(M.toString());
                int b = b(recyclerView, motionEvent);
                if (b != -1 && this.f2806c != b) {
                    this.a.a(Math.min(this.b, b), Math.max(this.b, b));
                    this.f2806c = b;
                }
                int y = (int) motionEvent.getY();
                int height = recyclerView.getHeight();
                int i2 = i;
                if (y < i2) {
                    int i3 = -((int) e.a.a.a.a.m("Resources.getSystem()", 1, 1));
                    if (this.f2808e != null) {
                        return;
                    }
                    i iVar = new i(recyclerView, i3, this);
                    this.f2808e = iVar;
                    this.f2807d.postFrameCallback(iVar);
                    return;
                }
                if (y <= height - i2) {
                    Choreographer.FrameCallback frameCallback = this.f2808e;
                    if (frameCallback != null) {
                        this.f2807d.removeFrameCallback(frameCallback);
                        this.f2808e = null;
                        return;
                    }
                    return;
                }
                int m = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 1);
                if (this.f2808e != null) {
                    return;
                }
                i iVar2 = new i(recyclerView, m, this);
                this.f2808e = iVar2;
                this.f2807d.postFrameCallback(iVar2);
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        c("onTouchEvent ACTION_UP or ACTION_CANCEL");
        this.a.onFinish();
        Choreographer.FrameCallback frameCallback2 = this.f2808e;
        if (frameCallback2 != null) {
            this.f2807d.removeFrameCallback(frameCallback2);
            this.f2808e = null;
        }
        this.h = false;
        this.b = -1;
        this.f2806c = -1;
    }
}
