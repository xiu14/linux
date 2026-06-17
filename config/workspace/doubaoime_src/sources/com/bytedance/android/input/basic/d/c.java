package com.bytedance.android.input.basic.d;

import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.MarginLayoutParamsCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public static final class a implements View.OnLayoutChangeListener {
        final /* synthetic */ l<Rect, o> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Rect, o> lVar) {
            this.a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            int i11;
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i12 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i9 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                i11 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i10 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
                IAppGlobals.a aVar = IAppGlobals.a;
                StringBuilder O = e.a.a.a.a.O("marginLeft = ", i12, " marginTop = ", i11, " marginRight = ");
                e.a.a.a.a.F0(O, i9, " marginBottom = ", i10, " marginStart = ");
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                O.append(layoutParams5 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams5) : 0);
                O.append(" marginEnd = ");
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                O.append(layoutParams6 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams6) : 0);
                aVar.j("ImeViewUtils", O.toString());
                r11 = i12;
            } else {
                i9 = 0;
                i10 = 0;
                i11 = 0;
            }
            this.a.invoke(new Rect(i - r11, i2 - i11, i3 + i9, i4 + i10));
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;
        final /* synthetic */ kotlin.s.b.a<o> b;

        b(View view, kotlin.s.b.a<o> aVar) {
            this.a = view;
            this.b = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            IAppGlobals.a.j("ImeViewUtils", "onGlobalLayout");
            this.b.invoke();
        }
    }

    private c() {
    }

    public static void a(c cVar, View view, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i) {
        Object obj = null;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        if ((i & 32) != 0) {
            num5 = null;
        }
        if ((i & 64) != 0) {
            num6 = null;
        }
        if (view != null) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    if (num3 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = num3.intValue();
                    }
                    if (num4 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = num4.intValue();
                    }
                    if (num5 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = num5.intValue();
                    }
                    if (num6 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = num6.intValue();
                    }
                }
                if (num != null) {
                    layoutParams.width = num.intValue();
                }
                if (num2 != null) {
                    layoutParams.height = num2.intValue();
                }
                view.setLayoutParams(layoutParams);
                obj = o.a;
            } catch (Throwable th) {
                obj = r.J(th);
            }
        }
        Throwable b2 = kotlin.h.b(obj);
        if (b2 != null) {
            IAppGlobals.a.e("ImeViewUtils", "error = " + b2);
        }
    }

    public final void b(View view, l<? super Rect, o> lVar) {
        kotlin.s.c.l.f(view, "view");
        kotlin.s.c.l.f(lVar, "callback");
        if (!view.isLaidOut()) {
            view.addOnLayoutChangeListener(new a(lVar));
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("addOnLayoutChangeListener view.width = ");
            M.append(view.getWidth());
            M.append("---view.height = ");
            M.append(view.getHeight());
            aVar.j("ImeViewUtils", M.toString());
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        StringBuilder O = e.a.a.a.a.O("view.isLaidOut = true marginLeft = ", i, " marginTop = ", i2, " marginRight = ");
        e.a.a.a.a.F0(O, i3, " marginBottom = ", i4, " marginStart = ");
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        O.append(layoutParams5 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams5) : 0);
        O.append(" marginEnd = ");
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        O.append(layoutParams6 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams6) : 0);
        aVar2.j("ImeViewUtils", O.toString());
        lVar.invoke(new Rect(view.getLeft() - i, view.getTop() - i2, view.getRight() + i3, view.getBottom() + i4));
    }

    public final void c(View view, kotlin.s.b.a<o> aVar) {
        ViewTreeObserver viewTreeObserver;
        kotlin.s.c.l.f(aVar, "action");
        IAppGlobals.a aVar2 = IAppGlobals.a;
        StringBuilder M = e.a.a.a.a.M("registerOnGlobalLayoutChange view = null? ");
        M.append(view == null);
        M.append("--isMainThread = ");
        M.append(kotlin.s.c.l.a(Looper.getMainLooper(), Looper.myLooper()));
        aVar2.j("ImeViewUtils", M.toString());
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b(view, aVar));
    }
}
