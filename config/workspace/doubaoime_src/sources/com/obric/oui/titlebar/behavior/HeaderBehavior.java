package com.obric.oui.titlebar.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public abstract class HeaderBehavior<V extends View> extends c<V> {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f8138c;

    /* renamed from: d, reason: collision with root package name */
    OverScroller f8139d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8140e;

    /* renamed from: f, reason: collision with root package name */
    private int f8141f;

    /* renamed from: g, reason: collision with root package name */
    private int f8142g;
    private int h;

    @Nullable
    private VelocityTracker i;

    /* JADX WARN: Field signature parse error: b
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:160)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    private class a implements Runnable {
        private final CoordinatorLayout a;
        private final View b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (this.b == null || HeaderBehavior.this.f8139d == null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("FlingRunnable: ");
            M.append(this.b.getClass().getName());
            M.append("  scroller.getCurrY：");
            M.append(HeaderBehavior.this.f8139d.getCurrY());
            Log.i("djd ", M.toString());
            if (!HeaderBehavior.this.f8139d.computeScrollOffset()) {
                HeaderBehavior.this.onFlingFinished(this.a, this.b);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.setHeaderTopBottomOffset(this.a, this.b, headerBehavior.f8139d.getCurrY());
            ViewCompat.postOnAnimation(this.b, this);
        }
    }

    public HeaderBehavior() {
        this.f8141f = -1;
        this.h = -1;
    }

    protected void a() {
        OverScroller overScroller = this.f8139d;
        if (overScroller != null) {
            overScroller.abortAnimation();
        }
    }

    public boolean canDragView(V v) {
        return false;
    }

    public boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, float f2) {
        Runnable runnable = this.f8138c;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f8138c = null;
        }
        if (this.f8139d == null) {
            this.f8139d = new OverScroller(v.getContext());
        }
        this.f8139d.fling(0, super.getTopAndBottomOffset(), 0, Math.round(f2), 0, 0, i, i2);
        if (!this.f8139d.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v);
            return false;
        }
        a aVar = new a(coordinatorLayout, v);
        this.f8138c = aVar;
        ViewCompat.postOnAnimation(v, aVar);
        return true;
    }

    public int getMaxDragOffset(@NonNull V v) {
        return -v.getHeight();
    }

    public int getScrollRangeForDragFling(@NonNull V v) {
        return v.getHeight();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return super.getTopAndBottomOffset();
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f8140e) {
            int i = this.f8141f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f8142g) > this.h) {
                this.f8142g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f8141f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = canDragView(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.f8140e = z;
            if (z) {
                this.f8142g = y2;
                this.f8141f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f8139d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f8139d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull V r13, @androidx.annotation.NonNull android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f8141f = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f8142g = r12
            goto L4c
        L2d:
            int r0 = r11.f8141f
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f8142g
            int r7 = r1 - r0
            r11.f8142g = r0
            int r8 = r11.getMaxDragOffset(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.scroll(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.i
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.i
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.i
            int r4 = r11.f8141f
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.getScrollRangeForDragFling(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.fling(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f8140e = r3
            r11.f8141f = r1
            android.view.VelocityTracker r13 = r11.i
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.i = r13
        L81:
            android.view.VelocityTracker r13 = r11.i
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f8140e
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.titlebar.behavior.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int scroll(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int topAndBottomOffset = super.getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        super.setTopAndBottomOffset(clamp);
        return topAndBottomOffset - clamp;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8141f = -1;
        this.h = -1;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
