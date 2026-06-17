package com.bytedance.common_biz.ui.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.ViewGroupKt;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class ImeCustomSwipeLayout extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private VelocityTracker E;

    /* renamed from: J, reason: collision with root package name */
    private ValueAnimator f4348J;
    private c K;
    private long L;
    private long M;
    private final int a;
    private final LinkedHashSet<b> b;

    /* renamed from: c, reason: collision with root package name */
    private final DecelerateInterpolator f4349c;

    /* renamed from: d, reason: collision with root package name */
    private DragEdge f4350d;

    /* renamed from: e, reason: collision with root package name */
    private RevealMode f4351e;

    /* renamed from: f, reason: collision with root package name */
    private SecondaryRevealStyle f4352f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4353g;
    private String h;
    private boolean i;
    private long j;
    private float k;
    private float l;
    private int m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public enum DragEdge {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public enum RevealMode {
        NORMAL,
        SAME_LEVEL
    }

    public enum SecondaryRevealStyle {
        UNDER_CONTENT,
        OUTSIDE
    }

    public interface b {
        void a(ImeCustomSwipeLayout imeCustomSwipeLayout, boolean z);
    }

    public interface c {
        void a(ImeCustomSwipeLayout imeCustomSwipeLayout);

        void b(ImeCustomSwipeLayout imeCustomSwipeLayout);

        void c(ImeCustomSwipeLayout imeCustomSwipeLayout);

        void d(ImeCustomSwipeLayout imeCustomSwipeLayout);

        void e(ImeCustomSwipeLayout imeCustomSwipeLayout, float f2);
    }

    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ float b;

        d(float f2) {
            this.b = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            l.f(animator, "animation");
            if (ImeCustomSwipeLayout.this.f4348J == animator) {
                ImeCustomSwipeLayout.this.f4348J = null;
            }
            if (!ImeCustomSwipeLayout.this.q(this.b)) {
                ImeCustomSwipeLayout.this.j(this.b, false);
            }
            ImeCustomSwipeLayout imeCustomSwipeLayout = ImeCustomSwipeLayout.this;
            StringBuilder M = e.a.a.a.a.M("animateTo cancel alignedOffset=");
            M.append(ImeCustomSwipeLayout.this.s);
            M.append(" target=");
            M.append(this.b);
            ImeCustomSwipeLayout.f(imeCustomSwipeLayout, M.toString());
            ImeCustomSwipeLayout.this.o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.f(animator, "animation");
            if (ImeCustomSwipeLayout.this.f4348J == animator) {
                ImeCustomSwipeLayout.this.f4348J = null;
            }
            if (!ImeCustomSwipeLayout.this.q(this.b)) {
                ImeCustomSwipeLayout.this.j(this.b, false);
            }
            ImeCustomSwipeLayout imeCustomSwipeLayout = ImeCustomSwipeLayout.this;
            StringBuilder M = e.a.a.a.a.M("animateTo end finalOffset=");
            M.append(ImeCustomSwipeLayout.this.s);
            M.append(" opened=");
            M.append(ImeCustomSwipeLayout.this.t());
            M.append(" closed=");
            M.append(ImeCustomSwipeLayout.this.r());
            ImeCustomSwipeLayout.f(imeCustomSwipeLayout, M.toString());
            ImeCustomSwipeLayout.this.o();
        }
    }

    static final class e extends m implements kotlin.s.b.l<View, CharSequence> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(View view) {
            View view2 = view;
            l.f(view2, "it");
            String simpleName = view2.getClass().getSimpleName();
            l.e(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCustomSwipeLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final float A() {
        return Math.min(0.0f, this.t);
    }

    private final float C(MotionEvent motionEvent, int i) {
        return s() ? motionEvent.getX(i) : motionEvent.getY(i);
    }

    private final void E(boolean z) {
        this.C = true;
        this.D = z;
        v(e.a.a.a.a.A("requestRelayout animated=", z));
        requestLayout();
    }

    private final void F() {
        this.m = -1;
        this.q = false;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.E = null;
    }

    private final float G(MotionEvent motionEvent, int i) {
        return s() ? motionEvent.getY(i) : motionEvent.getX(i);
    }

    private final View H() {
        if (getChildCount() >= 1) {
            return getChildAt(0);
        }
        return null;
    }

    private final boolean I(float f2, float f3) {
        if (Math.abs(f2) <= this.a || Math.abs(f2) <= Math.abs(f3)) {
            return false;
        }
        return this.u || !q(0.0f) || f2 * this.t > 0.0f;
    }

    private final float J() {
        float f2 = this.t;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return h.e(this.s / f2, 0.0f, 1.0f);
    }

    private final void K() {
        if (this.f4348J != null) {
            StringBuilder M = e.a.a.a.a.M("stopSettleAnimation currentOffset=");
            M.append(this.s);
            v(M.toString());
        }
        ValueAnimator valueAnimator = this.f4348J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f4348J = null;
    }

    private final void L(boolean z) {
        if (getChildCount() < 2) {
            return;
        }
        if (getWidth() == 0 || getHeight() == 0 || this.r == 0) {
            E(z);
            return;
        }
        float f2 = this.u ? this.t : 0.0f;
        if (z) {
            i(f2);
            return;
        }
        K();
        j(f2, true);
        o();
    }

    public static final void f(ImeCustomSwipeLayout imeCustomSwipeLayout, String str) {
        if (imeCustomSwipeLayout.f4353g) {
            IAppGlobals.a.j("ImeCustomSwipeLayout", str);
        }
    }

    private final void i(float f2) {
        K();
        if (q(f2)) {
            v("animateTo skip targetOffset=" + f2 + " alreadyAtTarget");
            j(f2, true);
            o();
            return;
        }
        this.M = System.currentTimeMillis();
        v("animateTo start from=" + this.s + " to=" + f2 + " duration=" + this.j + " open=" + this.u);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f2);
        ofFloat.setDuration(this.j);
        ofFloat.setInterpolator(this.f4349c);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.common_biz.ui.widget.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImeCustomSwipeLayout.u(ImeCustomSwipeLayout.this, valueAnimator);
            }
        });
        ofFloat.addListener(new d(f2));
        ofFloat.start();
        this.f4348J = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(float f2, boolean z) {
        View H;
        c cVar;
        View w = w();
        if (w == null || (H = H()) == null) {
            return;
        }
        float e2 = h.e(f2, A(), x());
        this.s = e2;
        if (s()) {
            w.setTranslationX(e2);
            w.setTranslationY(0.0f);
            if (this.f4351e != RevealMode.SAME_LEVEL) {
                e2 = this.f4352f == SecondaryRevealStyle.OUTSIDE ? (this.y - this.A) * J() : 0.0f;
            }
            H.setTranslationX(e2);
            H.setTranslationY(0.0f);
        } else {
            w.setTranslationX(0.0f);
            w.setTranslationY(e2);
            H.setTranslationX(0.0f);
            if (this.f4351e != RevealMode.SAME_LEVEL) {
                e2 = this.f4352f == SecondaryRevealStyle.OUTSIDE ? (this.z - this.B) * J() : 0.0f;
            }
            H.setTranslationY(e2);
        }
        if (!z || (cVar = this.K) == null) {
            return;
        }
        cVar.e(this, J());
    }

    private final boolean k() {
        return this.i && getChildCount() >= 2 && this.r > 0;
    }

    private final void l() {
        if (getChildCount() > 2) {
            kotlin.x.e<View> children = ViewGroupKt.getChildren(this);
            e eVar = e.a;
            l.f(children, "<this>");
            l.f(", ", "separator");
            l.f("", "prefix");
            l.f("", "postfix");
            l.f("...", "truncated");
            StringBuilder sb = new StringBuilder();
            l.f(children, "<this>");
            l.f(sb, "buffer");
            l.f(", ", "separator");
            l.f("", "prefix");
            l.f("", "postfix");
            l.f("...", "truncated");
            sb.append((CharSequence) "");
            int i = 0;
            for (View view : children) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                kotlin.text.a.a(sb, view, eVar);
            }
            sb.append((CharSequence) "");
            String sb2 = sb.toString();
            l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            throw new IllegalStateException(("ImeSwipeRevealLayout supports exactly 2 children at most. Current children: " + sb2).toString());
        }
    }

    private final int n(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        a aVar = marginLayoutParams instanceof a ? (a) marginLayoutParams : null;
        int a2 = (aVar != null ? aVar.a() : 0) & 112;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        return a2 != 16 ? a2 != 80 ? paddingTop + marginLayoutParams.topMargin : (height - view.getMeasuredHeight()) - marginLayoutParams.bottomMargin : (((((height - paddingTop) - view.getMeasuredHeight()) / 2) + paddingTop) + marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        c cVar;
        boolean t = t();
        if (this.v != t) {
            this.v = t;
            StringBuilder X = e.a.a.a.a.X("dispatchSettledState opened=", t, " offset=");
            X.append(this.s);
            v(X.toString());
            Iterator<T> it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a(this, t);
            }
        }
        if (t) {
            c cVar2 = this.K;
            if (cVar2 != null) {
                cVar2.c(this);
                return;
            }
            return;
        }
        if (!(!this.u && q(0.0f)) || (cVar = this.K) == null) {
            return;
        }
        cVar.d(this);
    }

    private final int p(int i) {
        return kotlin.t.a.a(i * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(float f2) {
        return Math.abs(this.s - f2) < 0.5f;
    }

    private final boolean s() {
        DragEdge dragEdge = this.f4350d;
        return dragEdge == DragEdge.LEFT || dragEdge == DragEdge.RIGHT;
    }

    public static void u(ImeCustomSwipeLayout imeCustomSwipeLayout, ValueAnimator valueAnimator) {
        l.f(imeCustomSwipeLayout, "this$0");
        l.f(valueAnimator, "animator");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - imeCustomSwipeLayout.M;
        imeCustomSwipeLayout.M = currentTimeMillis;
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        imeCustomSwipeLayout.j(floatValue, true);
        if (j >= 24) {
            imeCustomSwipeLayout.v("animateTo frameLag deltaMs=" + j + " value=" + floatValue + " fraction=" + valueAnimator.getAnimatedFraction());
        }
    }

    private final void v(String str) {
        if (this.f4353g) {
            IAppGlobals.a.j("ImeCustomSwipeLayout", str);
        }
    }

    private final View w() {
        if (getChildCount() >= 2) {
            return getChildAt(1);
        }
        return null;
    }

    private final float x() {
        return Math.max(0.0f, this.t);
    }

    private final int y(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final int z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public final void B(boolean z) {
        c cVar;
        if (this.r == 0) {
            this.u = true;
            v("open skippedUntilRelayout animated=" + z + " dragRange=0");
            E(z);
            return;
        }
        if (!this.u && (cVar = this.K) != null) {
            cVar.a(this);
        }
        this.u = true;
        StringBuilder X = e.a.a.a.a.X("open animated=", z, " currentOffset=");
        X.append(this.s);
        X.append(" target=");
        X.append(this.t);
        v(X.toString());
        L(z);
    }

    public final void D(boolean z) {
        E(z);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        l.e(context, "context");
        return new a(context, attributeSet);
    }

    public final void h(b bVar) {
        l.f(bVar, "listener");
        this.b.add(bVar);
    }

    public final void m(boolean z) {
        c cVar;
        if (this.r == 0) {
            this.u = false;
            v("close skippedUntilRelayout animated=" + z + " dragRange=0");
            E(z);
            return;
        }
        if (this.u && (cVar = this.K) != null) {
            cVar.b(this);
        }
        this.u = false;
        StringBuilder X = e.a.a.a.a.X("close animated=", z, " currentOffset=");
        X.append(this.s);
        v(X.toString());
        L(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        K();
        float f2 = this.u ? this.t : 0.0f;
        if (this.r != 0 && !q(f2)) {
            j(f2, false);
        }
        o();
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r0 != 3) goto L36;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ev"
            kotlin.s.c.l.f(r7, r0)
            boolean r0 = r6.k()
            if (r0 != 0) goto L10
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L10:
            android.view.View r0 = r6.w()
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            android.view.View r0 = r6.H()
            if (r0 != 0) goto L1f
            return r1
        L1f:
            int r0 = r7.getActionMasked()
            java.lang.String r2 = " offset="
            if (r0 == 0) goto L97
            r3 = 1
            if (r0 == r3) goto L93
            r4 = 2
            if (r0 == r4) goto L32
            r7 = 3
            if (r0 == r7) goto L93
            goto Lf7
        L32:
            int r0 = r6.m
            int r0 = r7.findPointerIndex(r0)
            r4 = -1
            if (r0 != r4) goto L3c
            return r1
        L3c:
            float r4 = r6.C(r7, r0)
            float r7 = r6.G(r7, r0)
            float r0 = r6.n
            float r0 = r4 - r0
            float r5 = r6.o
            float r7 = r7 - r5
            boolean r5 = r6.I(r0, r7)
            if (r5 == 0) goto Lf7
            r6.q = r3
            r6.p = r4
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L5e
            r1.requestDisallowInterceptTouchEvent(r3)
        L5e:
            long r4 = java.lang.System.currentTimeMillis()
            r6.L = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "intercept MOVE startDrag primaryDelta="
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = " secondaryDelta="
            r1.append(r0)
            r1.append(r7)
            r1.append(r2)
            float r7 = r6.s
            r1.append(r7)
            java.lang.String r7 = " openOffset="
            r1.append(r7)
            float r7 = r6.t
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r6.v(r7)
            return r3
        L93:
            r6.F()
            goto Lf7
        L97:
            r6.K()
            r6.F()
            int r0 = r7.getPointerId(r1)
            r6.m = r0
            float r0 = r6.C(r7, r1)
            r6.n = r0
            float r0 = r6.G(r7, r1)
            r6.o = r0
            float r0 = r6.n
            r6.p = r0
            android.view.VelocityTracker r0 = r6.E
            if (r0 != 0) goto Lc2
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.E = r0
            java.lang.String r3 = "obtain().also { velocityTracker = it }"
            kotlin.s.c.l.e(r0, r3)
        Lc2:
            r0.addMovement(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "intercept DOWN primary="
            r7.append(r0)
            float r0 = r6.n
            r7.append(r0)
            java.lang.String r0 = " secondary="
            r7.append(r0)
            float r0 = r6.o
            r7.append(r0)
            java.lang.String r0 = " open="
            r7.append(r0)
            boolean r0 = r6.u
            r7.append(r0)
            r7.append(r2)
            float r0 = r6.s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.v(r7)
        Lf7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f2;
        View H = H();
        View w = w();
        if (H == null || w == null) {
            super.onMeasure(i, i2);
            return;
        }
        measureChildWithMargins(H, i, 0, i2, 0);
        measureChildWithMargins(w, i, 0, i2, 0);
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(z(w), z(H)) + getPaddingRight() + getPaddingLeft(), i, w.getMeasuredState()), ViewGroup.resolveSizeAndState(Math.max(y(w), y(H)) + getPaddingBottom() + getPaddingTop(), i2, w.getMeasuredState() << 16));
        this.r = s() ? H.getMeasuredWidth() : H.getMeasuredHeight();
        int ordinal = this.f4350d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new kotlin.f();
                    }
                }
            }
            f2 = -this.r;
            this.t = f2;
            this.s = h.e(this.s, A(), x());
        }
        f2 = this.r;
        this.t = f2;
        this.s = h.e(this.s, A(), x());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0257  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        l.f(view, "child");
        super.onViewAdded(view);
        l();
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final boolean r() {
        return !this.u && q(0.0f);
    }

    public final void setDebugLoggingEnabled(boolean z) {
        this.f4353g = z;
        v(e.a.a.a.a.A("setDebugLoggingEnabled enabled=", z));
    }

    public final void setDebugTag(String str) {
        l.f(str, "tag");
        if (kotlin.text.a.s(str)) {
            str = "ImeSwipeRevealLayout";
        }
        this.h = str;
        StringBuilder M = e.a.a.a.a.M("setDebugTag tag=");
        M.append(this.h);
        v(M.toString());
    }

    public final void setDragEdge(DragEdge dragEdge) {
        l.f(dragEdge, "edge");
        if (this.f4350d == dragEdge) {
            return;
        }
        this.f4350d = dragEdge;
        v("setDragEdge edge=" + dragEdge);
        E(false);
    }

    public final void setLockDrag(boolean z) {
        v(e.a.a.a.a.A("setLockDrag locked=", z));
        setSwipeEnabled(!z);
    }

    public final void setMinFlingVelocity(int i) {
        this.k = i;
        v(e.a.a.a.a.j("setMinFlingVelocity velocityPxPerSecond=", i));
    }

    public final void setRevealMode(RevealMode revealMode) {
        l.f(revealMode, "mode");
        if (this.f4351e == revealMode) {
            return;
        }
        this.f4351e = revealMode;
        v("setRevealMode mode=" + revealMode);
        E(false);
    }

    public final void setSecondaryRevealStyle(SecondaryRevealStyle secondaryRevealStyle) {
        l.f(secondaryRevealStyle, "style");
        if (this.f4352f == secondaryRevealStyle) {
            return;
        }
        this.f4352f = secondaryRevealStyle;
        v("setSecondaryRevealStyle style=" + secondaryRevealStyle);
        E(false);
    }

    public final void setSwipeEnabled(boolean z) {
        this.i = z;
        v(e.a.a.a.a.A("setSwipeEnabled enabled=", z));
        if (z) {
            return;
        }
        m(false);
    }

    public final void setSwipeListener(c cVar) {
        this.K = cVar;
    }

    public final boolean t() {
        return this.u && q(this.t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCustomSwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeCustomSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = new LinkedHashSet<>();
        this.f4349c = new DecelerateInterpolator(1.6f);
        this.f4350d = DragEdge.RIGHT;
        this.f4351e = RevealMode.NORMAL;
        this.f4352f = SecondaryRevealStyle.UNDER_CONTENT;
        this.f4353g = true;
        this.h = "ImeSwipeRevealLayout";
        this.i = true;
        this.j = 220L;
        this.k = p(800);
        this.l = p(12);
        this.m = -1;
        setClickable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.h);
        this.i = obtainStyledAttributes.getBoolean(3, true);
        this.f4353g = obtainStyledAttributes.getBoolean(1, true);
        this.j = obtainStyledAttributes.getInt(0, 220);
        this.k = obtainStyledAttributes.getDimensionPixelSize(4, p(800));
        this.l = obtainStyledAttributes.getDimensionPixelSize(5, p(12));
        this.f4350d = DragEdge.values()[obtainStyledAttributes.getInt(2, 1)];
        this.f4351e = RevealMode.values()[obtainStyledAttributes.getInt(6, 0)];
        this.f4352f = SecondaryRevealStyle.values()[obtainStyledAttributes.getInt(7, 0)];
        obtainStyledAttributes.recycle();
    }

    public static final class a extends ViewGroup.MarginLayoutParams {
        private int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l.f(context, "c");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_gravity});
            l.e(obtainStyledAttributes, "c.obtainStyledAttributes…ut_gravity)\n            )");
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public final int a() {
            return this.a;
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            l.f(aVar, "source");
            this.a = aVar.a;
        }
    }
}
