package com.obric.oui.common.util;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import java.util.Iterator;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {

    static final class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7700d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7701e;

        a(View view, int i, int i2, boolean z, ViewGroup viewGroup) {
            this.a = view;
            this.b = i;
            this.f7699c = i2;
            this.f7700d = z;
            this.f7701e = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect = new Rect();
            this.a.getHitRect(rect);
            int width = (this.b - rect.width()) / 2;
            int height = (this.f7699c - rect.height()) / 2;
            if (width < 0 && !this.f7700d) {
                width = 0;
            }
            if (height < 0 && !this.f7700d) {
                height = 0;
            }
            rect.left -= width;
            rect.top -= height;
            rect.right += width;
            rect.bottom += height;
            this.f7701e.setTouchDelegate(new TouchDelegate(rect, this.a));
        }
    }

    /* renamed from: com.obric.oui.common.util.b$b, reason: collision with other inner class name */
    static final class RunnableC0358b implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ View[] b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7703d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.obric.oui.common.util.a f7704e;

        RunnableC0358b(View view, View[] viewArr, int i, int i2, com.obric.oui.common.util.a aVar) {
            this.a = view;
            this.b = viewArr;
            this.f7702c = i;
            this.f7703d = i2;
            this.f7704e = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View[] viewArr = this.b;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View view = viewArr[i];
                i++;
                Rect rect = new Rect();
                view.getHitRect(rect);
                int width = (this.f7702c - rect.width()) / 2;
                int height = (this.f7703d - rect.height()) / 2;
                if (width < 0) {
                    width = 0;
                }
                if (height < 0) {
                    height = 0;
                }
                rect.left -= width;
                rect.top -= height;
                rect.right += width;
                rect.bottom += height;
                this.f7704e.a(new TouchDelegate(rect, view));
            }
            this.a.setTouchDelegate(this.f7704e);
        }
    }

    public static final void a(View view, int i) {
        l.f(view, "$this$expandTouchArea");
        c(view, i, i, false, 4);
    }

    public static final void b(View view, int i, int i2, boolean z) {
        ViewGroup viewGroup;
        l.f(view, "$this$expandTouchArea");
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.post(new a(view, i, i2, z, viewGroup));
        }
    }

    public static /* synthetic */ void c(View view, int i, int i2, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        b(view, i, i2, z);
    }

    public static final void d(View view, int i, int i2, View... viewArr) {
        l.f(view, "$this$increaseHitAreaForViews");
        l.f(viewArr, "views");
        view.post(new RunnableC0358b(view, viewArr, i, i2, new com.obric.oui.common.util.a(view, null, 2)));
    }

    public static final boolean e(View view) {
        l.f(view, "$this$isVisibile");
        return view.getVisibility() == 0;
    }

    public static final void f(View view) {
        l.f(view, "$this$makeGone");
        view.setVisibility(8);
    }

    public static final void g(View view) {
        l.f(view, "$this$makeVisible");
        view.setVisibility(0);
    }

    public static final void h(ViewGroup viewGroup, boolean z) {
        l.f(viewGroup, "$this$setEnable");
        viewGroup.setEnabled(z);
        Iterator<View> it2 = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it2.hasNext()) {
            it2.next().setEnabled(z);
        }
    }

    public static final void i(View view, boolean z) {
        l.f(view, "$this$setVisibility");
        if (z) {
            g(view);
        } else {
            f(view);
        }
    }
}
