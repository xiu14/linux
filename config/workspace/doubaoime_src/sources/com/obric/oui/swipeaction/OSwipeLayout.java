package com.obric.oui.swipeaction;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.obric.oui.layout.OUIFrameLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class OSwipeLayout extends OUIFrameLayout {
    private static final DragEdge L = DragEdge.Right;
    private boolean A;
    private float B;
    private float C;
    View.OnClickListener D;
    View.OnLongClickListener E;

    /* renamed from: J, reason: collision with root package name */
    private Rect f8051J;
    private GestureDetector K;

    /* renamed from: g, reason: collision with root package name */
    private int f8052g;
    private DragEdge h;
    private ViewDragHelper i;
    private int j;
    private LinkedHashMap<DragEdge, View> k;
    private ShowMode l;
    private float[] m;
    private List<h> n;
    private List<f> o;
    private Map<View, ArrayList<e>> p;
    private Map<View, Boolean> q;
    private Map<View, Rect> r;
    private d s;
    private boolean t;
    private boolean[] u;
    private boolean v;
    private float w;
    private float x;
    private ViewDragHelper.Callback y;
    private int z;

    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    public enum ShowMode {
        LayDown,
        PullOut
    }

    public enum Status {
        Middle,
        Open,
        Close
    }

    class a extends ViewDragHelper.Callback {
        boolean a = true;

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        
            if (r4 != 3) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        
            if (r4 != 3) goto L50;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int clampViewPositionHorizontal(android.view.View r4, int r5, int r6) {
            /*
                r3 = this;
                com.obric.oui.swipeaction.OSwipeLayout r6 = com.obric.oui.swipeaction.OSwipeLayout.this
                android.view.View r6 = r6.G()
                r0 = 3
                r1 = 2
                r2 = 1
                if (r4 != r6) goto L7e
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                com.obric.oui.swipeaction.OSwipeLayout$DragEdge r4 = com.obric.oui.swipeaction.OSwipeLayout.j(r4)
                int r4 = r4.ordinal()
                if (r4 == 0) goto L52
                if (r4 == r2) goto L4b
                if (r4 == r1) goto L1f
                if (r4 == r0) goto L4b
                goto Le0
            L1f:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                if (r5 <= r4) goto L2e
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                return r4
            L2e:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                com.obric.oui.swipeaction.OSwipeLayout r6 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r6 = com.obric.oui.swipeaction.OSwipeLayout.k(r6)
                int r4 = r4 - r6
                if (r5 >= r4) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                com.obric.oui.swipeaction.OSwipeLayout r5 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r5 = com.obric.oui.swipeaction.OSwipeLayout.k(r5)
                int r4 = r4 - r5
                return r4
            L4b:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                return r4
            L52:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                if (r5 >= r4) goto L61
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                return r4
            L61:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                com.obric.oui.swipeaction.OSwipeLayout r6 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r6 = com.obric.oui.swipeaction.OSwipeLayout.k(r6)
                int r4 = r4 + r6
                if (r5 <= r4) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                com.obric.oui.swipeaction.OSwipeLayout r5 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r5 = com.obric.oui.swipeaction.OSwipeLayout.k(r5)
                int r4 = r4 + r5
                return r4
            L7e:
                com.obric.oui.swipeaction.OSwipeLayout r6 = com.obric.oui.swipeaction.OSwipeLayout.this
                android.view.View r6 = r6.E()
                if (r6 != r4) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                com.obric.oui.swipeaction.OSwipeLayout$DragEdge r4 = com.obric.oui.swipeaction.OSwipeLayout.j(r4)
                int r4 = r4.ordinal()
                if (r4 == 0) goto Lc7
                if (r4 == r2) goto Lc0
                if (r4 == r1) goto L99
                if (r4 == r0) goto Lc0
                goto Le0
            L99:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                com.obric.oui.swipeaction.OSwipeLayout$ShowMode r4 = com.obric.oui.swipeaction.OSwipeLayout.m(r4)
                com.obric.oui.swipeaction.OSwipeLayout$ShowMode r6 = com.obric.oui.swipeaction.OSwipeLayout.ShowMode.PullOut
                if (r4 != r6) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getMeasuredWidth()
                com.obric.oui.swipeaction.OSwipeLayout r6 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r6 = com.obric.oui.swipeaction.OSwipeLayout.k(r6)
                int r4 = r4 - r6
                if (r5 >= r4) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getMeasuredWidth()
                com.obric.oui.swipeaction.OSwipeLayout r5 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r5 = com.obric.oui.swipeaction.OSwipeLayout.k(r5)
                int r4 = r4 - r5
                return r4
            Lc0:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                return r4
            Lc7:
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                com.obric.oui.swipeaction.OSwipeLayout$ShowMode r4 = com.obric.oui.swipeaction.OSwipeLayout.m(r4)
                com.obric.oui.swipeaction.OSwipeLayout$ShowMode r6 = com.obric.oui.swipeaction.OSwipeLayout.ShowMode.PullOut
                if (r4 != r6) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                if (r5 <= r4) goto Le0
                com.obric.oui.swipeaction.OSwipeLayout r4 = com.obric.oui.swipeaction.OSwipeLayout.this
                int r4 = r4.getPaddingLeft()
                return r4
            Le0:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeLayout.a.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            if (view == OSwipeLayout.this.G()) {
                int ordinal = OSwipeLayout.this.h.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (i < OSwipeLayout.this.getPaddingTop() - OSwipeLayout.this.j) {
                                    return OSwipeLayout.this.getPaddingTop() - OSwipeLayout.this.j;
                                }
                                if (i > OSwipeLayout.this.getPaddingTop()) {
                                    return OSwipeLayout.this.getPaddingTop();
                                }
                            }
                        }
                    } else {
                        if (i < OSwipeLayout.this.getPaddingTop()) {
                            return OSwipeLayout.this.getPaddingTop();
                        }
                        if (i > OSwipeLayout.this.getPaddingTop() + OSwipeLayout.this.j) {
                            return OSwipeLayout.this.getPaddingTop() + OSwipeLayout.this.j;
                        }
                    }
                }
                return OSwipeLayout.this.getPaddingTop();
            }
            View G = OSwipeLayout.this.G();
            int top = G == null ? 0 : G.getTop();
            int ordinal2 = OSwipeLayout.this.h.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            if (OSwipeLayout.this.l != ShowMode.PullOut) {
                                int i3 = top + i2;
                                if (i3 >= OSwipeLayout.this.getPaddingTop()) {
                                    return OSwipeLayout.this.getPaddingTop();
                                }
                                if (i3 <= OSwipeLayout.this.getPaddingTop() - OSwipeLayout.this.j) {
                                    return OSwipeLayout.this.getPaddingTop() - OSwipeLayout.this.j;
                                }
                            } else if (i < OSwipeLayout.this.getMeasuredHeight() - OSwipeLayout.this.j) {
                                return OSwipeLayout.this.getMeasuredHeight() - OSwipeLayout.this.j;
                            }
                        }
                    }
                } else if (OSwipeLayout.this.l != ShowMode.PullOut) {
                    int i4 = top + i2;
                    if (i4 < OSwipeLayout.this.getPaddingTop()) {
                        return OSwipeLayout.this.getPaddingTop();
                    }
                    if (i4 > OSwipeLayout.this.getPaddingTop() + OSwipeLayout.this.j) {
                        return OSwipeLayout.this.getPaddingTop() + OSwipeLayout.this.j;
                    }
                } else if (i > OSwipeLayout.this.getPaddingTop()) {
                    return OSwipeLayout.this.getPaddingTop();
                }
            }
            return OSwipeLayout.this.getPaddingTop();
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return OSwipeLayout.this.j;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            return OSwipeLayout.this.j;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            View G = OSwipeLayout.this.G();
            if (G == null) {
                return;
            }
            View E = OSwipeLayout.this.E();
            int left = G.getLeft();
            int right = G.getRight();
            int top = G.getTop();
            int bottom = G.getBottom();
            if (view == G) {
                if (OSwipeLayout.this.l == ShowMode.PullOut && E != null) {
                    if (OSwipeLayout.this.h == DragEdge.Left || OSwipeLayout.this.h == DragEdge.Right) {
                        E.offsetLeftAndRight(i3);
                    } else {
                        E.offsetTopAndBottom(i4);
                    }
                }
            } else if (((ArrayList) OSwipeLayout.this.D()).contains(view)) {
                if (OSwipeLayout.this.l == ShowMode.PullOut) {
                    G.offsetLeftAndRight(i3);
                    G.offsetTopAndBottom(i4);
                } else {
                    OSwipeLayout oSwipeLayout = OSwipeLayout.this;
                    Rect o = OSwipeLayout.o(oSwipeLayout, oSwipeLayout.h);
                    if (E != null) {
                        E.layout(o.left, o.top, o.right, o.bottom);
                    }
                    int left2 = G.getLeft() + i3;
                    int top2 = G.getTop() + i4;
                    if (OSwipeLayout.this.h == DragEdge.Left && left2 < OSwipeLayout.this.getPaddingLeft()) {
                        left2 = OSwipeLayout.this.getPaddingLeft();
                    } else if (OSwipeLayout.this.h == DragEdge.Right && left2 > OSwipeLayout.this.getPaddingLeft()) {
                        left2 = OSwipeLayout.this.getPaddingLeft();
                    } else if (OSwipeLayout.this.h == DragEdge.Top && top2 < OSwipeLayout.this.getPaddingTop()) {
                        top2 = OSwipeLayout.this.getPaddingTop();
                    } else if (OSwipeLayout.this.h == DragEdge.Bottom && top2 > OSwipeLayout.this.getPaddingTop()) {
                        top2 = OSwipeLayout.this.getPaddingTop();
                    }
                    G.layout(left2, top2, OSwipeLayout.this.getMeasuredWidth() + left2, OSwipeLayout.this.getMeasuredHeight() + top2);
                }
            }
            OSwipeLayout.this.z(left, top, right, bottom);
            OSwipeLayout.this.A(left, top, i3, i4);
            OSwipeLayout.this.invalidate();
            OSwipeLayout.p(OSwipeLayout.this);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f2, float f3) {
            super.onViewReleased(view, f2, f3);
            OSwipeLayout.this.K(f2, f3, this.a);
            Iterator it2 = OSwipeLayout.this.n.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).f(OSwipeLayout.this, f2, f3);
            }
            OSwipeLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            boolean z = view == OSwipeLayout.this.G() || ((ArrayList) OSwipeLayout.this.D()).contains(view);
            if (z) {
                this.a = OSwipeLayout.this.F() == Status.Close;
            }
            return z;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OSwipeLayout.q(OSwipeLayout.this);
        }
    }

    class c implements View.OnLongClickListener {
        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            OSwipeLayout.r(OSwipeLayout.this);
            return true;
        }
    }

    public interface d {
        void a(OSwipeLayout oSwipeLayout, boolean z);
    }

    public interface e {
        void a(View view, DragEdge dragEdge, float f2, int i);
    }

    public interface f {
        boolean a(MotionEvent motionEvent);
    }

    class g extends GestureDetector.SimpleOnGestureListener {
        g() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (OSwipeLayout.this.s != null) {
                View E = OSwipeLayout.this.E();
                View G = OSwipeLayout.this.G();
                if (E == null || motionEvent.getX() <= E.getLeft() || motionEvent.getX() >= E.getRight() || motionEvent.getY() <= E.getTop() || motionEvent.getY() >= E.getBottom()) {
                    E = G;
                }
                OSwipeLayout.this.s.a(OSwipeLayout.this, E == G);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (OSwipeLayout.this.v && OSwipeLayout.this.H(motionEvent)) {
                OSwipeLayout.this.w();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    public interface h {
        void a(OSwipeLayout oSwipeLayout);

        void b(OSwipeLayout oSwipeLayout, int i, int i2);

        void c(OSwipeLayout oSwipeLayout);

        void d(OSwipeLayout oSwipeLayout);

        void e(OSwipeLayout oSwipeLayout);

        void f(OSwipeLayout oSwipeLayout, float f2, float f3);
    }

    public OSwipeLayout(Context context) {
        this(context, null);
    }

    private int B(float f2) {
        return (int) ((f2 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private AdapterView C() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(MotionEvent motionEvent) {
        View G = G();
        if (G == null) {
            return false;
        }
        if (this.f8051J == null) {
            this.f8051J = new Rect();
        }
        G.getHitRect(this.f8051J);
        return this.f8051J.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private void L() {
        Status F = F();
        List<View> D = D();
        if (F != Status.Close) {
            View E = E();
            if (E == null || E.getVisibility() == 0) {
                return;
            }
            E.setVisibility(0);
            return;
        }
        Iterator it2 = ((ArrayList) D).iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (view != null && view.getVisibility() != 4) {
                view.setVisibility(4);
            }
        }
    }

    private void M() {
        View E = E();
        if (E != null) {
            DragEdge dragEdge = this.h;
            if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                int measuredWidth = E.getMeasuredWidth();
                DragEdge dragEdge2 = this.h;
                this.j = measuredWidth - B(dragEdge2 != null ? this.m[dragEdge2.ordinal()] : 0.0f);
            } else {
                int measuredHeight = E.getMeasuredHeight();
                DragEdge dragEdge3 = this.h;
                this.j = measuredHeight - B(dragEdge3 != null ? this.m[dragEdge3.ordinal()] : 0.0f);
            }
        }
        ShowMode showMode = this.l;
        ShowMode showMode2 = ShowMode.PullOut;
        if (showMode == showMode2) {
            View G = G();
            Rect y = y(F() != Status.Close);
            if (G != null) {
                G.layout(y.left, y.top, y.right, y.bottom);
                bringChildToFront(G);
            }
            View E2 = E();
            Rect x = x(showMode2, y);
            if (E2 != null) {
                E2.layout(x.left, x.top, x.right, x.bottom);
            }
        } else {
            ShowMode showMode3 = ShowMode.LayDown;
            if (showMode == showMode3) {
                View G2 = G();
                Rect rect = this.r.get(G2);
                if (rect == null) {
                    rect = y(false);
                }
                if (G2 != null) {
                    G2.layout(rect.left, rect.top, rect.right, rect.bottom);
                    bringChildToFront(G2);
                }
                View E3 = E();
                Rect rect2 = this.r.get(E3);
                if (rect2 == null) {
                    rect2 = x(showMode3, rect);
                }
                if (E3 != null) {
                    E3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            }
        }
        L();
    }

    static Rect o(OSwipeLayout oSwipeLayout, DragEdge dragEdge) {
        int i;
        int measuredHeight;
        int paddingLeft = oSwipeLayout.getPaddingLeft();
        int paddingTop = oSwipeLayout.getPaddingTop();
        DragEdge dragEdge2 = DragEdge.Right;
        if (dragEdge == dragEdge2) {
            paddingLeft = oSwipeLayout.getMeasuredWidth() - oSwipeLayout.j;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = oSwipeLayout.getMeasuredHeight() - oSwipeLayout.j;
        }
        if (dragEdge == DragEdge.Left || dragEdge == dragEdge2) {
            i = oSwipeLayout.j + paddingLeft;
            measuredHeight = oSwipeLayout.getMeasuredHeight();
        } else {
            i = oSwipeLayout.getMeasuredWidth() + paddingLeft;
            measuredHeight = oSwipeLayout.j;
        }
        return new Rect(paddingLeft, paddingTop, i, measuredHeight + paddingTop);
    }

    static void p(OSwipeLayout oSwipeLayout) {
        View E = oSwipeLayout.E();
        if (oSwipeLayout.F() == Status.Close) {
            oSwipeLayout.r.remove(E);
            return;
        }
        View[] viewArr = {oSwipeLayout.G(), E};
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            Rect rect = oSwipeLayout.r.get(view);
            if (rect == null) {
                rect = new Rect();
                oSwipeLayout.r.put(view, rect);
            }
            rect.left = view.getLeft();
            rect.top = view.getTop();
            rect.right = view.getRight();
            rect.bottom = view.getBottom();
        }
    }

    static void q(OSwipeLayout oSwipeLayout) {
        AdapterView C;
        int positionForView;
        if (oSwipeLayout.F() != Status.Close || (C = oSwipeLayout.C()) == null || (positionForView = C.getPositionForView(oSwipeLayout)) == -1) {
            return;
        }
        C.performItemClick(C.getChildAt(positionForView - C.getFirstVisiblePosition()), positionForView, C.getAdapter().getItemId(positionForView));
    }

    static boolean r(OSwipeLayout oSwipeLayout) {
        AdapterView<?> C;
        int positionForView;
        boolean onItemLongClick;
        if (oSwipeLayout.F() != Status.Close || (C = oSwipeLayout.C()) == null || (positionForView = C.getPositionForView(oSwipeLayout)) == -1) {
            return false;
        }
        long itemIdAtPosition = C.getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", View.class, Integer.TYPE, Long.TYPE);
            declaredMethod.setAccessible(true);
            onItemLongClick = ((Boolean) declaredMethod.invoke(C, oSwipeLayout, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition))).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            onItemLongClick = C.getOnItemLongClickListener() != null ? C.getOnItemLongClickListener().onItemLongClick(C, oSwipeLayout, positionForView, itemIdAtPosition) : false;
            if (onItemLongClick) {
                C.performHapticFeedback(0);
            }
        }
        return onItemLongClick;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if ((r5 != null && r5.getParent() == r11 && r5 != G() && r11.u[0]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if ((r5 != null && r5.getParent() == r11 && r5 != G() && r11.u[1]) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeLayout.v(android.view.MotionEvent):void");
    }

    private Rect x(ShowMode showMode, Rect rect) {
        View E = E();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            DragEdge dragEdge = this.h;
            DragEdge dragEdge2 = DragEdge.Left;
            if (dragEdge == dragEdge2) {
                i -= this.j;
            } else if (dragEdge == DragEdge.Right) {
                i = i3;
            } else {
                i2 = dragEdge == DragEdge.Top ? i2 - this.j : i4;
            }
            if (dragEdge == dragEdge2 || dragEdge == DragEdge.Right) {
                i3 = (E != null ? E.getMeasuredWidth() : 0) + i;
            } else {
                i4 = i2 + (E != null ? E.getMeasuredHeight() : 0);
                i3 = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            DragEdge dragEdge3 = this.h;
            if (dragEdge3 == DragEdge.Left) {
                i3 = i + this.j;
            } else if (dragEdge3 == DragEdge.Right) {
                i = i3 - this.j;
            } else if (dragEdge3 == DragEdge.Top) {
                i4 = i2 + this.j;
            } else {
                i2 = i4 - this.j;
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    private Rect y(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            DragEdge dragEdge = this.h;
            if (dragEdge == DragEdge.Left) {
                paddingLeft = this.j + getPaddingLeft();
            } else if (dragEdge == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.j;
            } else if (dragEdge == DragEdge.Top) {
                paddingTop = this.j + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.j;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    protected void A(int i, int i2, int i3, int i4) {
        DragEdge dragEdge = this.h;
        boolean z = dragEdge != DragEdge.Left ? dragEdge != DragEdge.Right ? dragEdge != DragEdge.Top ? dragEdge != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0;
        L();
        Status F = F();
        if (this.n.isEmpty()) {
            return;
        }
        this.z++;
        for (h hVar : this.n) {
            if (this.z == 1) {
                if (z) {
                    hVar.e(this);
                } else {
                    hVar.a(this);
                }
            }
            hVar.b(this, i - getPaddingLeft(), i2 - getPaddingTop());
        }
        if (F == Status.Close) {
            Iterator<h> it2 = this.n.iterator();
            while (it2.hasNext()) {
                it2.next().c(this);
            }
            this.z = 0;
        }
        if (F == Status.Open) {
            View E = E();
            if (E != null) {
                E.setEnabled(true);
            }
            Iterator<h> it3 = this.n.iterator();
            while (it3.hasNext()) {
                it3.next().d(this);
            }
            this.z = 0;
        }
    }

    public List<View> D() {
        ArrayList arrayList = new ArrayList();
        DragEdge[] values = DragEdge.values();
        for (int i = 0; i < 4; i++) {
            arrayList.add(this.k.get(values[i]));
        }
        return arrayList;
    }

    public View E() {
        ArrayList arrayList = (ArrayList) D();
        if (this.h.ordinal() < arrayList.size()) {
            return (View) arrayList.get(this.h.ordinal());
        }
        return null;
    }

    public Status F() {
        View G = G();
        if (G == null) {
            return Status.Close;
        }
        int left = G.getLeft();
        int top = G.getTop();
        return (left == getPaddingLeft() && top == getPaddingTop()) ? Status.Close : (left == getPaddingLeft() - this.j || left == getPaddingLeft() + this.j || top == getPaddingTop() - this.j || top == getPaddingTop() + this.j) ? Status.Open : Status.Middle;
    }

    public View G() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    protected boolean I(Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        ShowMode showMode = this.l;
        if (showMode == ShowMode.LayDown) {
            int ordinal = dragEdge.ordinal();
            return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal == 3 && i4 > i7 && i4 <= i8 : i3 > i5 && i3 <= i6 : i2 >= i7 && i2 < i8 : i < i6 && i >= i5;
        }
        if (showMode != ShowMode.PullOut) {
            return false;
        }
        int ordinal2 = dragEdge.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 == 3 && i7 < getHeight() && i7 >= getPaddingTop() : i5 <= getWidth() && i6 > getWidth() : i7 < getPaddingTop() && i8 >= getPaddingTop() : i6 >= getPaddingLeft() && i5 < getPaddingLeft();
    }

    public void J() {
        View G = G();
        E();
        if (G == null) {
            return;
        }
        Rect y = y(true);
        this.i.smoothSlideViewTo(G, y.left, y.top);
        invalidate();
    }

    protected void K(float f2, float f3, boolean z) {
        float minVelocity = this.i.getMinVelocity();
        View G = G();
        DragEdge dragEdge = this.h;
        if (dragEdge == null || G == null) {
            return;
        }
        float f4 = z ? this.x : this.w;
        if (dragEdge == DragEdge.Left) {
            if (f2 > minVelocity) {
                J();
                return;
            }
            if (f2 < (-minVelocity)) {
                w();
                return;
            } else if ((G().getLeft() * 1.0f) / this.j > f4) {
                J();
                return;
            } else {
                w();
                return;
            }
        }
        if (dragEdge == DragEdge.Right) {
            if (f2 > minVelocity) {
                w();
                return;
            }
            if (f2 < (-minVelocity)) {
                J();
                return;
            } else if (((-G().getLeft()) * 1.0f) / this.j > f4) {
                J();
                return;
            } else {
                w();
                return;
            }
        }
        if (dragEdge == DragEdge.Top) {
            if (f3 > minVelocity) {
                J();
                return;
            }
            if (f3 < (-minVelocity)) {
                w();
                return;
            } else if ((G().getTop() * 1.0f) / this.j > f4) {
                J();
                return;
            } else {
                w();
                return;
            }
        }
        if (dragEdge == DragEdge.Bottom) {
            if (f3 > minVelocity) {
                w();
                return;
            }
            if (f3 < (-minVelocity)) {
                J();
            } else if (((-G().getTop()) * 1.0f) / this.j > f4) {
                J();
            } else {
                w();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        int i2 = 0;
        try {
            i2 = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (i2 <= 0) {
            Iterator<Map.Entry<DragEdge, View>> it2 = this.k.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<DragEdge, View> next = it2.next();
                if (next.getValue() == null) {
                    this.k.put(next.getKey(), view);
                    break;
                }
            }
        } else {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, ViewCompat.getLayoutDirection(this));
            if ((absoluteGravity & 3) == 3) {
                this.k.put(DragEdge.Left, view);
            }
            if ((absoluteGravity & 5) == 5) {
                this.k.put(DragEdge.Right, view);
            }
            if ((absoluteGravity & 48) == 48) {
                this.k.put(DragEdge.Top, view);
            }
            if ((absoluteGravity & 80) == 80) {
                this.k.put(DragEdge.Bottom, view);
            }
        }
        if (view.getParent() == this) {
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.i.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C() != null) {
            if (this.D == null) {
                setOnClickListener(new b());
            }
            if (this.E == null) {
                setOnLongClickListener(new c());
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!this.t) {
            return false;
        }
        if (this.v && F() == Status.Open && H(motionEvent)) {
            return true;
        }
        for (f fVar : this.o) {
            if (fVar != null && fVar.a(motionEvent)) {
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    boolean z = this.A;
                    v(motionEvent);
                    if (this.A && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!z && this.A) {
                        return false;
                    }
                } else if (action != 3) {
                    this.i.processTouchEvent(motionEvent);
                }
            }
            this.A = false;
            this.i.processTouchEvent(motionEvent);
        } else {
            this.i.processTouchEvent(motionEvent);
            this.A = false;
            this.B = motionEvent.getRawX();
            this.C = motionEvent.getRawY();
            if (F() == Status.Middle) {
                this.A = true;
            }
        }
        return this.A;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        M();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.t
            if (r0 != 0) goto L9
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L9:
            int r0 = r5.getActionMasked()
            android.view.GestureDetector r1 = r4.K
            r1.onTouchEvent(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L24
            r3 = 2
            if (r0 == r3) goto L3d
            r3 = 3
            if (r0 == r3) goto L24
            androidx.customview.widget.ViewDragHelper r3 = r4.i
            r3.processTouchEvent(r5)
            goto L50
        L24:
            r4.A = r1
            androidx.customview.widget.ViewDragHelper r3 = r4.i
            r3.processTouchEvent(r5)
            goto L50
        L2c:
            androidx.customview.widget.ViewDragHelper r3 = r4.i
            r3.processTouchEvent(r5)
            float r3 = r5.getRawX()
            r4.B = r3
            float r3 = r5.getRawY()
            r4.C = r3
        L3d:
            r4.v(r5)
            boolean r3 = r4.A
            if (r3 == 0) goto L50
            android.view.ViewParent r3 = r4.getParent()
            r3.requestDisallowInterceptTouchEvent(r2)
            androidx.customview.widget.ViewDragHelper r3 = r4.i
            r3.processTouchEvent(r5)
        L50:
            boolean r5 = super.onTouchEvent(r5)
            if (r5 != 0) goto L5c
            boolean r5 = r4.A
            if (r5 != 0) goto L5c
            if (r0 != 0) goto L5d
        L5c:
            r1 = r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.k).entrySet()) {
            if (entry.getValue() == view) {
                this.k.remove(entry.getKey());
            }
        }
    }

    public void setBottomSwipeEnabled(boolean z) {
        boolean[] zArr = this.u;
        DragEdge dragEdge = DragEdge.Bottom;
        zArr[3] = z;
    }

    @Deprecated
    public void setBottomViewIds(int i, int i2, int i3, int i4) {
        u(DragEdge.Left, findViewById(i), null);
        u(DragEdge.Right, findViewById(i2), null);
        u(DragEdge.Top, findViewById(i3), null);
        u(DragEdge.Bottom, findViewById(i4), null);
    }

    public void setClickToClose(boolean z) {
        this.v = z;
    }

    public void setDrag(DragEdge dragEdge, int i) {
        this.k.clear();
        u(dragEdge, findViewById(i), null);
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.j = B(i);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(DragEdge dragEdge) {
        this.k.clear();
        if (getChildCount() >= 2) {
            this.k.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        this.h = dragEdge;
        M();
    }

    @Deprecated
    public void setDragEdges(List<DragEdge> list) {
        this.k.clear();
        int min = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            this.k.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(L)) {
            this.h = L;
            M();
        } else {
            this.h = list.get(0);
            M();
        }
    }

    public void setLeftSwipeEnabled(boolean z) {
        boolean[] zArr = this.u;
        DragEdge dragEdge = DragEdge.Left;
        zArr[0] = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.D = onClickListener;
    }

    public void setOnDoubleClickListener(d dVar) {
        this.s = dVar;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.E = onLongClickListener;
    }

    public void setRightSwipeEnabled(boolean z) {
        boolean[] zArr = this.u;
        DragEdge dragEdge = DragEdge.Right;
        zArr[2] = z;
    }

    public void setShowMode(ShowMode showMode) {
        this.l = showMode;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z) {
        this.t = z;
    }

    public void setTopSwipeEnabled(boolean z) {
        boolean[] zArr = this.u;
        DragEdge dragEdge = DragEdge.Top;
        zArr[1] = z;
    }

    public void setWillOpenPercentAfterClose(float f2) {
        this.x = f2;
    }

    public void setWillOpenPercentAfterOpen(float f2) {
        this.w = f2;
    }

    public void u(DragEdge dragEdge, View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        if (!checkLayoutParams(generateDefaultLayoutParams)) {
            generateDefaultLayoutParams = generateLayoutParams(generateDefaultLayoutParams);
        }
        int i = -1;
        int ordinal = dragEdge.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else if (ordinal == 1) {
            i = 48;
        } else if (ordinal == 2) {
            i = 5;
        } else if (ordinal == 3) {
            i = 80;
        }
        if (generateDefaultLayoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) generateDefaultLayoutParams).gravity = i;
        }
        addView(view, 0, generateDefaultLayoutParams);
    }

    public void w() {
        if (G() == null) {
            return;
        }
        this.i.smoothSlideViewTo(G(), getPaddingLeft(), getPaddingTop());
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x001d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void z(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.swipeaction.OSwipeLayout.z(int, int, int, int):void");
    }

    public OSwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = L;
        this.j = 0;
        this.k = new LinkedHashMap<>();
        this.m = new float[4];
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new HashMap();
        this.q = new HashMap();
        this.r = new HashMap();
        this.t = true;
        this.u = new boolean[]{true, true, true, true};
        this.v = false;
        this.w = 0.75f;
        this.x = 0.25f;
        this.y = new a();
        this.z = 0;
        this.B = -1.0f;
        this.C = -1.0f;
        this.K = new GestureDetector(getContext(), new g());
        this.i = ViewDragHelper.create(this, this.y);
        this.f8052g = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.f9963J);
        int i2 = obtainStyledAttributes.getInt(2, 2);
        float[] fArr = this.m;
        DragEdge dragEdge = DragEdge.Left;
        fArr[0] = obtainStyledAttributes.getDimension(3, 0.0f);
        float[] fArr2 = this.m;
        DragEdge dragEdge2 = DragEdge.Right;
        fArr2[2] = obtainStyledAttributes.getDimension(4, 0.0f);
        float[] fArr3 = this.m;
        DragEdge dragEdge3 = DragEdge.Top;
        fArr3[1] = obtainStyledAttributes.getDimension(6, 0.0f);
        float[] fArr4 = this.m;
        DragEdge dragEdge4 = DragEdge.Bottom;
        fArr4[3] = obtainStyledAttributes.getDimension(0, 0.0f);
        setClickToClose(obtainStyledAttributes.getBoolean(1, this.v));
        if ((i2 & 1) == 1) {
            this.k.put(dragEdge, null);
        }
        if ((i2 & 4) == 4) {
            this.k.put(dragEdge3, null);
        }
        if ((i2 & 2) == 2) {
            this.k.put(dragEdge2, null);
        }
        if ((i2 & 8) == 8) {
            this.k.put(dragEdge4, null);
        }
        ShowMode showMode = ShowMode.PullOut;
        this.l = ShowMode.values()[obtainStyledAttributes.getInt(5, 1)];
        obtainStyledAttributes.recycle();
    }

    public void setDrag(DragEdge dragEdge, View view) {
        this.k.clear();
        u(dragEdge, view, null);
    }

    @Deprecated
    public void setDragEdges(DragEdge... dragEdgeArr) {
        this.k.clear();
        setDragEdges(Arrays.asList(dragEdgeArr));
    }
}
