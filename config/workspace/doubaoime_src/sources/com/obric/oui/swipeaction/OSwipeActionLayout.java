package com.obric.oui.swipeaction;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSwipeActionLayout extends FrameLayout {
    private View A;
    private int B;
    private View C;
    private View D;
    private int E;

    /* renamed from: J, reason: collision with root package name */
    private a f8045J;
    private final GestureDetector.OnGestureListener K;
    private final ViewDragHelper.Callback L;
    private int a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8046c;

    /* renamed from: d, reason: collision with root package name */
    private final double f8047d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8048e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8049f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8050g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private ViewDragHelper s;
    private GestureDetectorCompat t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private View y;
    private View z;

    public interface a {
        void a();

        void b(int i, boolean z);

        void onClose();
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.f(motionEvent, "e1");
            l.f(motionEvent2, "e2");
            ViewParent parent = OSwipeActionLayout.this.getParent();
            if (parent == null) {
                return false;
            }
            parent.requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    public OSwipeActionLayout(Context context) {
        this(context, null, 0);
    }

    private final boolean A() {
        return this.z == null;
    }

    private final boolean C(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        View view = this.y;
        l.c(view);
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        View view2 = this.y;
        l.c(view2);
        int measuredHeight = view2.getMeasuredHeight() + i;
        int i2 = iArr[1];
        int rawY = (int) motionEvent.getRawY();
        return i2 + 1 <= rawY && measuredHeight > rawY;
    }

    private final void D() {
        if (this.f8046c && this.a != 3) {
            this.f8048e = true;
        }
        if (this.a == 3) {
            this.o = 0;
            D();
            this.p = 0;
        }
    }

    public static final int a(OSwipeActionLayout oSwipeActionLayout, int i, int i2) {
        int i3;
        int i4;
        boolean z = oSwipeActionLayout.f8049f;
        if (z || !oSwipeActionLayout.w || i2 >= 0) {
            if (z || !oSwipeActionLayout.x || i2 <= 0) {
                boolean z2 = oSwipeActionLayout.f8048e;
                if (!z2 && i > 0) {
                    i4 = oSwipeActionLayout.l;
                    if (i <= i4) {
                        return i;
                    }
                } else {
                    if (z2 || i >= 0) {
                        if (i < 0) {
                            i3 = oSwipeActionLayout.p - oSwipeActionLayout.v;
                            if (i >= i3) {
                                return i;
                            }
                        } else {
                            i3 = oSwipeActionLayout.v - oSwipeActionLayout.o;
                            if (i <= i3) {
                                return i;
                            }
                        }
                        return i3;
                    }
                    i4 = -oSwipeActionLayout.i;
                    if (i >= i4) {
                        return i;
                    }
                }
                return i4;
            }
            if (i <= 0) {
                return i;
            }
        } else if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r3 < r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        if (r3 < r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        if (r3 < r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        if (r3 < r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r3 < r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(com.obric.oui.swipeaction.OSwipeActionLayout r2, int r3) {
        /*
            boolean r0 = r2.f8046c
            r1 = 0
            if (r0 == 0) goto L23
            boolean r0 = r2.A()
            if (r0 == 0) goto L23
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L18
            int r2 = r2.v
            if (r3 <= r2) goto L14
            goto L5a
        L14:
            int r2 = -r2
            if (r3 >= r2) goto L21
            goto L20
        L18:
            if (r3 <= 0) goto L1b
            goto L5a
        L1b:
            int r2 = r2.v
            int r2 = -r2
            if (r3 >= r2) goto L21
        L20:
            r3 = r2
        L21:
            r1 = r3
            goto L5a
        L23:
            boolean r0 = r2.f8048e
            if (r0 == 0) goto L42
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L36
            int r0 = r2.v
            if (r3 <= r0) goto L30
            goto L5a
        L30:
            int r2 = r2.p
            int r2 = r2 - r0
            if (r3 >= r2) goto L21
            goto L20
        L36:
            if (r3 <= 0) goto L39
            goto L5a
        L39:
            int r0 = r2.p
            int r2 = r2.v
            int r0 = r0 - r2
            if (r3 >= r0) goto L21
            r3 = r0
            goto L21
        L42:
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L51
            int r0 = r2.v
            if (r3 <= r0) goto L4b
            goto L5a
        L4b:
            int r2 = r2.i
            int r2 = -r2
            if (r3 >= r2) goto L21
            goto L20
        L51:
            if (r3 <= 0) goto L54
            goto L5a
        L54:
            int r2 = r2.i
            int r2 = -r2
            if (r3 >= r2) goto L21
            goto L20
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeActionLayout.b(com.obric.oui.swipeaction.OSwipeActionLayout, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        if (r3 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        if (r3 > r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r3 > r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r3 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0057, code lost:
    
        if (r3 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r3 > r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(com.obric.oui.swipeaction.OSwipeActionLayout r2, int r3) {
        /*
            boolean r0 = r2.f8046c
            r1 = 0
            if (r0 == 0) goto L22
            boolean r0 = r2.A()
            if (r0 == 0) goto L22
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L18
            int r2 = r2.v
            int r1 = -r2
            if (r3 >= r1) goto L15
            goto L5a
        L15:
            if (r3 <= r2) goto L20
            goto L1f
        L18:
            if (r3 >= 0) goto L1b
            goto L5a
        L1b:
            int r2 = r2.v
            if (r3 <= r2) goto L20
        L1f:
            r3 = r2
        L20:
            r1 = r3
            goto L5a
        L22:
            boolean r0 = r2.f8048e
            if (r0 == 0) goto L43
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L38
            int r0 = r2.v
            int r1 = -r0
            if (r3 >= r1) goto L31
            r3 = r1
            goto L20
        L31:
            int r2 = r2.o
            int r0 = r0 - r2
            if (r3 <= r0) goto L20
        L36:
            r3 = r0
            goto L20
        L38:
            if (r3 >= 0) goto L3b
            goto L5a
        L3b:
            int r0 = r2.v
            int r2 = r2.o
            int r0 = r0 - r2
            if (r3 <= r0) goto L20
            goto L36
        L43:
            boolean r0 = r2.f8049f
            if (r0 == 0) goto L52
            int r0 = r2.v
            int r0 = -r0
            if (r3 >= r0) goto L4d
            goto L36
        L4d:
            int r2 = r2.l
            if (r3 <= r2) goto L20
            goto L1f
        L52:
            if (r3 >= 0) goto L55
            goto L5a
        L55:
            int r2 = r2.l
            if (r3 <= r2) goto L20
            goto L1f
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeActionLayout.c(com.obric.oui.swipeaction.OSwipeActionLayout, int):int");
    }

    public static final int g(OSwipeActionLayout oSwipeActionLayout, float f2) {
        int i;
        int i2;
        int i3;
        float f3 = 0;
        boolean z = true;
        if (f2 >= f3 && (((i3 = oSwipeActionLayout.u) > 0 && ((double) f2) > oSwipeActionLayout.f8047d) || (i3 > 0 && Math.abs(i3) > oSwipeActionLayout.l / 2))) {
            return oSwipeActionLayout.l;
        }
        if (f2 <= f3 && (((i2 = oSwipeActionLayout.u) < 0 && ((double) f2) < (-oSwipeActionLayout.f8047d)) || (i2 < 0 && Math.abs(i2) > oSwipeActionLayout.i / 2))) {
            return -oSwipeActionLayout.i;
        }
        int i4 = oSwipeActionLayout.u;
        if ((i4 < 0 || f2 >= (-oSwipeActionLayout.f8047d)) && ((i4 > 0 || f2 <= oSwipeActionLayout.f8047d) && ((i4 < 0 || Math.abs(i4) >= oSwipeActionLayout.l / 2) && ((i = oSwipeActionLayout.u) > 0 || Math.abs(i) >= oSwipeActionLayout.i / 2)))) {
            z = false;
        }
        return z ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int h(com.obric.oui.swipeaction.OSwipeActionLayout r7, float r8) {
        /*
            boolean r0 = r7.f8046c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L55
            boolean r0 = r7.A()
            if (r0 == 0) goto L2a
            int r0 = r7.u
            if (r0 >= 0) goto L1a
            int r0 = java.lang.Math.abs(r0)
            int r1 = r7.v
            int r1 = r1 / 2
            if (r0 > r1) goto L22
        L1a:
            double r0 = (double) r8
            double r3 = r7.f8047d
            double r3 = -r3
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L83
        L22:
            int r8 = r7.v
            int r8 = -r8
            int r7 = r7.B
        L27:
            int r2 = r8 + r7
            goto L83
        L2a:
            double r3 = (double) r8
            double r5 = r7.f8047d
            double r5 = -r5
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3c
            int r0 = r7.u
            int r0 = java.lang.Math.abs(r0)
            int r3 = r7.i
            if (r0 > r3) goto L4a
        L3c:
            int r0 = r7.u
            if (r0 >= 0) goto L4c
            int r0 = java.lang.Math.abs(r0)
            int r3 = r7.v
            int r3 = r3 / 2
            if (r0 <= r3) goto L4c
        L4a:
            r0 = r1
            goto L4d
        L4c:
            r0 = r2
        L4d:
            if (r0 == 0) goto L55
            int r8 = r7.v
            int r8 = -r8
            int r7 = r7.B
            goto L27
        L55:
            double r3 = (double) r8
            double r5 = r7.f8047d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L5d
            goto L7d
        L5d:
            double r5 = -r5
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L63
            goto L7e
        L63:
            int r8 = r7.u
            if (r8 >= 0) goto L72
            int r8 = java.lang.Math.abs(r8)
            int r0 = r7.i
            int r0 = r0 / 2
            if (r8 <= r0) goto L72
            goto L7e
        L72:
            int r8 = r7.u
            if (r8 >= 0) goto L7d
            java.lang.Math.abs(r8)
            int r8 = r7.i
            int r8 = r8 / 2
        L7d:
            r1 = r2
        L7e:
            if (r1 == 0) goto L83
            int r7 = r7.i
            int r2 = -r7
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeActionLayout.h(com.obric.oui.swipeaction.OSwipeActionLayout, float):int");
    }

    public static final int i(OSwipeActionLayout oSwipeActionLayout, float f2) {
        int i;
        int i2;
        int i3;
        boolean z = true;
        if (oSwipeActionLayout.f8046c) {
            if (oSwipeActionLayout.A()) {
                int i4 = oSwipeActionLayout.u;
                if ((i4 <= 0 || Math.abs(i4) <= oSwipeActionLayout.v / 2) && f2 <= oSwipeActionLayout.f8047d) {
                    return 0;
                }
                i2 = oSwipeActionLayout.v;
                i3 = oSwipeActionLayout.E;
            } else {
                if ((((double) f2) > oSwipeActionLayout.f8047d && Math.abs(oSwipeActionLayout.u) > oSwipeActionLayout.l) || ((i = oSwipeActionLayout.u) > 0 && Math.abs(i) > oSwipeActionLayout.v / 2)) {
                    i2 = oSwipeActionLayout.v;
                    i3 = oSwipeActionLayout.E;
                }
            }
            return i2 - i3;
        }
        double d2 = f2;
        double d3 = oSwipeActionLayout.f8047d;
        if (d2 <= d3) {
            if (d2 >= (-d3)) {
                int i5 = oSwipeActionLayout.u;
                if (i5 <= 0 || Math.abs(i5) <= oSwipeActionLayout.l / 2) {
                    int i6 = oSwipeActionLayout.u;
                    if (i6 > 0) {
                        Math.abs(i6);
                        int i7 = oSwipeActionLayout.l / 2;
                    }
                }
            }
            z = false;
        }
        if (z) {
            return oSwipeActionLayout.l;
        }
        return 0;
    }

    public static final int n(OSwipeActionLayout oSwipeActionLayout) {
        if (oSwipeActionLayout.w) {
            return oSwipeActionLayout.l;
        }
        if (oSwipeActionLayout.x) {
            return -oSwipeActionLayout.i;
        }
        return 0;
    }

    public static final boolean s(OSwipeActionLayout oSwipeActionLayout, int i) {
        int i2 = oSwipeActionLayout.r;
        return (i2 == 1 || i2 == 2) && i == 0;
    }

    public static final void w(OSwipeActionLayout oSwipeActionLayout) {
        int i = oSwipeActionLayout.u;
        if (i == 0) {
            oSwipeActionLayout.w = false;
            oSwipeActionLayout.x = false;
            a aVar = oSwipeActionLayout.f8045J;
            if (aVar != null) {
                aVar.onClose();
            }
            View view = oSwipeActionLayout.z;
            if (view != null) {
                view.layout(0, view.getTop(), view.getWidth(), view.getBottom());
            }
            View view2 = oSwipeActionLayout.C;
            if (view2 != null) {
                view2.layout(0, view2.getTop(), view2.getWidth(), view2.getBottom());
            }
            oSwipeActionLayout.n = 0;
            return;
        }
        int i2 = oSwipeActionLayout.v;
        int i3 = i2 - oSwipeActionLayout.E;
        if (!(i == i3)) {
            if (!(oSwipeActionLayout.C != null && i == oSwipeActionLayout.l)) {
                int i4 = (-i2) + oSwipeActionLayout.B;
                if (!(i == i4)) {
                    if (!(oSwipeActionLayout.z != null && i == (-oSwipeActionLayout.i))) {
                        return;
                    }
                }
                oSwipeActionLayout.w = false;
                oSwipeActionLayout.x = true;
                a aVar2 = oSwipeActionLayout.f8045J;
                if (aVar2 != null) {
                    aVar2.b(1, i == i4);
                    return;
                }
                return;
            }
        }
        oSwipeActionLayout.w = true;
        oSwipeActionLayout.x = false;
        a aVar3 = oSwipeActionLayout.f8045J;
        if (aVar3 != null) {
            aVar3.b(2, i == i3);
        }
    }

    private final View z(MotionEvent motionEvent, ViewGroup viewGroup) {
        l.c(viewGroup);
        if (viewGroup.onInterceptTouchEvent(motionEvent)) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            l.e(childAt, "rootView.getChildAt(i)");
            if (childAt instanceof ViewGroup) {
                return z(motionEvent, (ViewGroup) childAt);
            }
        }
        return null;
    }

    public final boolean B() {
        return this.b;
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.s;
        l.c(viewDragHelper);
        if (viewDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        int i = this.m;
        if (i != 0) {
            this.y = findViewById(i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            this.C = findViewById(i2);
        }
        int i3 = this.f8050g;
        if (i3 != 0) {
            this.z = findViewById(i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            this.A = findViewById(i4);
        }
        int i5 = this.k;
        if (i5 != 0) {
            this.D = findViewById(i5);
        }
        if (this.y == null) {
            throw new RuntimeException("'oui_sal_draggedItem' must be specified");
        }
        int i6 = this.a;
        if (i6 == 1 && this.z == null) {
            throw new RuntimeException("'oui_sal_rightItem' must be specified");
        }
        if (i6 == 2 && this.C == null) {
            throw new RuntimeException("'oui_sal_leftItem' must be specified");
        }
        if (i6 == 1 && !this.f8046c && this.z == null) {
            throw new RuntimeException("Must be specified 'oui_sal_rightItem' or flag oui_sal_continuousSwipe = true");
        }
        if (i6 == 2 && !this.f8046c && this.C == null) {
            throw new RuntimeException("Must be specified 'oui_sal_leftItem'  or flag oui_sal_continuousSwipe = true");
        }
        if (i6 == 3 && (this.z == null || this.C == null)) {
            throw new RuntimeException("'oui_sal_leftItem' and 'oui_sal_rightItem' must be specified");
        }
        this.s = ViewDragHelper.create(this, 1.0f, this.L);
        this.t = new GestureDetectorCompat(getContext(), this.K);
        post(new com.obric.oui.swipeaction.a(this));
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.q) {
            View view = this.y;
            if (view instanceof ViewGroup) {
                View z = z(motionEvent, (ViewGroup) view);
                Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                if (z != null) {
                    if (point.y >= z.getTop() && point.y < z.getBottom() && point.x >= z.getLeft() && point.y < z.getRight()) {
                        return false;
                    }
                }
            }
        }
        if (C(motionEvent)) {
            ViewDragHelper viewDragHelper = this.s;
            l.c(viewDragHelper);
            if (viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.v = i;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (!C(motionEvent)) {
            int i = this.r;
            if (!(i == 1 || i == 2)) {
                return super.onTouchEvent(motionEvent);
            }
        }
        GestureDetectorCompat gestureDetectorCompat = this.t;
        l.c(gestureDetectorCompat);
        gestureDetectorCompat.onTouchEvent(motionEvent);
        ViewDragHelper viewDragHelper = this.s;
        l.c(viewDragHelper);
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.q = z;
    }

    public final void setActionsListener(a aVar) {
        this.f8045J = aVar;
    }

    public final void setContinuousSwipe(boolean z) {
        this.f8046c = z;
    }

    public final void setDirection(int i) {
        this.a = i;
    }

    public final void setSwipeEnabled(boolean z) {
        this.b = z;
    }

    public final a x() {
        return this.f8045J;
    }

    public final int y() {
        return this.a;
    }

    public OSwipeActionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSwipeActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = 1;
        this.q = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.i.a.b.b.I);
        l.e(obtainStyledAttributes, "getContext().obtainStyle…eable.OSwipeActionLayout)");
        this.a = 1;
        this.b = obtainStyledAttributes.getBoolean(16, true);
        this.f8046c = obtainStyledAttributes.getBoolean(1, true);
        this.f8047d = obtainStyledAttributes.getInt(0, 1000);
        this.f8048e = obtainStyledAttributes.getBoolean(3, false);
        this.f8049f = obtainStyledAttributes.getBoolean(5, true);
        this.f8050g = obtainStyledAttributes.getResourceId(11, 0);
        this.h = obtainStyledAttributes.getResourceId(12, 0);
        this.i = (int) obtainStyledAttributes.getDimension(13, 0.0f);
        this.B = (int) obtainStyledAttributes.getDimension(14, 0.0f);
        this.j = obtainStyledAttributes.getResourceId(6, 0);
        this.k = obtainStyledAttributes.getResourceId(7, 0);
        this.l = (int) obtainStyledAttributes.getDimension(8, 0.0f);
        this.E = (int) obtainStyledAttributes.getDimension(9, 0.0f);
        this.m = obtainStyledAttributes.getResourceId(4, 0);
        this.o = (int) obtainStyledAttributes.getDimension(15, 0.0f);
        D();
        this.p = (int) obtainStyledAttributes.getDimension(10, 0.0f);
        D();
        obtainStyledAttributes.recycle();
        this.K = new b();
        this.L = new ViewDragHelper.Callback() { // from class: com.obric.oui.swipeaction.OSwipeActionLayout$dragHelperCallback$1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                l.f(view, "child");
                if (!OSwipeActionLayout.this.B()) {
                    return 0;
                }
                int y = OSwipeActionLayout.this.y();
                if (y == 1) {
                    return OSwipeActionLayout.b(OSwipeActionLayout.this, i2);
                }
                if (y == 2) {
                    return OSwipeActionLayout.c(OSwipeActionLayout.this, i2);
                }
                if (y != 3) {
                    return 0;
                }
                return OSwipeActionLayout.a(OSwipeActionLayout.this, i2, i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(View view) {
                int i2;
                l.f(view, "child");
                i2 = OSwipeActionLayout.this.v;
                return i2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
            
                r0 = r2.a.z;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
            
                r0 = r2.a.C;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewDragStateChanged(int r3) {
                /*
                    r2 = this;
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    int r0 = com.obric.oui.swipeaction.OSwipeActionLayout.d(r0)
                    if (r3 != r0) goto L9
                    return
                L9:
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    boolean r0 = com.obric.oui.swipeaction.OSwipeActionLayout.s(r0, r3)
                    if (r0 == 0) goto L17
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    com.obric.oui.swipeaction.OSwipeActionLayout.w(r0)
                    goto L6b
                L17:
                    r0 = 1
                    if (r3 != r0) goto L6b
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    com.obric.oui.swipeaction.OSwipeActionLayout$a r0 = r0.x()
                    if (r0 == 0) goto L25
                    r0.a()
                L25:
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    boolean r0 = com.obric.oui.swipeaction.OSwipeActionLayout.p(r0)
                    if (r0 != 0) goto L49
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    android.view.View r0 = com.obric.oui.swipeaction.OSwipeActionLayout.q(r0)
                    if (r0 == 0) goto L49
                    com.obric.oui.swipeaction.OSwipeActionLayout r1 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    android.view.View r1 = com.obric.oui.swipeaction.OSwipeActionLayout.q(r1)
                    kotlin.s.c.l.c(r1)
                    int r1 = r1.getWidth()
                    int r1 = r1 / 2
                    int r1 = r1 * (-1)
                    r0.offsetLeftAndRight(r1)
                L49:
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    boolean r0 = com.obric.oui.swipeaction.OSwipeActionLayout.k(r0)
                    if (r0 != 0) goto L6b
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    android.view.View r0 = com.obric.oui.swipeaction.OSwipeActionLayout.l(r0)
                    if (r0 == 0) goto L6b
                    com.obric.oui.swipeaction.OSwipeActionLayout r1 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    android.view.View r1 = com.obric.oui.swipeaction.OSwipeActionLayout.l(r1)
                    kotlin.s.c.l.c(r1)
                    int r1 = r1.getWidth()
                    int r1 = r1 / 2
                    r0.offsetLeftAndRight(r1)
                L6b:
                    com.obric.oui.swipeaction.OSwipeActionLayout r0 = com.obric.oui.swipeaction.OSwipeActionLayout.this
                    com.obric.oui.swipeaction.OSwipeActionLayout.t(r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeActionLayout$dragHelperCallback$1.onViewDragStateChanged(int):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                View view2;
                View view3;
                View view4;
                View view5;
                View view6;
                View view7;
                View view8;
                View view9;
                int i6;
                int i7;
                l.f(view, "changedView");
                OSwipeActionLayout.this.u = i2;
                int i8 = i4 % 2;
                if (i8 != 0) {
                    i6 = OSwipeActionLayout.this.n;
                    if (i6 != 0) {
                        i7 = OSwipeActionLayout.this.n;
                        i4 += i7;
                        OSwipeActionLayout.this.n = 0;
                    } else {
                        OSwipeActionLayout.this.n = i8;
                    }
                }
                int y = OSwipeActionLayout.this.y();
                if (y == 1) {
                    view2 = OSwipeActionLayout.this.A;
                    l.c(view2);
                    view3 = OSwipeActionLayout.this.y;
                    l.c(view3);
                    view2.setLeft(view3.getRight());
                    view4 = OSwipeActionLayout.this.z;
                    if (view4 != null) {
                        view4.offsetLeftAndRight(i4 / 2);
                        return;
                    }
                    return;
                }
                if (y != 2) {
                    if (y != 3) {
                        return;
                    }
                    view8 = OSwipeActionLayout.this.C;
                    if (view8 != null) {
                        view8.offsetLeftAndRight(i4);
                    }
                    view9 = OSwipeActionLayout.this.z;
                    if (view9 != null) {
                        view9.offsetLeftAndRight(i4);
                        return;
                    }
                    return;
                }
                view5 = OSwipeActionLayout.this.D;
                l.c(view5);
                view6 = OSwipeActionLayout.this.y;
                l.c(view6);
                view5.setRight(view6.getLeft());
                view7 = OSwipeActionLayout.this.C;
                if (view7 != null) {
                    view7.offsetLeftAndRight(i4 / 2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f2, float f3) {
                int i2;
                ViewDragHelper viewDragHelper;
                View view2;
                l.f(view, "releasedChild");
                if (OSwipeActionLayout.this.y() == 1) {
                    i2 = OSwipeActionLayout.h(OSwipeActionLayout.this, f2);
                } else if (OSwipeActionLayout.this.y() == 2) {
                    i2 = OSwipeActionLayout.i(OSwipeActionLayout.this, f2);
                } else if (OSwipeActionLayout.this.y() == 3) {
                    i2 = OSwipeActionLayout.g(OSwipeActionLayout.this, f2);
                    if (i2 == -1) {
                        i2 = OSwipeActionLayout.n(OSwipeActionLayout.this);
                    }
                } else {
                    i2 = 0;
                }
                viewDragHelper = OSwipeActionLayout.this.s;
                l.c(viewDragHelper);
                view2 = OSwipeActionLayout.this.y;
                l.c(view2);
                if (viewDragHelper.settleCapturedViewAt(i2, view2.getTop())) {
                    ViewCompat.postInvalidateOnAnimation(OSwipeActionLayout.this);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                View view2;
                l.f(view, "view");
                view2 = OSwipeActionLayout.this.y;
                return view2 != null && view.getId() == view2.getId();
            }
        };
    }
}
