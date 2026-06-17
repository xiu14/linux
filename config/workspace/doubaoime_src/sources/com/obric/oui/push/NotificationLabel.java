package com.obric.oui.push;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.ViewGroupUtils;
import androidx.core.app.NotificationCompat;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class NotificationLabel extends CardView {
    private final String a;
    private ViewGroup b;

    /* renamed from: c, reason: collision with root package name */
    private ViewDragHelper f7958c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7959d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7960e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnClickListener f7961f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewDragHelper.Callback f7962g;
    private boolean h;
    private final ArrayList<a> i;

    public interface a {
        void a();

        void b();
    }

    public NotificationLabel(Context context) {
        this(context, null, 0);
    }

    public final String b() {
        return this.a;
    }

    public final ViewDragHelper c() {
        return this.f7958c;
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.f7958c;
        if (viewDragHelper != null) {
            l.c(viewDragHelper);
            if (viewDragHelper.continueSettling(true)) {
                Log.d(this.a, "scrolling");
                invalidate();
                return;
            }
            Log.d(this.a, "settled");
            if (this.f7959d) {
                this.f7959d = false;
                Log.i(this.a, "onDrag dismiss");
                Iterator<T> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a();
                }
                return;
            }
            if (this.f7960e) {
                this.f7960e = false;
                Log.i(this.a, "onDrag open");
                Iterator<T> it3 = this.i.iterator();
                while (it3.hasNext()) {
                    ((a) it3.next()).b();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        boolean z = this.h;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            l.f(this, "child");
            Rect rect = new Rect();
            ViewGroupUtils.getDescendantRect(this.b, this, rect);
            z = rect.contains(x, y);
            this.h = z;
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("intercept: ");
            M.append(this.h);
            Log.i(str, M.toString());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        if (!z) {
            return false;
        }
        ViewGroup viewGroup = this.b;
        if (this.f7958c == null && viewGroup != null) {
            this.f7958c = ViewDragHelper.create(viewGroup, 1.0f, this.f7962g);
        }
        ViewDragHelper viewDragHelper = this.f7958c;
        l.c(viewDragHelper);
        return viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        ViewDragHelper viewDragHelper = this.f7958c;
        if (viewDragHelper == null) {
            return false;
        }
        if (viewDragHelper == null) {
            return true;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    public final void setDismissSettling(boolean z) {
        this.f7959d = z;
    }

    public final void setInterceptingEvents(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7961f = onClickListener;
    }

    public final void setOpenSettling(boolean z) {
        this.f7960e = z;
    }

    public final void setParent(ViewGroup viewGroup) {
        this.b = viewGroup;
        if (this.f7958c != null || viewGroup == null) {
            return;
        }
        this.f7958c = ViewDragHelper.create(viewGroup, 1.0f, this.f7962g);
    }

    public final void setViewDragHelper(ViewDragHelper viewDragHelper) {
        this.f7958c = viewDragHelper;
    }

    public NotificationLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "NotificationLabel";
        this.f7962g = new ViewDragHelper.Callback() { // from class: com.obric.oui.push.NotificationLabel$dragCallback$1
            private final int a = -1;
            private int b = -1;

            /* renamed from: c, reason: collision with root package name */
            private int f7963c;

            /* renamed from: d, reason: collision with root package name */
            private int f7964d;

            /* renamed from: e, reason: collision with root package name */
            private long f7965e;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                l.f(view, "child");
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i3) {
                l.f(view, "child");
                return (int) ((i3 / (i3 < 0 ? 2.0f : 10.0f)) + view.getTop());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewCaptured(View view, int i2) {
                l.f(view, "capturedChild");
                this.b = i2;
                this.f7964d = view.getTop();
                this.f7963c = view.getLeft();
                this.f7965e = System.currentTimeMillis();
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00bc, code lost:
            
                if (r12 < (-50)) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00d6, code lost:
            
                r12 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
            
                if (java.lang.Math.abs(r12) >= e.a.a.a.a.e0("Resources.getSystem()", 1, 30)) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
            
                r11 = r9.f7966f.f7961f;
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(android.view.View r10, float r11, float r12) {
                /*
                    Method dump skipped, instructions count: 376
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.push.NotificationLabel$dragCallback$1.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                l.f(view, "child");
                int i3 = this.b;
                return i3 == this.a || i2 == i3;
            }
        };
        this.i = new ArrayList<>();
    }
}
